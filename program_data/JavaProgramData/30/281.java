package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int j;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		for (j = 1;j <= n;j++)
		{
			if (j % 7 == 0 || (j - 7) % 10 == 0 || j / 10 == 7)
			{
				a[j] = 0;
			}
		}
		for (i = 1;i <= n;i++)
		{
			sum = sum + a[i] * a[i];
		}
		System.out.print(sum);
		return 0;
	}

}

