package <missing>;

public class GlobalMembers
{
	public static int f(int y, int m)
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int i;


		if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
		{
			days[2]++;
		}

		int f = 1;
		for (i = 1;i < m;i++)
		{
			f += days[i];
		}

		return f;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		int i;
		int[] y = new int[200];
		int[] m1 = new int[200];
		int[] m2 = new int[200];
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   y[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   m1[i] = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   m2[i] = Integer.parseInt(tempVar4);
		   }
		   if (f(y[i], m1[i]) % 7 == f(y[i], m2[i]) % 7)
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

