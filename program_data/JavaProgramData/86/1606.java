package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int o = 1;o <= n;o++)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] stop = new int[m + 1];
			int TimeNow = 0;
			int Num = 0;
			for (int x = 1;x <= m;x++)
			{
				stop[x] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
			  for (int x = 1;x <= m;x++)
			  {
				while (Num < stop[x])
				{
					TimeNow++;
					Num++;
					if (TimeNow >= 60)
					{
						break;
					}
				}
				TimeNow += 3;
				if (TimeNow >= 60)
				{
					break;
				}
			  }
			  if (TimeNow <= 60)
			  {
				  Num += 60 - TimeNow;
			  }
			  System.out.print(Num);
			  System.out.print("\n");
			}
		}
		return 0;
	}
}

