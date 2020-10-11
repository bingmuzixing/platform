package com.bmzx.platform.core.infrastructure;

import com.alibaba.druid.support.logging.Resources;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class PlatformResources extends Object {
    private static ClassLoader defaultClassLoader;

    private PlatformResources(){
    }

    /**
     * Returns the default classloader (may be null).
     *
     * @return The default classloader
     */
    public static ClassLoader getDefaultClassLoader() {
        return defaultClassLoader;
    }

    /**
     * Sets the default classloader
     *
     * @param defaultClassLoader - the new default ClassLoader
     */
    public static void setDefaultClassLoader(ClassLoader defaultClassLoader) {
        PlatformResources.defaultClassLoader = defaultClassLoader;
    }

    /**
     * Loads a class
     *
     * @param className - the class to load
     * @return The loaded class
     * @throws ClassNotFoundException If the class cannot be found (duh!)
     */
    public static Class<?> classForName(String className) throws ClassNotFoundException {
        Class<?> clazz = null;
        try {
            clazz = getClassLoader().loadClass(className);
        } catch (Exception e) {
            // Ignore. Failsafe below.
        }
        if (clazz == null) {
            clazz = Class.forName(className);
        }
        return clazz;
    }

    private static ClassLoader getClassLoader() {
        if (defaultClassLoader != null) {
            return defaultClassLoader;
        } else {
            return Thread.currentThread().getContextClassLoader();
        }
    }


    public static int to(Object obj, int def) {
        if (obj != null) {
            if (obj instanceof Integer) {
                return (Integer)obj;
            } else if (obj instanceof Number) {
                return ((Number)obj).intValue();
            } else if (obj instanceof Boolean) {
                return (Boolean)obj ? 1 : 0;
            } else if (obj instanceof Date) {
                return (int)((Date)obj).getTime();
            } else {
                try {
                    return Integer.parseInt(obj.toString());
                } catch (Exception var5) {
                    try {
                        return (new Double(Double.parseDouble(obj.toString()))).intValue();
                    } catch (Exception var4) {
                        return def;
                    }
                }
            }
        } else {
            return def;
        }
    }

    public static long to(Object obj, long def) {
        if (obj != null) {
            if (obj instanceof Long) {
                return (Long)obj;
            } else if (obj instanceof Number) {
                return ((Number)obj).longValue();
            } else if (obj instanceof Boolean) {
                return (Boolean)obj ? 1L : 0L;
            } else if (obj instanceof Date) {
                return ((Date)obj).getTime();
            } else {
                try {
                    return Long.parseLong(obj.toString());
                } catch (Exception var6) {
                    try {
                        return (new Double(Double.parseDouble(obj.toString()))).longValue();
                    } catch (Exception var5) {
                        return def;
                    }
                }
            }
        } else {
            return def;
        }
    }


    public static double to(Object obj, double def) {
        if (obj != null) {
            if (obj instanceof Double) {
                return (Double)obj;
            } else if (obj instanceof Float) {
                return ((Float)obj).doubleValue();
            } else if (obj instanceof Number) {
                return ((Number)obj).doubleValue();
            } else if (obj instanceof Boolean) {
                return (Boolean)obj ? 1.0D : 0.0D;
            } else if (obj instanceof Date) {
                return (double)((Date)obj).getTime();
            } else {
                try {
                    return Double.parseDouble(obj.toString());
                } catch (Exception var4) {
                    return def;
                }
            }
        } else {
            return def;
        }
    }
    public static boolean to(Object obj, boolean def) {
        if (obj != null) {
            if (obj instanceof Boolean) {
                return (Boolean)obj;
            } else if (obj instanceof Integer) {
                return (Integer)obj == 1;
            } else if (obj instanceof Long) {
                return (Long)obj == 1L;
            } else if (obj instanceof Double) {
                return (Double)obj == 1.0D;
            } else if (obj instanceof Date) {
                return ((Date)obj).getTime() == 1L;
            } else {
                String str = obj.toString().toUpperCase();
                return str.equalsIgnoreCase("TRUE") || str.equalsIgnoreCase("YES") || str.equals("1");
            }
        } else {
            return def;
        }
    }
    public static String to(Object obj, String def) {
        return obj != null ? obj.toString() : def;
    }
    public static <T> T[] arrayAppend(T[]... arrays) {
        int size = 0;
        Object[][] var2 = arrays;
        int pos = arrays.length;

        for(int index = 0; index < pos; ++index) {
            T[] arr = (T[]) var2[index];
            size += arr.length;
        }

        T[] copy = (T[])(new Object[size]);
        pos = 0;
        Object[][] var9 = arrays;
        int var10 = arrays.length;

        for(int index = 0; index < var10; ++index) {
            T[] arr = (T[])var9[index];
            System.arraycopy(arr, 0, copy, pos, arr.length);
            pos = arr.length;
        }

        return copy;
    }
    public static List<Object> asList(Object... values) {
        List<Object> list = new ArrayList();
        Collections.addAll(list, values);
        return list;
    }

    public static <T> T[] convertArray(Class<T> targetType, Object[] arrayObjects) {
        if (targetType == null) {
            return (T[]) arrayObjects;
        }
        if (arrayObjects == null) {
            return null;
        }
        T[] targetArray = (T[]) Array.newInstance(targetType, arrayObjects.length);
        try {
            System.arraycopy(arrayObjects, 0, targetArray, 0, arrayObjects.length);
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        }
        return targetArray;
    }
    }
