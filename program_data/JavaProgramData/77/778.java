import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                            **
	//*????? 1100013004                     **
	//*???2010.11.21                          **
	//****************************************
	public static int i;
	public static int j;
	public static int n;
	public static int flag = 0;
	public static int match(int[] b)
	{

		for (i = 0; i < 100;i++)
		{
			if (b[i] == 1)
			{
				n = i;
			}
			else
			{
				if (b[i] == -1)
				{
					b[n] = 0;
					b[i] = 0;
					System.out.print(n);
					System.out.print(' ');
					System.out.print(i);
					System.out.print("\n");
					break;
				}
			}
		}
		return b[100];
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
				if (a.charAt(i) == a.charAt(0))
				{
					b[i] = 1;
				}
				else
				{
					b[i] = -1;
				}
		}
		flag = 1;
		while (flag != 0)
		{
			flag = 0;
			b[100] = match(b);
			for (i = 0;i < 100; i++)
			{
					if (b[i] == 1)
					{
						flag = 1;
					}
			}
		}
		return 0;
	}
}
