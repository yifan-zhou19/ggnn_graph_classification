package <missing>;

public class GlobalMembers
{
	/*   ???????
	     ???????
		 ?????2010?11?5?
		 ???????????????????????????????????
	*/
	public static int Main()
	{
		int[] num = new int[15];
		int i;
		int j;
		int a;
		int b = 0;
		int m;
		do
		{
			for (m = 0 ; ; m++)
			{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[m] = a;
			if (a == 0)
			{
				break;
			}
			if (a == -1)
			{
				break;
			}
			}
			for (i = 0 ; i <= m ; i++)
			{
				for (j = 0 ; j <= m ; j++)
				{
					if ((num[i] != 0 && num [j] != 0 && num[i] * 2 == num[j]) || (num[i] != 0 && num [j] != 0 && num[j] * 2 == num[i]))
					{
						b++;
					}
				}
			}
			if (a != -1)
			{
				System.out.print(b / 2);
				System.out.print("\n");
				b = 0;
			}
		} while (a != -1);
		return 0;
	}

}

