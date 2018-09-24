package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int r;
		int s = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			r = Integer.parseInt(tempVar3);
		}
		int[] a = new int[12];
		a[0] = 31,a[1] = 28,a[2] = 31,a[3] = 30,a[4] = 31,a[5] = 30,a[6] = 31,a[7] = 31,a[8] = 30,a[9] = 31,a[10] = 30,a[11] = 31;
		if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
		{
		  a[1] = 29;
		}
		 for (i = 0;i < y - 1;i++)
		 {
		  s = s + a[i];
		 }
		 s = s + r;
		 System.out.printf("%d\n",s);
		 System.in.read();
		 System.in.read();
	}
}

