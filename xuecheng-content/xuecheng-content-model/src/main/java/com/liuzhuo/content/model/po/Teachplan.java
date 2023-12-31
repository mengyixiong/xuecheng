package com.liuzhuo.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 课程计划
 * @TableName teachplan
 */
@TableName(value ="teachplan")
@Data
public class Teachplan implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 课程计划名称
     */
    @TableField(value = "pname")
    private String pname;

    /**
     * 课程计划父级Id
     */
    @TableField(value = "parentid")
    private Long parentid;

    /**
     * 层级，分为1、2、3级
     */
    @TableField(value = "grade")
    private Integer grade;

    /**
     * 课程类型:1视频、2文档
     */
    @TableField(value = "media_type")
    private String mediaType;

    /**
     * 开始直播时间
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 直播结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 章节及课程时介绍
     */
    @TableField(value = "description")
    private String description;

    /**
     * 时长，单位时:分:秒
     */
    @TableField(value = "timelength")
    private String timelength;

    /**
     * 排序字段
     */
    @TableField(value = "orderby")
    private Integer orderby;

    /**
     * 课程标识
     */
    @TableField(value = "course_id")
    private Long courseId;

    /**
     * 课程发布标识
     */
    @TableField(value = "course_pub_id")
    private Long coursePubId;

    /**
     * 状态（1正常  0删除）
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 是否支持试学或预览（试看）
     */
    @TableField(value = "is_preview")
    private String isPreview;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @TableField(value = "change_date")
    private Date changeDate;

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
        Teachplan other = (Teachplan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPname() == null ? other.getPname() == null : this.getPname().equals(other.getPname()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getMediaType() == null ? other.getMediaType() == null : this.getMediaType().equals(other.getMediaType()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getTimelength() == null ? other.getTimelength() == null : this.getTimelength().equals(other.getTimelength()))
            && (this.getOrderby() == null ? other.getOrderby() == null : this.getOrderby().equals(other.getOrderby()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getCoursePubId() == null ? other.getCoursePubId() == null : this.getCoursePubId().equals(other.getCoursePubId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsPreview() == null ? other.getIsPreview() == null : this.getIsPreview().equals(other.getIsPreview()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getChangeDate() == null ? other.getChangeDate() == null : this.getChangeDate().equals(other.getChangeDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPname() == null) ? 0 : getPname().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getTimelength() == null) ? 0 : getTimelength().hashCode());
        result = prime * result + ((getOrderby() == null) ? 0 : getOrderby().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getCoursePubId() == null) ? 0 : getCoursePubId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsPreview() == null) ? 0 : getIsPreview().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getChangeDate() == null) ? 0 : getChangeDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pname=").append(pname);
        sb.append(", parentid=").append(parentid);
        sb.append(", grade=").append(grade);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", description=").append(description);
        sb.append(", timelength=").append(timelength);
        sb.append(", orderby=").append(orderby);
        sb.append(", courseId=").append(courseId);
        sb.append(", coursePubId=").append(coursePubId);
        sb.append(", status=").append(status);
        sb.append(", isPreview=").append(isPreview);
        sb.append(", createDate=").append(createDate);
        sb.append(", changeDate=").append(changeDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}