package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static void calc()
	{
		int j = 0;
		for (j = 0;j < 1000;j++)
		{
			a[j] = a[j] * 2;
		}
		for (j = 0;j < 1000;j++)
		{
			if (a[j] >= 10)
			{
				a[j + 1] = a[j + 1] + a[j] / 10;
				a[j] = a[j] % 10;
			}
		}
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		int n = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int sum = 1;
		for (i = 0;i < 30;i++)
		{
			sum = sum * 2;
		}

		while (sum != 0)
		{
			a[k] = sum % 10;
			sum = (sum - a[k]) / 10;
			k++;
		}



			sum = 1;
		if (n <= 30)
		{
			for (i = 0;i < n;i++)
			{
				sum = sum * 2;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		else
		{
			for (i = 30;i < n;i++)
			{
				calc();
			}
			int p = 0;
			for (i = 1000;i >= 0;i--)
			{
				if (a[i] != 0)
				{
					p = i;
					break;
				}
			}
			for (i = p;i >= 0;i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

