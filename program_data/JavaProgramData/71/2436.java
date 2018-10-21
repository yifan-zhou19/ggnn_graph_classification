package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   int y;
	   int m1;
	   int m2;
	   int d;
	   int i;
	   int j;
	   int n;
	   int t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
		   d = 0;
		   days[2] = 28;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   y = Integer.parseInt(tempVar2);
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

		   if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		   {
			days[2]++;
		   }
		   if (m1 > 12 || m1 < 1 || m2>12 || m2 < 1)
		   {
			   System.out.print("NO");
		   }
		   else if (m1 > m2)
		   {
			   t = m1;
			   m1 = m2;
			   m2 = t;
		   }
		   for (j = m1;j < m2;j++)
		   {
			   d = d + days[j];
		   }
		   if (d % 7 == 0)
		   {
			   System.out.print("YES\n");
		   }
		   else
		   {
			   System.out.print("NO\n");
		   }
	   }


	}
}

