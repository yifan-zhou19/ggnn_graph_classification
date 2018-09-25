package <missing>;

public class GlobalMembers
{
	public static final int MAX_NUM = 300;
	public static int[] anLoop = new int[MAX_NUM + 10];
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
			for (int i = 0;i < n;i++)
			{
			anLoop[i] = i + 1;
			}
			int nPtr = 0;
			for (int i = 0;i < n;i++)
			{
				int nCounted = 0;
				while (nCounted < m)
				{
					while (anLoop[nPtr] == 0)
					{
					nPtr = (nPtr + 1) % n;
					}
					nCounted++;

					nPtr = (nPtr + 1) % n;
				}
				nPtr--;
				if (nPtr < 0)
				{
					nPtr = n - 1;
				}
				if (i == n - 1)
				{
				System.out.print(anLoop[nPtr]);
				System.out.print("\n");
				}
				anLoop[nPtr] = 0;
			}
		}

		return 0;
	}

}

