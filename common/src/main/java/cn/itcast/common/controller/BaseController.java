package cn.itcast.common.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tmh0214 on 17/6/22.
 */
public class BaseController {

    /**
     * code 0  成功
     *      data    Json数据
     * code -1 失败
     *      message 错误提示信息
     */

    /**
     * 成功 【数据】
     * @param data
     * @return
     */
    public Map<String, Object> success(Object data){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 0);
        result.put("data", data);
        return result;
    }

    /**
     * 成功 【无数据】
     * @return
     */
    public Map<String, Object> success(){
        return success(null);
    }

    /**
     * 失败   【数据】
     * @param data
     * @return
     */
    public Map<String, Object> fail(Object data){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", -1);
        result.put("message", data);
        return result;
    }

    /**
     * 失败   【无数据】
     * @return
     */
    public Map<String, Object> fail(){
        return success(null);
    }



}
