package <missing>;

public class GlobalMembers
{
	public static int nian(int m)
	{
		if ((m % 400 == 0) || ((m % 100 != 0) && (m % 4 == 0)))
		{
		return 1;
		}
		else
		{
		 return 0;
		}
	}
	public static int Main()
	{
		int i;
		int s = 0;
		int n;
		int y;
		int r;
		int[] a = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = Integer.parseInt(tempVar3);
		}
		a[0] = a[2] = a[4] = a[6] = a[7] = a[9] = a[11] = 31;
		a[3] = a[5] = a[8] = a[10] = 30;
		if (nian(n) != 0)
		{
		   a[1] = 29;
		}
	   else
	   {
		   a[1] = 28;
	   }
		   for (i = 0;i < y - 1;i++)
		   {
		   s += a[i];
		   }
		   s += r;
		   System.out.printf("%d",s);
		   return 0;
	}


}

