package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j = 0;
	  int m;
	  int[][] a = new int[N][2];
	  int[] b = new int[N];
	  int[] c = new int[N];
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
			a[i][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][1] = Integer.parseInt(tempVar3);
		}
		if (a[i][0] <= 140 && a[i][0] >= 90 && a[i][1] <= 90 && a[i][1] >= 60)
		{
		  b[i] = 1;
		}
		else
		{
		  b[i] = 0;
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		while (j < n)
		{
		  if (b[j] == 1)
		  {
			c[i]++;
			j++;
		  }
		  else
		  {
			j++;
			break;
		  }
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < n - i;j++)
		{
		  if (c[j] < c[j + 1])
		  {
			m = c[j];
			c[j] = c[j + 1];
			c[j + 1] = m;
		  }
		}
	  }
	  System.out.printf("%d",c[0]);
	  return 0;
	}
}

