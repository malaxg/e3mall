package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUITreeResult;

import java.util.List;

/**
 * @Author: Malaxg
 * @Description:
 * @Date: Created on 2018/5/4.
 */
public interface ItemCatService {
    public List<EasyUITreeResult> listTrees(long id);
}
