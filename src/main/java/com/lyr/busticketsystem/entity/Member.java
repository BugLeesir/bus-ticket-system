package com.lyr.busticketsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 会员信息表
 * @author yunruili
 * @TableName member
 */
@TableName(value ="member")
@Data
public class Member implements Serializable {
    /**
     * 会员ID（主键）
     */
    @TableId(value = "member_id", type = IdType.AUTO)
    private Integer memberId;

    /**
     * 关联用户ID
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 会员注册时间
     */
    @TableField(value = "register_date")
    private LocalDateTime registerDate;

    /**
     * 会员状态（激活/未激活）
     */
    @TableField(value = "status")
    private Object status;

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
        Member other = (Member) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRegisterDate() == null ? other.getRegisterDate() == null : this.getRegisterDate().equals(other.getRegisterDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRegisterDate() == null) ? 0 : getRegisterDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberId=").append(memberId);
        sb.append(", userId=").append(userId);
        sb.append(", registerDate=").append(registerDate);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}