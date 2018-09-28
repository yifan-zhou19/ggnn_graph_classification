package <missing>;

public class GlobalMembers
{
	//?? - ??(10-2) ???????????
	public static int Main()
	{
		int[] om = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] nom = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sy;
		int sm;
		int sd;
		int s = 0;
		int ey;
		int em;
		int ed;
		int e = 0;
		int d;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}

		if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
		{
			for (i = 0; i < sm - 1; i++)
			{
				s += nom[i];
			}
			s += sd;
		}
		else
		{
			for (i = 0; i < sm - 1; i++)
			{
				s += om[i];
			}
			s += sd;
		}
	   // printf("%d\n", s);

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
		{
			for (i = 0; i < em - 1; i++)
			{
				e += nom[i];
			}
			e += ed;
		}
		else
		{
			for (i = 0; i < em - 1; i++)
			{
				e += om[i];
			}
			e += ed;
		}


		for (i = sy;i < ey;i++)
		{
			 if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			 {
			 e += 366;
			 }
			 else
			 {
			 e += 365;
			 }
		}
		System.out.printf("%d", e - s);
		return 0;
	}

}

