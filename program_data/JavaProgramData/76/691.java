package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[30000];
	public static int max(int a,int b)
	{
		return a > b != 0?a:b;
	}
	public static int min(int a,int b)
	{
		return a < b != 0?a:b;
	}

	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int a;
	 int b;
	 int ma = 0;
	 int mi = 999999;
	 int f = 1;
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			ma = max(ma, b);
			mi = min(mi, a);
			for (j = 2 * a;j <= 2 * b;j++)
			{
			t[j] = 1;
			}
	 }
			for (i = 2 * mi;i <= 2 * ma;i++)
			{
		if (t[i] == 0)
		{
			f = 0;
		}
			}
		f != 0?System.out.printf("%d %d",mi,ma):printf("no");

			return 0;
	}

}

