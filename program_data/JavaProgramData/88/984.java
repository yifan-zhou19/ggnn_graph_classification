import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
				String s = new String(new char[1000]);
				String f = new String(new char[200]);
				s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
				char * p;
				int i;
				int t;
				p = s;
				i = 0;
				while (*p != '\000')
				{
							while (((*p < 48) || (*p>57)) && (*p != '\000'))
							{
								p++;
							}
							while ((*p >= 48) && (*p <= 57) && (*p != '\000'))
							{
								System.out.print(p);
								p++;
							}
		  System.out.print("\n");
				}
	}

}
