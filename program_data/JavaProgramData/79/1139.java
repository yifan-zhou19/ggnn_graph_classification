package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		do
		{
			int n;
			int m;
			int[] a = new int[500];
			int flag;
			int i;
			int num = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			flag = n;
			if (n == 0 && m == 0)
			{
				break;
			}
			for (i = 1; i <= n; i++)
			{
				a[i] = 1;
			}
			for (i = 1; i <= n; i++)
			{
				if (a[i] != 0)
				{
					num++;
					if (num == m)
					{
						if (flag != 1)
						{
							a[i] = 0;
							num = 0;
							flag -= 1;
						}
						else
						{
							break;
						}
					}
				}
				if (i == n)
				{
					i = 0;
				}

			}

			for (i = 1; i <= n; i++)
			{
				if (a[i] == 1)
				{
					System.out.print(i);
					System.out.print("\n");
				}
			}
		}while (1 != 0);
		return 0;
	}


}

