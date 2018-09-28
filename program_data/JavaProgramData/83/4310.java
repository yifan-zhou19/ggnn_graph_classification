package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int xuefen = 0;
		int[] x = new int[10];
		int[] s = new int[10];
		double[] j = new double[10];
		double gpa;
		double ji;
		double jidian = 0.0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	for (t = 0;t < n;t++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(x[t]) = Integer.parseInt(tempVar2);
	}
	}
	  for (t = 0;t < n;t++)
	  {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   (s[t]) = Integer.parseInt(tempVar3);
		   }
	  if ((s[t]) >= 90)
	  {
		 ji = 4.0;
	  }
	  else if ((s[t]) <= 89 && (s[t]) >= 85)
	  {
		  ji = 3.7;
	  }
	else if ((s[t]) <= 84 && (s[t]) >= 82)
	{
		 ji = 3.3;
	}
	else if ((s[t]) <= 81 && (s[t]) >= 78)
	{
		 ji = 3.0;
	}
	else if ((s[t]) <= 77 && (s[t]) >= 75)
	{
		 ji = 2.7;
	}
	else if ((s[t]) <= 74 && (s[t]) >= 72)
	{
		 ji = 2.3;
	}
	else if ((s[t]) <= 71 && (s[t]) >= 68)
	{
		 ji = 2.0;
	}
	else if ((s[t]) <= 67 && (s[t]) >= 64)
	{
		 ji = 1.5;
	}
	else if ((s[t]) <= 63 && (s[t]) >= 60)
	{
		 ji = 1.0;
	}
	else
	{
		 ji = 0.0;
	}
	j[t] = x[t] * ji;
	  }
	for (t = 0;t < n;t++)
	{
	xuefen = xuefen + (x[t]);
	jidian = jidian + (j[t]);
	}
	gpa = jidian / xuefen;
	System.out.printf("%.2f",gpa);
	   return 0;
	}
}

