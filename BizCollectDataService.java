package com.zhubajie.ad.share.api.service;

import com.zhubajie.ad.share.api.dto.request.ReqCollectCommonDto;
import com.zhubajie.ad.share.api.dto.request.ReqCollectDataDto;
import com.zhubajie.ad.share.api.dto.request.ReqCollectNewDataDto;
import com.zhubajie.ad.share.api.dto.request.ReqCollectRecordDto;
import com.zhubajie.ad.share.api.dto.request.ReqJsConsumeDto;
import com.zhubajie.ad.share.api.dto.request.ReqJsRechargeDto;
import com.zhubajie.ad.share.api.dto.request.ReqMarkCompleteDto;
import com.zhubajie.ad.share.api.dto.request.ReqSendEmaildto;
import com.zhubajie.ad.share.api.dto.request.ReqSignRefundDto;
import com.zhubajie.common.dto.Request;
import com.zhubajie.common.dto.Result;

/**
 *  ERP 采集数据相关服务
 *  @title ERP 采集数据相关服务
 *  @author aoting
 *  @date 2017/11/3
 *  @since 1.0.1
 */
public interface BizCollectDataService {

    /**
     *  ERP 业务方系统数据采集接口（不包含金石平台）
     *  @title ERP 业务方系统数据采集接口（不包含金石平台）
     *  @author aoting
     *  @date 2017/11/3
     *  @since 1.0.1
     */
    Result<Boolean> collectBizData(Request<ReqCollectDataDto<ReqCollectRecordDto>> request);

    /**
     * ERP 业务方系统数据采集接口4（不包含金石平台）
     *
     * @param request
     * @return
     * @title ERP 业务方系统数据采集接口4（不包含金石平台）
     * @date 2019/02/22
     */
    Result<Boolean> collectBizData4New(Request<ReqCollectDataDto<ReqCollectNewDataDto>> request);

    /**
     *  ERP 金石平台充值数据采集接口
     *  @title ERP 金石平台充值数据采集接口
     *  @author aoting
     *  @date 2017/11/3
     *  @since 1.0.1
     */
    Result<Boolean> collectJsRechargeData(Request<ReqJsRechargeDto> request);

    /**
     *  ERP 金石平台消耗数据采集接口
     *  @title ERP 金石平台消耗数据采集接口
     *  @author aoting
     *  @date 2017/11/3
     *  @since 1.0.1
     */
    Result<Boolean> collectJsConsumeData(Request<ReqJsConsumeDto> request);

    /**
     *  ERP 标识业务系统数据采集完成
     *  @title ERP 标识业务系统数据采集完成
     *  @author aoting
     *  @date 2017/11/3
     *  @since 1.0.1
     */
    Result<Boolean> markCompleteCollect(Request<ReqMarkCompleteDto> request);


    /**
     *  ERP 广告接口平台发送异常邮件通知
     *  @title ERP 广告接口平台发送异常邮件通知
     *  @author aoting
     *  @date 2017/11/3
     *  @since 1.0.1
     */
    Result<Boolean> sendNoticeEmail(Request<ReqSendEmaildto> request);

    /**
     *  ERP 签单退款采集
     *  @title ERP 签单退款采集
     *  @author aoting
     *  @date 2018/03/22
     *  @since 1.0.5
     */
    Result<Boolean> collectSignOrderRefund(Request<ReqSignRefundDto> request);

    /**
     *  ERP 通用采集方法，按业务模式（线上CPC/CPT、线下CPC/CPT）
     *  @title ERP 通用采集方法，按业务模式（线上CPC/CPT、线下CPC/CPT）
     *  @author aoting
     *  @date 2018/05/21
     *  @since 1.0.10
     */
    Result<Boolean> collectCommonData(Request<ReqCollectDataDto<ReqCollectCommonDto>> request);


}
