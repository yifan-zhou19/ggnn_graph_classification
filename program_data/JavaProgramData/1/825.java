package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static void f(int x,int y)
	{
		num++;
		for (int j = y;j * j <= x;j++)
		{
			   if (x % j == 0)
			   {
				 f(x / j, j);
			   }
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1100];
		for (int i = 1;i <= n;i++)
		{
				num = 0;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				f(a[i], 2);
				System.out.print(num);
				System.out.print("\n");

		}
			return 0;
	}


}

