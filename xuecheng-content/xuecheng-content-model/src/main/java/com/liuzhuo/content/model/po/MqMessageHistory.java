package com.liuzhuo.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName mq_message_history
 */
@TableName(value ="mq_message_history")
@Data
public class MqMessageHistory implements Serializable {
    /**
     * 消息id
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 消息类型代码
     */
    @TableField(value = "message_type")
    private String messageType;

    /**
     * 关联业务信息
     */
    @TableField(value = "business_key1")
    private String businessKey1;

    /**
     * 关联业务信息
     */
    @TableField(value = "business_key2")
    private String businessKey2;

    /**
     * 关联业务信息
     */
    @TableField(value = "business_key3")
    private String businessKey3;

    /**
     * 通知次数
     */
    @TableField(value = "execute_num")
    private Object executeNum;

    /**
     * 处理状态，0:初始，1:成功，2:失败
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 回复失败时间
     */
    @TableField(value = "returnfailure_date")
    private Date returnfailureDate;

    /**
     * 回复成功时间
     */
    @TableField(value = "returnsuccess_date")
    private Date returnsuccessDate;

    /**
     * 回复失败内容
     */
    @TableField(value = "returnfailure_msg")
    private String returnfailureMsg;

    /**
     * 最近通知时间
     */
    @TableField(value = "execute_date")
    private Date executeDate;

    /**
     * 
     */
    @TableField(value = "stage_state1")
    private String stageState1;

    /**
     * 
     */
    @TableField(value = "stage_state2")
    private String stageState2;

    /**
     * 
     */
    @TableField(value = "stage_state3")
    private String stageState3;

    /**
     * 
     */
    @TableField(value = "stage_state4")
    private String stageState4;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MqMessageHistory other = (MqMessageHistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMessageType() == null ? other.getMessageType() == null : this.getMessageType().equals(other.getMessageType()))
            && (this.getBusinessKey1() == null ? other.getBusinessKey1() == null : this.getBusinessKey1().equals(other.getBusinessKey1()))
            && (this.getBusinessKey2() == null ? other.getBusinessKey2() == null : this.getBusinessKey2().equals(other.getBusinessKey2()))
            && (this.getBusinessKey3() == null ? other.getBusinessKey3() == null : this.getBusinessKey3().equals(other.getBusinessKey3()))
            && (this.getExecuteNum() == null ? other.getExecuteNum() == null : this.getExecuteNum().equals(other.getExecuteNum()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getReturnfailureDate() == null ? other.getReturnfailureDate() == null : this.getReturnfailureDate().equals(other.getReturnfailureDate()))
            && (this.getReturnsuccessDate() == null ? other.getReturnsuccessDate() == null : this.getReturnsuccessDate().equals(other.getReturnsuccessDate()))
            && (this.getReturnfailureMsg() == null ? other.getReturnfailureMsg() == null : this.getReturnfailureMsg().equals(other.getReturnfailureMsg()))
            && (this.getExecuteDate() == null ? other.getExecuteDate() == null : this.getExecuteDate().equals(other.getExecuteDate()))
            && (this.getStageState1() == null ? other.getStageState1() == null : this.getStageState1().equals(other.getStageState1()))
            && (this.getStageState2() == null ? other.getStageState2() == null : this.getStageState2().equals(other.getStageState2()))
            && (this.getStageState3() == null ? other.getStageState3() == null : this.getStageState3().equals(other.getStageState3()))
            && (this.getStageState4() == null ? other.getStageState4() == null : this.getStageState4().equals(other.getStageState4()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        result = prime * result + ((getBusinessKey1() == null) ? 0 : getBusinessKey1().hashCode());
        result = prime * result + ((getBusinessKey2() == null) ? 0 : getBusinessKey2().hashCode());
        result = prime * result + ((getBusinessKey3() == null) ? 0 : getBusinessKey3().hashCode());
        result = prime * result + ((getExecuteNum() == null) ? 0 : getExecuteNum().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getReturnfailureDate() == null) ? 0 : getReturnfailureDate().hashCode());
        result = prime * result + ((getReturnsuccessDate() == null) ? 0 : getReturnsuccessDate().hashCode());
        result = prime * result + ((getReturnfailureMsg() == null) ? 0 : getReturnfailureMsg().hashCode());
        result = prime * result + ((getExecuteDate() == null) ? 0 : getExecuteDate().hashCode());
        result = prime * result + ((getStageState1() == null) ? 0 : getStageState1().hashCode());
        result = prime * result + ((getStageState2() == null) ? 0 : getStageState2().hashCode());
        result = prime * result + ((getStageState3() == null) ? 0 : getStageState3().hashCode());
        result = prime * result + ((getStageState4() == null) ? 0 : getStageState4().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", messageType=").append(messageType);
        sb.append(", businessKey1=").append(businessKey1);
        sb.append(", businessKey2=").append(businessKey2);
        sb.append(", businessKey3=").append(businessKey3);
        sb.append(", executeNum=").append(executeNum);
        sb.append(", state=").append(state);
        sb.append(", returnfailureDate=").append(returnfailureDate);
        sb.append(", returnsuccessDate=").append(returnsuccessDate);
        sb.append(", returnfailureMsg=").append(returnfailureMsg);
        sb.append(", executeDate=").append(executeDate);
        sb.append(", stageState1=").append(stageState1);
        sb.append(", stageState2=").append(stageState2);
        sb.append(", stageState3=").append(stageState3);
        sb.append(", stageState4=").append(stageState4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}