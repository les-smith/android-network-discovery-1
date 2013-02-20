package info.airscape.network.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class create_db extends SQLiteOpenHelper {
	
	  // Database creation sql statement
private static final String DATABASE_CREATE = "create table fans" +
	  "(name  text, ip_address text)";

	
	// TODO Auto-generated constructor stub
	public create_db(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		
	
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
