
class CFG{

public class verificador {
	
	int x, y;
}

static boolean RectanguloSobre(verificador l1,verificador r1,verificador p2,verificador r2 ) {
	
			if (l1.x== r1.x|| l1.y == r2.y || p2.x == r2.x || p2.y == r2.y)
			{
				return false;
			}
			if (l1.x >= r2.x || p2.x >= r1.x) 
			{
	            return false;
	        }
	 
	        if (l1.y <= r2.y || p2.y <= r1.y) 
	        {
	            return false;
	        }
	        return true;
	}
}

