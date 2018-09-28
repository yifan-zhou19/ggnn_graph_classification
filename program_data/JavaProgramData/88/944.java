import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i = 0;
	int b = 0;
	int a;
	int flag = 0;
	String str1 = new String(new char[200]);
	str1 = new Scanner(System.in).nextLine();
	a = str1.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
	p = str1;
	while (i < a)
	{
		   if (str1.charAt(i) < '0' || str1.charAt(i)>'9')
		   {
		  p++;
		  i++;
		  continue;
		   }
		  System.out.print(p);
		  if (str1.charAt(i + 1) < '0' || str1.charAt(i + 1)>'9')
		  {
				System.out.print("\n");

				  flag++;
		  }

				p++;
				  i++;


	}

	}
}
