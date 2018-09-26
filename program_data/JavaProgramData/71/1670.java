package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[13];
	  a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = a[12] = 31;
	  a[2] = 28;
	  a[4] = a[6] = a[9] = a[11] = 30;
	  int n;
	  int y;
	  int m1;
	  int m2;
	  int i;
	  int j;
	  int x;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		k = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			m2 = Integer.parseInt(tempVar4);
		}
		if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
		{
		  a[2] = 29;
		}
		else
		{
		  a[2] = 28;
		}
		if (m2 < m1)
		{
		  x = m2;
		  m2 = m1;
		  m1 = x;
		}
		for (j = m1;j < m2;j++)
		{
		  k += a[j];
		}
		if (k % 7 == 0)
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

