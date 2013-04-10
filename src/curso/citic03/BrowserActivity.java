package curso.citic03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

/**
 * 
 * @author pablo
 *
 */
public class BrowserActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_browser);
		
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
		
		// TODO 1 - cargar el intent y los componentes de la vista
		
		// Asegurar la acci—n
		if (!action.equals(Intent.ACTION_VIEW)) 
			throw new RuntimeException("Acci—n no reconocida");
		
		// TODO 2 - extraer la informaci—n del intent
		
		URL url;
		
		try {
			
			// TODO 3 - Formar la URL desde la URI del intent
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			
			while ((line = rd.readLine()) != null) {
				txtView.append(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.browser, menu);
		return true;
	}

}
