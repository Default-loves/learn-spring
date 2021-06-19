package com.junyi.util;

/**
 * @time: 2021/5/27 15:30
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class DateTimeUtil {

    /**
     * 将秒计算为XX天XX时XX分XX秒
     * @param second
     * @return
     */
    public static String secondToPretty(Integer second) {
        String dateTimes;
        long days = second / (60 * 60 * 24);
        long hours = (second % (60 * 60 * 24)) / (60 * 60);
        long minutes = (second % (60 * 60)) / 60;
        long seconds = second % 60;
        if (days > 0) {
            dateTimes = days + "天 " + hours + "时 " + minutes + "分 " + seconds + "秒";
        } else if (hours > 0) {
            dateTimes = hours + "时 " + minutes + "分 " + seconds + "秒";
        } else if (minutes > 0) {
            dateTimes = minutes + "分 " + seconds + "秒";
        } else {
            dateTimes = seconds + " 秒";
        }
        return dateTimes;
    }
}
