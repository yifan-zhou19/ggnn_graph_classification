package <missing>;

public class GlobalMembers
{
	public static int r(int x)
	{
		if (x % 4 != 0 || (x % 100 == 0 && x % 400 != 0))
		{
		 return (0);
		}
		 else
		 {
		 return (1);
		 }
	}

	public static int Main()
	{
		int m;
		int y;
		int i;
		int j;
		int d;
		int s;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		int[] a = new int[13];
		a[1] = 31;
		a[3] = 31;
		a[4] = 30;
		a[5] = 31;
		a[6] = 30;
		a[7] = 31;
		a[8] = 31;
		a[9] = 30;
		a[10] = 31;
		a[11] = 30;
		a[12] = 31;

		if (r(m) == 1)
		{
		   a[2] = 29;
		}
		else
		{
		   a[2] = 28;
		}
		for (s = 0,i = 1;i < y;i++)
		{
			s = s + a[i];
		}

		   s = s + d;

		   System.out.printf("%d",s);


	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}

}

