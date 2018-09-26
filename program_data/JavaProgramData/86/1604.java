package <missing>;

public class GlobalMembers
{
	/*????*/



	public static int Main()
	{
		int n;
		int j;
		int i;
		int m;
		int all = 0;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
				for (i = 1;i <= m;i++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (i = 1;i <= m;i++)
				{

					if (a[i] + 3 * i - 3 <= 60)
					{
						all = a[i]; //??i?????????????1?????????all?
					}
					if ((a[i] + 3 * i - 3 > 60) && (all + 3 * i - 3 <= 60)) //????????????????????????????
					{
						all = 63 - 3 * i;
						break;
					}
				}
				if (all + 3 * m <= 60)
				{
					System.out.print((60 - 3 * m));
					System.out.print("\n");
				}
				else
				{
					System.out.print(all);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

