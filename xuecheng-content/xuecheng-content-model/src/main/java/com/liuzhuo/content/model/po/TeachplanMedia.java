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
 * @TableName teachplan_media
 */
@TableName(value ="teachplan_media")
@Data
public class TeachplanMedia implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 媒资文件id
     */
    @TableField(value = "media_id")
    private String mediaId;

    /**
     * 课程计划标识
     */
    @TableField(value = "teachplan_id")
    private Long teachplanId;

    /**
     * 课程标识
     */
    @TableField(value = "course_id")
    private Long courseId;

    /**
     * 媒资文件原始名称
     */
    @TableField(value = "media_fileName")
    private String mediaFilename;

    /**
     * 
     */
    @TableField(value = "create_date")
    private Date createDate;

    /**
     * 创建人
     */
    @TableField(value = "create_people")
    private String createPeople;

    /**
     * 修改人
     */
    @TableField(value = "change_people")
    private String changePeople;

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
        TeachplanMedia other = (TeachplanMedia) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMediaId() == null ? other.getMediaId() == null : this.getMediaId().equals(other.getMediaId()))
            && (this.getTeachplanId() == null ? other.getTeachplanId() == null : this.getTeachplanId().equals(other.getTeachplanId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getMediaFilename() == null ? other.getMediaFilename() == null : this.getMediaFilename().equals(other.getMediaFilename()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreatePeople() == null ? other.getCreatePeople() == null : this.getCreatePeople().equals(other.getCreatePeople()))
            && (this.getChangePeople() == null ? other.getChangePeople() == null : this.getChangePeople().equals(other.getChangePeople()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMediaId() == null) ? 0 : getMediaId().hashCode());
        result = prime * result + ((getTeachplanId() == null) ? 0 : getTeachplanId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getMediaFilename() == null) ? 0 : getMediaFilename().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCreatePeople() == null) ? 0 : getCreatePeople().hashCode());
        result = prime * result + ((getChangePeople() == null) ? 0 : getChangePeople().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mediaId=").append(mediaId);
        sb.append(", teachplanId=").append(teachplanId);
        sb.append(", courseId=").append(courseId);
        sb.append(", mediaFilename=").append(mediaFilename);
        sb.append(", createDate=").append(createDate);
        sb.append(", createPeople=").append(createPeople);
        sb.append(", changePeople=").append(changePeople);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}