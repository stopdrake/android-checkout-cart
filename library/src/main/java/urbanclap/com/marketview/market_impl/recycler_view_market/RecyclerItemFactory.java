package urbanclap.com.marketview.market_impl.recycler_view_market;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;

import urbanclap.com.marketview.frame_work.cart.CartCallback;
import urbanclap.com.marketview.frame_work.market.interfaces.IItemFactory;

/**
 * @author : Adnaan 'Zohran' Ahmed <adnaanahmed@urbanclap.com>
 * @version : 1.0.0
 * @since : 13 Mar 2018 3:46 PM
 */


public abstract class RecyclerItemFactory<T, CT> implements IItemFactory<T, RecyclerItemViewHolder<T, CT>> {

    RecyclerItemViewHolder<T, CT> create(@NonNull Context context,
                                         @NonNull ViewGroup parent,
                                         int viewType, @Nullable CartCallback<CT> cartCallback) {

        RecyclerItemViewHolder<T, CT> viewHolder = createViewHolder(context, parent, viewType);
        viewHolder.setCartCallback(cartCallback);
        return viewHolder;
    }

    @Override
    public abstract RecyclerItemViewHolder<T, CT> createViewHolder(@NonNull Context context,
                                                                   @NonNull ViewGroup parent,
                                                                   int viewType);
}
