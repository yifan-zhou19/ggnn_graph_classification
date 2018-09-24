package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		a[n] = n + k;
		for (int i = 1;;i++)
		{
			for (int j = n;j >= 2;j--)
			{
					if ((a[j] * n) % (n - 1) != 0)
					{
						a[n] += n;
						break;
					}
				else
				{
					a[j - 1] = a[j] * n / (n - 1) + k;
				}
			}
			if (a[1] != 0)
			{
				break;
			}
		}
		System.out.print(a[1]);
		System.out.print("\n");
	return 0;
	}

}

