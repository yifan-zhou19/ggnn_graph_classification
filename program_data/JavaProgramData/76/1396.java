package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] q = new int[50000];
	int[] z = new int[50000];
	int i;
	int n;
	int k;
	int e;
	int[] zm = new int[50000];
	int max = 0;
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
		  q[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  z[i] = Integer.parseInt(tempVar3);
	  }
	}
	for (k = 1;k <= n;k++)
	{
	  for (i = 0;i < n - k;i++)
	  {
		if (q[i] > q[i + 1])
		{
		  e = q[i];
		  q[i] = q[i + 1];
		  q[i + 1] = e;
		  e = z[i];
		  z[i] = z[i + 1];
		  z[i + 1] = e;
		}
	  }
	}

	int l = n - 1;
	for (i = 1;i <= n;i++)
	{
	  for (k = 0;k <= n - i;k++)
	  {
		if (z[k] > z[max])
		{
		  max = k;
		}
	  }
	  zm[l] = z[max];
	  l--;
	  max = 0;
	}
	int p = 0;
	for (i = 0;i < n - 1;i++)
	{
	  if (q[i + 1] <= zm[i])
	  {
		p++;
	  }
	}
	if (p != n - 1)
	{
	  System.out.print("no");
	}
	if (p == n - 1)
	{
	  System.out.printf("%d %d",q[0],zm[n - 1]);
	}
	return 0;
	}

}

