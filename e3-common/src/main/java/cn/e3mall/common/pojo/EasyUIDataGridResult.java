package cn.e3mall.common.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * EasyUI表格控件返回结果
 */
@Data
public class EasyUIDataGridResult implements Serializable {
    private long total;
    private List rows;
}
