package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int ii;
		int j;
		int jj;
		int q;
		int k;
		int kk;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n; i += 2)
		{
			ii = i / 2;
			for (j = 3;j <= ii;j++)
			{
				jj = Math.sqrt((float)j);
				for (q = 2;q <= (int)jj;q++)
				{
					if (j % q == 0)
					{
						break;
					}
				}
				if (q == (jj + 1))
				{
					k = i - j;
					kk = Math.sqrt((float)k);
					for (q = 2;q <= (int)kk;q++)
					{
						if (k % q == 0)
						{
							break;
						}
					}
					if (q == (kk + 1))
					{
						System.out.print(i);
						System.out.print("=");
						System.out.print(j);
						System.out.print("+");
						System.out.print(k);
						System.out.print("\n");
						break;
					}
				}
			}
		}

		return 0;

	}
}

