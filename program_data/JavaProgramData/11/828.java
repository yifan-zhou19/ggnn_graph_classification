package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
		  a[1] = 29;
		  if (m == 1)
		  {
		  n = n + d;
		  }
		 else
		 {
		 for (int i = 1;i < m;i++)
		 {
		 n = n + a[i - 1];
		 }
		 n = n + d;
		 }
		}
	   else
	   {
		 if (m == 1)
		 {
		  n = n + d;
		 }
		else
		{
			for (int i = 1;i < m;i++)
			{
		 n = n + a[i - 1];
			}
		 n = n + d;
		}

	   }
		System.out.printf("%d",n);
		System.in.read();
		System.in.read();
	}

}

