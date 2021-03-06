package com.linkwechat.wecom.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.linkwechat.wecom.domain.WeCustomerMessageOriginal;
import com.linkwechat.wecom.domain.vo.CustomerMessagePushVo;

import java.util.List;

/**
 * 群发消息 原始数据信息表 we_customer_messageOriginal
 *
 * @author kewen
 * @date 2020-12-12
 */
public interface IWeCustomerMessageOriginalService extends IService<WeCustomerMessageOriginal> {
    /**
     * 保存原始数据信息
     * @param weCustomerMessageOriginal 原始数据信息
     * @return
     */
    int saveWeCustomerMessageOriginal(WeCustomerMessageOriginal weCustomerMessageOriginal);

    /**
     * 群发消息列表
     *
     * @param sender 创建人
     * @param content 内容
     * @param pushType 群发类型
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return {@link CustomerMessagePushVo}s
     */
    List<CustomerMessagePushVo> customerMessagePushs(String sender,String content,String pushType,String beginTime,String endTime);

    /**
     * 群发详情
     * @param messageId 微信群发id
     * @return {@link CustomerMessagePushVo} 群发详情
     */
    CustomerMessagePushVo CustomerMessagePushDetail(Long messageId);

}
