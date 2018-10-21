package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n;
		int m;
		int i;
		int j;
		int k = 0;
		int a;
		int[] num = new int[20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j <= m;j++)
				{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (k == 1)
				{
					continue;
				}
				else
				{
					num[j] = a;
				  if (num[j] + 3 * (j - 1) == 59)
				  {
						 System.out.print(num[j]);
				  k = 1;
				  }
				  else if (num[j] + 3 * (j - 1) > 59)
				  {
						  System.out.print(60 - 3 * (j - 1));
						  System.out.print("\n");
				  k = 1;
				  }
				  else if (num[j] + 3 * (j - 1) < 59 && num[j] + 3 * j>59)
				  {
					System.out.print(num[j] - 3 * (j - 1));
					System.out.print("\n");
				  k = 1;
				  }
				  else if (j == m)
				  {
				System.out.print(60 - 3 * j);
				System.out.print("\n");
				  }
				}
				}
			}
		k = 0;
		}
			return 0;
	}
}

