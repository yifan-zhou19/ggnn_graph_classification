package <missing>;

public class GlobalMembers
{
	//******************
	//?7???????**********
	public static int Main()
	{
		int n = 0;
		int i = 1;
		int[] a = new int[100];
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] % 7 == 0)
			{
			a[i] = 0;
			}
			if (a[i] % 10 == 7)
			{
			a[i] = 0;
			}
			if (((a[i] - a[i] % 10) / 10) == 7)
			{
				a[i] = 0;
			}
		}
		for (i = 1;i <= n;i++)
		{
			sum = sum + a[i] * a[i];
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

