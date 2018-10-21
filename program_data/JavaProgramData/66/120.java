package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String[] days = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		int[] years = {365, 365, 365, 366};
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int m,d,i,k,j;
		int m;
		int d;
		int i;
		int k;
		int j;

	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int td,a1,a2;
		int td;
		int a1;
		int a2;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int y;
		int y;
		td = 0;
		k = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}

		a1 = (y - 1) / 100;
		a2 = (y - 1) / 400;
		j = a1 - a2;
		 k = (y - 1) / 4;

		 td = 5 * k;
		td = td + ((y - 1) % 4);
		td = td - j;
		for (i = 0;i < (m - 1);i++)
		{
		   td = td + month[i];
		   if ((y % 100) == 0)
		   {
			   if (((y % 400) == 0) && (i == 1))
			   {
				   td++;
			   }

		   }
		   else
		   {
			  if (((y % 4) == 0) && (i == 1))
			  {
				  td++;
			  }
		   }
		}
			td = td + d;

					 td = td % 7;
			if (td == 0)
			{
				td = 7;
			}


		System.out.printf("%s\n",days[td - 1]);
	   return 0;

	}
}

