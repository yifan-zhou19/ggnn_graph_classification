package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int[] a = new int[100];
	int i;
	int zd;
	int cd;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	if (i == 0)
	{
	zd = a[i];
	}
	if (a[i] > zd)
	{
		zd = a[i];
		 t = i;
	}
	}
	  for (i = 0;i <= n - 1;i++)
	  {
		  if (i == 0 && t != 0)
		  {
		 cd = a[0];
		  }
		if (i == 0 && t == 0)
		{
			cd = a[1];
		 continue;
		}
		if (i == t)
		{
			continue;
		}
		if (a[i] > cd)
		{
			cd = a[i];
		}
	  }
	System.out.printf("%d\n%d\n",zd,cd);

	}
}

