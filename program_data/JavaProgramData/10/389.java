package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j;
	int k;
	int i;
	int max = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	int[] p = new int[k];
	int[] q = new int[k];
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p[0] = Integer.parseInt(tempVar2);
	}
	for (i = 1;i < k;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		p[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < k;i++)
	{
	q[i] = 1;
	}
	for (i = k - 2;i >= 0;i--)
	{
	  for (j = i + 1;j < k;j++)
	  {
		  if (p[i] >= p[j] != 0 && q[j] >= q[i])
		  {
					q[i] = q[j] + 1;
		  }
	  }
	}
	for (i = 0;i < k;i++)
	{
	 if (q[i] > max)
	 {
		 max = q[i];
	 }
	}
	System.out.printf("%d",max);

	}
}

