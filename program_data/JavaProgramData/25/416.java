package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] a = new int[100];
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		a[0] = 1;
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i <= n; i++)
			{
			for (j = 0; j < 100; j++)
			{
				a[j] = 2 * a[j];
			}
			for (j = 0;j < 100; j++)
			{
				if (a[j] > 9)
				{
					a[j] = a[j] - 10;
				a[j + 1]++;
				}
			}
			}
		for (i = 99; i >= 0;i--)
		{
			if (a[i] == 0)
			{
				k++;
			}
			else
			{
				break;
			}
		}
		for (i = 99 - k; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		}
		return 0;
	}
}

