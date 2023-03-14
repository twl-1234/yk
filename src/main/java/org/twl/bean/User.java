package org.twl.bean;

import lombok.Data;

@Data
public class User {
    public String nickName;
    public String mobileNumber;
    public Integer id;
    public String password;
    public Integer addressId;

    public String createTime;
    public Integer orderId;
    public Integer chatId;
    public Integer state;
    public Integer isOnline;

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", addressId=" + addressId +
                ", createTime='" + createTime + '\'' +
                ", orderId=" + orderId +
                ", chatId=" + chatId +
                ", state=" + state +
                ", isOnline=" + isOnline +
                '}';
    }
}
