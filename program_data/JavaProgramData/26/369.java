import java.util.*;

package <missing>;

public class GlobalMembers
{
	 // ???????????
	 // ??????
	 // ???2010?12?10?
	 // ??????????


	public static int Main()
	{
		String a = new String(new char[110]);
		int n;
		int i;
		int j;
		int[] g = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a.charAt(0);
		n = a.length();
		for (i = 0 ; i <= n - 1 ; i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i - 1) == ' ')
			{
				g[i] = 1;
			}
			p = p + 1;
		}
		for (j = 0 ; j <= n - 1 ; j++)
		{
			if (g[j] == 0)
			{
				System.out.print(a.charAt(j));
			}
		}
		return 0;
	}

}
