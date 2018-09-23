package <missing>;

public class GlobalMembers
{
	//******************************************
	//*            ???????              *
	//*            ??????                *
	//*            ???1200012764            *
	//*            ???2012/10/29            *
	//******************************************
	public static int Main()
	{
		int a;
		int t;
		int i;
		while (true)
		{
			a = 0;
			t = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == -1)
			{
				break;
			}
			int[] num = new int[17];
			num[1] = a;
			for (i = 2; i <= 16; i++)
			{
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (num[i] == 0)
				{
					break;
				}
			}
			for (int r = 1; r <= (i - 1); r++)
			{
				for (int s = 1; s <= (i - 1); s++)
				{
					if (num[r] == 2 * num[s])
					{
						t = t + 1;
					}
				}
			}
				System.out.print(t);
				System.out.print("\n");
		}
		return 0;
	}




}

