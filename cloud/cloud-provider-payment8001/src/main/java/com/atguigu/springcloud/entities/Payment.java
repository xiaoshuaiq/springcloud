package com.atguigu.springcloud.entities;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author WangXiaoshuai
 * @create 2020-05-27 21:57
 */
public class Payment implements Serializable {
    private Long id;
    @NotNull(message = "支付订单号不能为空")
    private String serial;

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Payment{");
        sb.append("id=").append(id);
        sb.append(", serial='").append(serial).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
