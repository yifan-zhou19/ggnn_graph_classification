package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] th = new int[1010];
	public static int[] qh = new int[1010];

	public static int comp(Object lhs, Object rhs)
	{
		return *(int)rhs - (int)lhs;
	}

	public static int Main()
	{
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(th,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(qh,0,(Integer.SIZE / Byte.SIZE));
			for (int i = 0; i < n; ++i)
			{
				th[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; ++i)
			{
				qh[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(qh,n,(Integer.SIZE / Byte.SIZE),comp);
			qsort(th,n,(Integer.SIZE / Byte.SIZE),comp);

			int sum = 0;
			int max = -1000 * 200;
			for (int k = 0; k < n; ++k)
			{
				sum = 0;
				int count = 0;
				for (int i = 0; i < n; ++i)
				{
					if (th[(i - k + n) % n] > qh[i])
					{
						sum += 200;
						++count;
					}
					else if (th[(i - k + n) % n] < qh[i])
					{
						sum -= 200;
					}
				}
				if (sum > max)
				{
					max = sum;
				}
				if (count == n - k)
				{
					break;
				}
			}
			System.out.print(max);
			System.out.print("\n");
		}
	}
}

