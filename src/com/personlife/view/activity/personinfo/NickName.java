package com.personlife.view.activity.personinfo;

import com.example.personlifep.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**  
 *   
 * @author liugang  
 * @date 2015年6月23日   
 */
public class NickName extends Activity {

	private TextView tv_title;
	private Button t_left;
	private Button t_right;
	private EditText nick;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_nickname);
		init();
	}

	public void init(){
		tv_title=(TextView) findViewById(R.id.txt_title);
		t_left=(Button) findViewById(R.id.t_left);
		t_right=(Button) findViewById(R.id.txt_save);
		nick=(EditText) findViewById(R.id.nickname);
		tv_title.setText("昵称");
		t_left.setVisibility(View.VISIBLE);
		t_right.setVisibility(View.VISIBLE);
		Intent intent=getIntent();
		nick.setText(intent.getStringExtra("nickname"));
		t_left.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				onBackPressed();
			}
		});
		nick.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
			    if (hasFocus) {
			        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
				    
			    }
			}
		});
		t_right.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//保存昵称
			}
		});
	}
}
