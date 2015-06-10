package net.coding.program.common.widget;

import android.support.v4.widget.SwipeRefreshLayout;

import net.coding.program.BackActivity;
import net.coding.program.R;

/**
 * Created by chenchao on 15/6/10.
 * 对 refresh 的操作放到基类里
 */
public abstract class RefreshBaseActivity extends BackActivity implements SwipeRefreshLayout.OnRefreshListener {

    public static final String UPDATE_ALL = "99999999";
    public static final int UPDATE_ALL_INT = 99999999;

    private SwipeRefreshLayout swipeRefreshLayout;

    protected final boolean isRefreshing() {
        return swipeRefreshLayout.isRefreshing();
    }

    protected final void setRefreshing(boolean refreshing) {
        swipeRefreshLayout.setRefreshing(refreshing);
    }

    protected final void initRefreshLayout() {
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeResources(R.color.green);
    }

    protected final void disableRefreshing() {
        swipeRefreshLayout.setEnabled(false);
    }
}