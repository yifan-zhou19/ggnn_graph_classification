package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;

		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0 && m == 0)
			{
				break;
			}
			int[] a = new int[500];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			int tmp = n;
			int start = -1;

			while (tmp > 1)
			{
				int mtmp = (m - 1) % tmp + 1;
				int i = 0;
				while (i < mtmp)
				{
					start = (start + 1) % n;
					while (a[start] == 1)
					{
						start = (start + 1) % n;
					}
					++i;
				}
				a[start] = 1;
				--tmp;
			}
			for (int i = 0; i < n; ++i)
			{
				//cout << a[i] << " ";
				if (a[i] != 1)
				{
					System.out.print(i + 1);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

