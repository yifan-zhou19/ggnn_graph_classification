package <missing>;

public class GlobalMembers
{
	public static int number;
	public static char[][] roms = new char[MAXN][MAXN];

	public static void days_go()
	{
		int iterout;
		int iterin;
		int i;
		int j;
		for (iterout = 0 ; iterout != number ; ++iterout)
		{
			for (iterin = 0 ; iterin != number ; ++iterin)
			{
		 if ('@' == roms[iterout][iterin])
		 {
			 i = iterout - 1;
		  if (-1 != j)
		  {
		   j = iterin;
			  if ('.' == roms[i][j])
			  {
		   roms[i][j] = '!';
			  }
		  }
		 i = iterout;
		  j = iterin - 1;
		if (-1 != j)
		{
				  if ('.' == roms[i][j])
				  {
				roms[i][j] = '!';
				  }
		}
		 j = iterin + 1;
			if (number != j)
			{
	   if ('.' == roms[i][j])
	   {
		 roms[i][j] = '!';
	   }
			}
		i = iterout + 1;
	  if (number != i)
	  {
						j = iterin;
				if ('.' == roms[i][j])
				{
			 roms[i][j] = '!';
				}
	  }
		 }
			}
		}
		for (iterout = 0 ; iterout != number ; ++iterout)
		{
	   for (iterin = 0 ; iterin != number ; ++iterin)
	   {
	 if ('!' == roms[iterout][iterin])
	 {
					roms[iterout][iterin] = '@';
	 }
	   }
		}
	}
	public static int count()
	{
	 int total = 0;
	 int iterout;
	 int iterin;
	 for (iterout = 0 ; iterout != number ; ++iterout)
	 {
		 for (iterin = 0 ; iterin != number ; ++iterin)
		 {
	 if ('@' == roms[iterout][iterin])
	 {
		  ++total;
	 }
		 }
	 }
		return total;
	}

	public static int Main()
	{
		int renshu;
		int iter;
		int days;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		for (iter = 0 ; iter != number ;++iter)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				roms[iter] = tempVar2.charAt(0);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			days = Integer.parseInt(tempVar3);
		}
		for (iter = 1 ; iter != days ; ++iter)
		{
			days_go();
		}
		renshu = count();
		System.out.printf("%d",renshu);
		return 0;
	}

}

