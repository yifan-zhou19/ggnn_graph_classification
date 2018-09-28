package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		for (int i = 1; i <= 101; ++i)
		{
			a[i] = 0;
		}
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t = 0;
		for (int i = 1; i <= n; ++i)
		{
			if ((i % 7) == 0)
			{
			a[i] = i;
			}
			else
			{
				if ((i - 7) % 10 == 0)
				{
				a[i] = i;
				}
				else
				{
					if (i >= 70 && i <= 79)
					{
					a[i] = i;
					}
				}
			}
		}
		int sum = 0;
		int b = 0;
		for (int i = 1; i <= n; ++i)
		{
			b = b + i * i;
		}
		for (int i = 1; i <= n; ++i)
		{
			sum = sum + a[i] * a[i];
		}
		System.out.print(b - sum);
		//while(1);
		return 0;
	}

}

