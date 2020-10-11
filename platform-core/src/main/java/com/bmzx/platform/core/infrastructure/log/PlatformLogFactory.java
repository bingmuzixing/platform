package com.bmzx.platform.core.infrastructure.log;



import com.bmzx.platform.core.infrastructure.PlatformResources;
import org.apache.log4j.Logger;

import java.lang.reflect.Constructor;

/**
 * 对外的日志工厂
 */
public class PlatformLogFactory {

    //定义类的具体实现类
    private static Constructor logConstructor;

    private static final Logger logger=Logger.getLogger(PlatformLogFactory.class);
    static {
        tryImplementation("com.bmzx.platform.core.infrastructure.log.PlatformLog4jImpl");
    }


      private static void tryImplementation(String implClassName) {
        if(logConstructor!=null){
            return ;
        }
          try {

              Class implClass = PlatformResources.classForName(implClassName);
              logConstructor = implClass.getConstructor(new Class[] { String.class });

              Class<?> declareClass = logConstructor.getDeclaringClass();
              if (!PlatformLog.class.isAssignableFrom(declareClass)) {
                  logConstructor = null;
              }

              try {
                  if (null != logConstructor) {
                      logConstructor.newInstance(PlatformLogFactory.class.getName());
                  }
              } catch (Throwable t) {
                  logConstructor = null;
              }

          } catch (Throwable t) {
              // skip
          }
      }
    /**
     * 进入审计日志
     * @param logBean
     * @param clazz
     */
   public static void auditLog(PlatformLogBean logBean,Class clazz){

   }


    public static PlatformLog getLog(Class clazz) {
        return getLog(clazz.getName());
    }

    public static PlatformLog getLog(String loggerName) {
        try {
            return (PlatformLog) logConstructor.newInstance(loggerName);
        } catch (Throwable t) {
            throw new RuntimeException("Error creating logger for logger '" + loggerName + "'.  Cause: " + t, t);
        }
    }


}
