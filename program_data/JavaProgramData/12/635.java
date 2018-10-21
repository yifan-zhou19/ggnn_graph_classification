package <missing>;

public class GlobalMembers
{
	//* ??
	//* ??? 1100012820
	//* 20111019
	//*******************
	public static int Main()
	{
		int[] a = new int[16];
		int i = 0;
		int n = 0;
		int j;
		int flag = 1;
		while (flag != 0)
		{
			while (true)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == (-1))
				{
					flag = 0;
					break;
				}
				else if (a[i] == 0)
				{
					for (j = 0; j <= i; j++)
					{
						a[j] = 0;
					}
					System.out.print(n);
					System.out.print("\n");
					n = 0;
					i = 0;
					break;
				}
				else
				{
					for (j = 0; j < i; j++)
					{
						if ((a[j] == 2 * a[i]) || (a[i] == 2 * a[j]))
						{
							n++;
						}
					}
				}
				i++;
			}
		}
		return 0;
	}


}

