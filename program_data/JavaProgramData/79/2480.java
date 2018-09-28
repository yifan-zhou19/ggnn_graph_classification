package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[305];
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0 && m != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			int step = 0;
			int flag = 0;
			int i = 1;
			while (flag < n - 1)
			{
				step = 0;
				for (;i <= n;i = i % n + 1)
				{
					if (a[i] == 0)
					{
						step++;
					}
					if (step == m)
					{
						a[i] = 1;
						break;
					}
				}
				flag++;
			}
			for (int j = 1;j <= n;j++)
			{
				if (a[j] == 0)
				{
					System.out.print(j);
					System.out.print("\n");
					break;
				}
			}
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}
}

