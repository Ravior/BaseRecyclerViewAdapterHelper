package com.chad.baserecyclerviewadapterhelper.adapter.node.tree.provider;

import com.chad.baserecyclerviewadapterhelper.R;
import com.chad.baserecyclerviewadapterhelper.entity.node.tree.ThirdNode;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ThirdProvider extends BaseNodeProvider<BaseViewHolder> {

    @Override
    public int getItemViewType() {
        return 3;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_node_third;
    }

    @Override
    public void convert(@NotNull BaseViewHolder helper, @Nullable BaseNode data) {
        ThirdNode entity = (ThirdNode) data;
        helper.setText(R.id.title, entity.getTitle());
    }
}
