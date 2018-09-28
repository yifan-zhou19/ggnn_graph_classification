package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int[] b = new int[300];
	int n;
	int i;
	int j;
	int m;
	int x;
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
		  a[i] = Integer.parseInt(tempVar2);
	  }
	}
	b[0] = a[0];
	j = 0;
	m = 1;
	for (i = 0;i < n;i++)
	{
	  if (b[j] == a[i])
	  {
		  ;
	  }
	  else
	  {
		for (j = 0;j < m;j++)
		{
			if (b[j] != a[i])
			{
				x = 1;
			}
			else
			{
				x = 0;
				break;
			}
		}
		if (x != 0)
		{
		 b[m] = a[i];
		 j = m++;
		}
	  }
	}
	for (j = 0;j < m - 1;j++)
	{
	System.out.printf("%d,",b[j]);
	}
	System.out.printf("%d\n",b[m - 1]);
	}
}

