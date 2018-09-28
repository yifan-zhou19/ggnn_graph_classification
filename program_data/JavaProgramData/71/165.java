package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int i;
		int year;
		int m1;
		int m2;
		int max = 0;
		int min = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
			max = m1;
			min = m2;
			}
			else
			{
				max = m2;
				min = m1;
			}

			if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
			{ //???????????????????????7????
				if ((min == 1 && max == 10) || (min == 2 && max == 3) || (min == 2 && max == 11) || (min == 3 && max == 11) || (min == 4 && max == 7) || (min == 9 && max == 12))
				{
				System.out.print("YES\n");
				}
				else
				{
				System.out.print("NO\n");
				}
			}
			else
			{ //????????????????????7????
						  if ((min == 3 && max == 11) || (min == 4 && max == 7) || (min == 9 && max == 12) || (min == 1 && max == 4) || (min == 1 && max == 7) || (min == 2 && max == 8))
						  {
				System.out.print("YES\n");
						  }
				else
				{
				System.out.print("NO\n");
				}
			}



		}




		return 0;
	}

}

