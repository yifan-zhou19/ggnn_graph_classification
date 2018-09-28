public class date
{
   public int year;
   public int m1;
   public int m2;
}

package <missing>;

public class GlobalMembers
{
	public static date[] date = tangible.Arrays.initializeWithDefaultdateInstances(200);
	public static int Main()
	{
		int f = new int(int p,int m,int n);
		int i;
		int p = 0;

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			date[i].year = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			date[i].m1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			date[i].m2 = Integer.parseInt(tempVar4);
		}
		}

		for (i = 0;i < n;i++)
		{
						if (((date[i].year % 4 == 0 && date[i].year % 100 != 0) || (date[i].year % 400 == 0)) && (date[i].m1 <= 2 || date[i].m2 <= 2))
						{
	  p++;
						}
	 f(p, date[i].m1, date[i].m2);
	 p = 0;
		}
	 return 0;
	}
	public static int f(int p,int m,int n)
	{
		int[] a = {1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 0};
		if ((Math.abs(a[m - 1] - a[n - 1]) + p) % 7 == 0)
		{
		System.out.print("YES\n");
		}
		else
		{
		System.out.print("NO\n");
		}
	}
}

