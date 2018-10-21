package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[102];
	public static int[] ans = new int[102];
	public static int j;
	public static void mult(int[] a)
	{
		for (j = 0;j < 101;j++)
		{
			a[j] = a[j] * 2;
		}
		for (j = 0;j < 101;j++)
		{
			a[j + 1] = a[j + 1] + a[j] / 10;
			a[j] = a[j] % 10;
		}

	}
	public static int Main()
	{
		int n;
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		for (i = 0;i < n;i++)
		{
			mult(a);
		}
	   int k = 100;
	   while (a[k] == 0)
	   {
		   k--;
	   }
	   for (i = k;i >= 0;i--)
	   {
		   System.out.print(a[i]);
	   }
	   return 0;

	}

}

