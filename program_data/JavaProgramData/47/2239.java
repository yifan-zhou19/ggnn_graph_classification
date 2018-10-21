package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[110];
	public static int m;
	public static void f(int n)
	{

		if (n == 1)
		{
				System.out.print(a[m - 1]);


		}
	   else
	   {
		   f(n - 1);
		  System.out.print(" ");
		  System.out.print(a[m - n]);
	   }
	}
	public static int Main()
	{

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		}
	   f(m);






	return 0;
	}

}

