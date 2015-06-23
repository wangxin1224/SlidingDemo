package net.ting.sliding;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	private SlideMenu slideMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		slideMenu = (SlideMenu) findViewById(R.id.slide_menu);
		ImageView menuImg = (ImageView) findViewById(R.id.title_bar_menu_btn);
		menuImg.setOnClickListener(this);
        TextView item1 = (TextView)findViewById(R.id.item1);
        item1.setOnClickListener(this);
        TextView item2 = (TextView)findViewById(R.id.item2);
        item2.setOnClickListener(this);
        TextView item3 = (TextView)findViewById(R.id.item3);
        item3.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.title_bar_menu_btn:
			if (slideMenu.isMainScreenShowing()) {
				slideMenu.openMenu();
			} else {
				slideMenu.closeMenu();
			}
		    break;
        case R.id.item1:
            Toast.makeText(this,"1",Toast.LENGTH_LONG).show();
            break;
        case R.id.item2:
            Toast.makeText(this,"2",Toast.LENGTH_LONG).show();
            break;
        case R.id.item3:
            Toast.makeText(this,"3",Toast.LENGTH_LONG).show();
            break;
		}
		
	}

}
