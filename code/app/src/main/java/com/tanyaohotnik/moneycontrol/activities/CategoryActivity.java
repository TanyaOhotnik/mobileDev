package com.tanyaohotnik.moneycontrol.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.tanyaohotnik.moneycontrol.fragments.AccountFragment;
import com.tanyaohotnik.moneycontrol.fragments.CategoryFragment;

/**
 * Created by Tanya Ohotnik on 26.04.2017.
 */

public class CategoryActivity extends PutFragmentPattern {

    @Override
    protected Fragment getFragment() {
        return CategoryFragment.newInstance();
    }

    public static Intent getIntent(Context context, long id){
        Intent intent = new Intent(context,CategoryActivity.class);
        return intent;
    }
}
