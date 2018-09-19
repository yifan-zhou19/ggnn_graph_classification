package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[20];
		int r;
		int ctr;
		int t;
		int i;
		int j;
		while (cin.peek() != '-')
		{
			r = ctr = 0;
			while ((t,t = ConsoleInput.readToWhiteSpace(true)).length() > 0)
			{
				x[++r] = t;
			}
			System.in.read();
			for (i = 1;i <= r;i++)
			{
				for (j = 1;j <= r;j++)
				{
					if (x[i] == (x[j] << 1))
					{
						ctr++;
					}
				}
			}
			System.out.print(ctr);
			System.out.print("\n");
		}
		return 0;
	}
}

