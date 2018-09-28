package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] rela1 = new int[100000];
		int[] rela2 = new int[100000];
		int i = 0;
		int p;
		int I;
		while (true)
		{
			rela1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			rela2[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (rela1[i - 1] == 0 && rela2[i - 1] == 0)
			{
				I = i;
				break;
			}
		}
			int[] num = new int[n];
			for (p = 0;p < n;p++)
			{
				num[p] = 0;
				for (int k = 0;k < I - 1;k++)
				{
					if (rela2[k] == p)
					{
						num[p]++;
					}
				}
				if (num[p] >= n - 1)
				{
					System.out.print(p);
					System.out.print("\n");
					break;
				}
			}
			if (p == n)
			{
				System.out.print("NOT FOUND");
				System.out.print("\n");
			}
		return 0;
	}
}

