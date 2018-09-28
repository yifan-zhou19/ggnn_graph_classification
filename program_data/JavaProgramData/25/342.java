package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int h;
		int j;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		a[1] = 1;
		h = 1;
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= h ; j++)
			{
				a[j] += a[j];
			}
			for (j = 1 ; j <= h ; j++)
			{
				if (a[j] >= 10)
				{
					a[j] = a[j] - 10;
					a[j + 1] += 1;
				}
			}
			if (a[h + 1] != 0)
			{
				h++;
			}
		}
		for (i = h ; i >= 1 ; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

