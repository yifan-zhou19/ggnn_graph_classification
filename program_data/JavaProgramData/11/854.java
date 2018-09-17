package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int s = 0;
		int d = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (((a % 4 == 0) && ((a % 100) != 0)) || ((a % 400) == 0))
		{
			d = 1;
		}

		for (i = 1;i < b;i++)
		{
			if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				s = s + 31;
			}
			if ((i == 4) || (i == 6) || (i == 9) || (i == 11))
			{
				s = s + 30;
			}
			if (i == 2)
			{
				if (d == 0)
				{
					s = s + 28;
				}
				if (d == 1)
				{
					s = s + 29;
				}
			}
		}
		s = s + c;
		System.out.printf("%d",s);
		return 0;
	}



}

