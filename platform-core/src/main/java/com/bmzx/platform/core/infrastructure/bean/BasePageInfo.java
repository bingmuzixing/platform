package com.bmzx.platform.core.infrastructure.bean;



public class BasePageInfo   {

    private int totalContentNum=0;// 总内容数
    private int totalPageNum=0; // 总页数
    private int curPage=1; // 当前页码，0序

    private int pageSize=30;

    public int getTotalContentNum() {
        return totalContentNum;
    }

    public void setTotalContentNum(int totalContentNum) {
        this.totalContentNum = totalContentNum;
    }

    public int getTotalPageNum() {
        return totalPageNum;
    }

    public void setTotalPageNum(int totalPageNum) {
        this.totalPageNum = totalPageNum;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
