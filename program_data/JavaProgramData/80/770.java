public class d
{
	public int y;
	public int m;
	public int d;
}

package <missing>;

public class GlobalMembers
{
	public static int days(d d1, d d2)
	{
	int[][] mon =
	{
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};

	int i;
	int td = 0;
	for (i = d1.y;i < d2.y;i++)
	{
	td += leap(i)?366:365;
	}

	for (i = 1;i < d1.m;i++)
	{
	  td -= mon[leap(d1.y)][i];
	}
	td -= d1.d - 1;

	for (i = 1;i < d2.m;i++)
	{
	  td += mon[leap(d2.y)][i];
	}
	td += d2.d - 1;

	return td;
	}


	public static int Main()
	{
		d d1 = new d();
		d d2 = new d();
	int td;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		d1.y = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		d1.m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		d1.d = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d2.y = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		d2.m = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		d2.d = Integer.parseInt(tempVar6);
	}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: td=days(d1,d2);
	td = days(new d(d1), new d(d2));
	System.out.printf("%ld",td);
	return 0;
	}

}

