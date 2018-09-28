package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i = 0;
		int yu = 0;
		int j;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[][] b =
		{
			{"Sun."},
			{"Mon."},
			{"Tue."},
			{"Wed."},
			{"Thu."},
			{"Fri."},
			{"Sat."}
		};
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
		yu = (yu + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400 + ((y - 1) % 7) * 365) % 7;
		if ((y % 100 != 0 && y % 4 == 0) || (y % 400 == 0))
		{
			 for (j = 0;j < m - 1;j++)
			 {
				 i += a[j];
			 }
			 if (m > 2)
			 {
				 i += 1;
			 }
		}
		 else
		 {
			 for (j = 0;j < m - 1;j++)
			 {
				 i += a[j];
			 }
		 }
		 yu = (i + d + yu) % 7;
		 System.out.printf("%s",b[yu]);
	}

}

