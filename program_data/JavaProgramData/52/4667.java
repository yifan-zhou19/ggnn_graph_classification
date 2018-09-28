package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[120];
		int[] b = new int[120];
		int i;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //??????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * p1 = a[1];
		for (i = 1;i <= n - m;i++,p1++) //??m???????
		{
			b[m + i] = p1;
		}
		for (i = 1;i <= m;i++) //??n-m???????
		{
			b[i] = a[n - m + i];
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			int * p = b[1];
		for (i = 1;i < n;i++,p++)
		{
		System.out.print(p);
		System.out.print(" ");
		}
		System.out.print(p);
		return 0;
	}

}

