package cn.e3mall.service.impl;

import cn.e3mall.common.pojo.EasyUITreeResult;
import cn.e3mall.mapper.TbItemCatMapper;
import cn.e3mall.pojo.TbItemCat;
import cn.e3mall.pojo.TbItemCatExample;
import cn.e3mall.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Malaxg
 * @Description:
 * @Date: Created on 2018/5/4.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EasyUITreeResult> listTrees(long id) {
        TbItemCatExample tbItemCatExample = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = tbItemCatExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        List<TbItemCat> tbItemCats = tbItemCatMapper.selectByExample(tbItemCatExample);

        if (tbItemCats != null) {
            List<EasyUITreeResult> list = new ArrayList<>();
            for (TbItemCat item : tbItemCats) {
                EasyUITreeResult tree = new EasyUITreeResult();
                tree.setId(item.getId());
                tree.setText(item.getName());
                tree.setState(item.getIsParent() ? "closed" : "open");
                list.add(tree);
            }
            return list;
        }
        return null;
    }
}
