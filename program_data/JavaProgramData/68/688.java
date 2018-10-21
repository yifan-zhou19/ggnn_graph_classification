package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		int o;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6; i <= n; i = i + 2)
		{
			for (j = 2; j <= (i / 2); j++)
			{
				k = Math.sqrt(j);
				for (l = 2; l <= k; l++)
				{
					if (j % l == 0)
					{
						break;
					}
				}
				if (l == k + 1)
				{
					m = Math.sqrt(i - j);
				   for (o = 2; o <= m; o++)
				   {
					   if ((i - j) % o == 0)
					   {
						   break;
					   }
				   }
				   if (o == m + 1)
				   {
					   break;
				   }
				}
			}
			System.out.print(i);
			System.out.print("=");
			System.out.print(j);
			System.out.print("+");
			System.out.print(i - j);
			System.out.print("\n");
		}
		return 0;
	}

}

