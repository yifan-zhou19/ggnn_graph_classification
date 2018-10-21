package <missing>;

public class GlobalMembers
{
	/*************************
	??cpp1
	????
	???
	2013/12/11
	**************************/
	public static int Main()
	{
		int[] a = new int[103];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
		int n;
		int m;
		int i;
		int j;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = a;
		for (i = 1; i <= n; i++)
		{
			*p++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= m; i++)
		{
			temp = a[n - 1];
			for (j = n - 1; j >= 1 ; j--)
			{
				a[j] =  (a + j - 1);
			}
			a[0] = temp;
		}
		p = a;
		System.out.print(p);
		for (i = 1; i <= n - 1; i++)
		{
			System.out.print(" ");
			System.out.print((++p));
		}
		return 0;
	}

}

