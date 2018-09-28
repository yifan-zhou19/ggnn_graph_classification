package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int n;
		for (int i = 1;i <= 9999;i++)
		{
			a[i] = System.in.read();
			if (a[i] == 10)
			{
			   n = i - 1;
			   break;
			}
		}
		for (int i = 1;i <= n - 1;i++)
		{
			if ((a[i] == ' ') && (a[i + 1] == ' '))
			{
			   for (int j = i + 1;j <= n - 1;j++)
			   {
			   a[j] = a[j + 1];
			   }
			   n = n - 1;
			   i = 1;
			}
		}
		for (int k = 1;k <= n;k++)
		{
		System.out.print(a[k]);
		}
		return 0;
	}


}
