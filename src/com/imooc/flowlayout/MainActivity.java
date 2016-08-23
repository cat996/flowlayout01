package com.imooc.flowlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.imooc.view.FlowLayout;

public class MainActivity extends Activity
{
	private String[] mVals = new String[]
	{ "software testing", "Android learning", "English interpreter ", 	"新闻学","经济学",
			"金融学","工商管理","财务管理","哲学","软件工程","计算机科学与技术","电子信息科学与技术"
			,"高分子材料与工程","土木工程","机械设计制造及其自动化","口腔医学",
			"通信工程","应用物理学","舞蹈学","应用心理学","人力资源管理","人力资源管理","广告学","......"
	};

	private FlowLayout mFlowLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mFlowLayout = (FlowLayout) findViewById(R.id.id_flowlayout);

		initData();
	}

	public void initData()
	{
		// for (int i = 0; i < mVals.length; i++)
		// {
		// Button btn = new Button(this);
		//
		// MarginLayoutParams lp = new MarginLayoutParams(
		// MarginLayoutParams.WRAP_CONTENT,
		// MarginLayoutParams.WRAP_CONTENT);
		//
		// btn.setText(mVals[i]);
		// mFlowLayout.addView(btn, lp);
		// }
		LayoutInflater mInflater = LayoutInflater.from(this);
		for (int i = 0; i < mVals.length; i++)
		{
			TextView tv = (TextView) mInflater.inflate(R.layout.tv,
					mFlowLayout, false);
			tv.setText(mVals[i]);
			mFlowLayout.addView(tv);
		}

	}

}
