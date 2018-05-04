package cn.e3mall.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * EasyUI树形控件返回结果
 */
@Data
public class EasyUITreeResult implements Serializable {
    private long id;
    private String text;
    private String state;
}
