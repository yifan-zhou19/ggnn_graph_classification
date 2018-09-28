package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= n; i++)
		{
			if (a[i] % 2 == 0)
			{
				continue;
			}
			for (j = i; j <= n; j++)
			{

				if (a[j] % 2 == 0)
				{
					continue;
				}
				if (a[i] > a[j])
				{
					s = a[i];
					a[i] = a[j];
					a[j] = s;
				}
			}
			if (p != 0)
			{
				System.out.print(",");
			}
			System.out.print(a[i]);
			p++;
		}
	return 0;
	}
}

