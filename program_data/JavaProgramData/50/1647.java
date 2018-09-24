package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int t;
		int m;
		int n;
		int h;
		int g;
		int[] a = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		for (i = 0;i < 12;i++)
		{
		   if (i == 0)
		   {
			   h = 12;
		   }
		   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
		   {
			   h = 31;
		   }
		   if (i == 2)
		   {
			   h = 28;
		   }
		   if (i == 4 || i == 6 || i == 9 || i == 11)
		   {
			   h = 30;
		   }
		   m = m + h;
		   a[i] = m;
		}
		k = 0;
		k = 5 - n;
		if (k < 0)
		{
			k = 7 + k;
		}
		for (i = 0;i < 12;i++)
		{
			t = i + 1;
		   g = a[i] % 7;
		   if (g == k)
		   {
			   System.out.printf("%d\n",t);
		   }
		}
		return 0;
	}

}

