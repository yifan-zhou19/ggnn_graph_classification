package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		a[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			int j;
			for (j = 0;j < n;j++)
			{
				a[j] = a[j] * 2;
			}
			for (j = 0;j < n;j++)
			{
				if (a[j] > 9)
				{
					a[j] = a[j] % 10;
					a[j + 1]++;
				}
			}
		}
			for (i = n;i >= 0;i--)
			{
				if (a[i] != 0)
				{
					break;
				}
			}
			int s;
			for (s = i;s >= 0;s--)
			{
				System.out.print(a[s]);
			}
			System.out.print("\n");
		return 0;
	}
}

