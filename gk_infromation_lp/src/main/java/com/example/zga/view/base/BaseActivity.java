package com.example.zga.view.base;

/**
 * @author z`guo`an on 2017/4/18 15:34
 */

public abstract  class BaseActivity  {
//
//    protected T mPresenter;
//
//    protected Activity mContext;
//
//    public enum TransitionMode {
//
//        LEFT, RIGHT, TOP, BOTTOM, SCALE, FADE
//
//    }
//
//
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//
//        if (toggleOverridePendingTransition()) {
//
//            switch (getOverridePendingTransitionMode()) {
//
//                case LEFT:
//
//                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
//
//                    break;
//
//                case RIGHT:
//
//                    overridePendingTransition(R.anim.right_in, R.anim.right_out);
//
//                    break;
//
//                case TOP:
//
//                    overridePendingTransition(R.anim.top_in, R.anim.top_out);
//
//                    break;
//
//                case BOTTOM:
//
//                    overridePendingTransition(R.anim.bottom_in, R.anim.bottom_out);
//
//                    break;
//
//                case SCALE:
//
//                    overridePendingTransition(R.anim.scale_in, R.anim.scale_out);
//
//                    break;
//
//                case FADE:
//
//                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//
//                    break;
//
//            }
//
//        }
//
//
//        super.onCreate(savedInstanceState);
//
//        setContentView(getLayout());
//
//
//        mUnbinder = ButterKnife.bind(this);
//
//        mContext = this;
//
//
//        createPresenter();
//
//
//        if (mPresenter != null)
//
//            mPresenter.attachView(this);
//
//        App.getInstance().addActivity(this);
//
//        initEventAndData();
//
//    }
//
//
//    @Override
//
//    protected void onStart() {
//
//        super.onStart();
//
//
//    }
//
//
//    @Override
//
//    protected void onDestroy() {
//
//        super.onDestroy();
//
//        if (mPresenter != null)
//
//            mPresenter.detachView();
//
//        mUnbinder.unbind();
//
//        App.getInstance().removeActivity(this);
//
//    }
//
//
//    protected void setToolBar(Toolbar toolbar, String title) {
//
//        toolbar.setTitle(title);
//
//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//
//            @Override
//
//            public void onClick(View view) {
//
//                onBackPressed();
//
//            }
//
//        });
//
//    }
//
//
//    protected abstract int getLayout();
//
//
//    protected abstract void initEventAndData();
//
//
//    protected abstract boolean toggleOverridePendingTransition();
//
//
//    protected abstract TransitionMode getOverridePendingTransitionMode();
//
//
//    protected abstract void createPresenter();
}
