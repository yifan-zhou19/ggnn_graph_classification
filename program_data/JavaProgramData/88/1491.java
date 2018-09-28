import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = a;
		int b;
		b = a.length();
		for (;p < a.Substring(b);)
		{
		   if ((*p >= '0') && (*p <= '9'))
		   {
			  System.out.print(p);
			  p++;
			  if ((*p < '0') || (*p>'9'))
			  {
			  System.out.print("\n");
			  }
		   }
		   else
		   {
		   p++;
		   }
		}
		return 0;
	}

}
