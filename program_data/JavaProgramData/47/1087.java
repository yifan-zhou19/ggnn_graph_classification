package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int t = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] num = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (k = 1;k <= n;k++)
		{
		   for (j = 1;j <= n - k;j++)
		   {
				t = num[j];
				num[j] = num[j + 1];
				num[j + 1] = t;
		   }
		}
		for (i = 1;i < n;i++)
		{
		System.out.print(num[i]);
		System.out.print(" ");
		}
		System.out.print(num[n]);
		System.out.print("\n");
		return 0;
	}

}

