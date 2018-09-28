package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n >= 1;n--)
		{
				int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] broke = new int[m + 1]; //????????????
			int i;
			int[] total = new int[61];
			int count = 0;
			for (i = 1;i <= 60;i++)
			{
				total[i] = 1; //total[61]??1-60?????1???0??
			}
			if (m == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else //????1?
			{
				   for (i = 1;i <= m;i++)
				   {
						broke[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					broke[i] = broke[i] + (i - 1) * 3; //???i??????broke[i]??
				   }
				for (i = 1;i <= m;i++) //?????60??????total????0
				{
						if (broke[i] + 1 <= 60)
						{
							total[broke[i] + 1] = 0;
						}
					else
					{
						break;
					}
					if (broke[i] + 2 <= 60)
					{
						total[broke[i] + 2] = 0;
					}
					 else
					 {
						 break;
					 }
					if (broke[i] + 3 <= 60)
					{
						total[broke[i] + 3] = 0;
					}
					  else
					  {
						  break;
					  }
				}
				for (i = 1;i <= 60;i++) //??????
				{
					count = count + total[i];
				}
				System.out.print(count);
				System.out.print("\n");
				count = 0; //?????
				for (i = 1;i <= 60;i++)
				{
					total[i] = 1;
				}
			}
		}
		return 0;
	}
}

