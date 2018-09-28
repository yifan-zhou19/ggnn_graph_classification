package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[] a = {0, 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
			int w;
			int i;
			int j;
			int date;
			int[] b = new int[13];
			w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1 ; i <= 12 ; i++)
			{
					date = w + a[i] + 5;
					for (j = 1 ; j >= 1 ; j++)
					{
							if (date > 7)
							{
								date -= 7;
							}
							else
							{
									if (date == 5)
									{
										System.out.print(i);
										System.out.print("\n");
										break;
									}
									else
									{
										break;
									}
							}
					}
			}
			return 0;
	}
}

