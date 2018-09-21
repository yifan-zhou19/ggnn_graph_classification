package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50];
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		a[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			for (int i = 0;i < 49;i++)
			{
				a[i] *= 2;
			}
			for (int i = 0;i < 49;i++)
			{
				while (a[i] > 9)
				{
					a[i] -= 10;
					a[i + 1]++;
				}
			}
		}
		n = 49;
		while (a[n] == 0)
		{
			n--;
		}
		for (int i = n; i >= 0;i--)
		{
			System.out.print(a[i]);
		}

		return 0;
	}
}

