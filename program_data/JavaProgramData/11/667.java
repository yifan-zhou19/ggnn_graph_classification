package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (m == 1)
		{
			s = d;
		}
		else if (m == 2)
		{
			s = 31 + d;
		}
		else if (m == 3)
		{
			s = 60 + d;
		}
		else if (m == 4)
		{
			s = 91 + d;
		}
		else if (m == 5)
		{
			s = 121 + d;
		}
		else if (m == 6)
		{
			s = 152 + d;
		}
		else if (m == 7)
		{
			s = 182 + d;
		}
		else if (m == 8)
		{
			s = 213 + d;
		}
		else if (m == 9)
		{
			s = 244 + d;
		}
		else if (m == 10)
		{
			s = 274 + d;
		}
		else if (m == 11)
		{
			s = 305 + d;
		}
		else if (m == 12)
		{
			s = 335 + d;
		}
		if (m >= 3)
		{
			if (y % 100 == 0)
			{
				if (y % 400 == 0)
				{
					System.out.printf("%d",s);
				}
				else
				{
					System.out.printf("%d",s - 1);
				}
			}
			else if (y % 4 == 0)
			{
				System.out.printf("%d",s);
			}
			else if (y % 4 != 0)
			{
				System.out.printf("%d",s - 1);
			}
		}
		else
		{
			System.out.printf("%d",s);
		}
		return 0;
	}


}

