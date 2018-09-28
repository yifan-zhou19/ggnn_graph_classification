import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*****************************
	//*??? :???????     *
	//*??   :???             *
	//*??   :2011?11?         *
	//*****************************
	public static int Main()
	{
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * w;
		String q = new String(new char[100]);
		q = new Scanner(System.in).nextLine();
		m = q.length();
		 w = q.charAt(100);
		p = q.charAt(100);
		for (p = q; p < q.Substring(m); p++)
		{
			if (*p == ' ')
			{
				for (w = p + 1; * w == ' '; w++)
				{
					*w = '1';
				}
			}
		}
		for (w = q; w < q.Substring(m); w++)
		{
			if (*w != '1')
			{
				System.out.print(w);
			}
		}
		return 0;
	}


}
