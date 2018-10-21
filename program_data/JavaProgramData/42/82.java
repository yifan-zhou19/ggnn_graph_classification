package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100000];
	int x;
	int n;
	int i;
	int j;
	int k;
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		x = Integer.parseInt(tempVar3);
	}
	k = 0;
	for (i = 0;i < n - k;i++)
	{
	  while (a[i] == x)
	  {
		  for (j = 0;j < (n - k - i - 1);j++)
		  {
			  a[i + j] = a[i + j + 1];
		  }
		  k++;
		  if (i >= n - k)
		  {
			  break;
		  }
	  }
	}
	for (i = 0;i < (n - k - 1);i++)
	{
		System.out.printf("%d ",a[i]);
	}
		System.out.printf("%d",a[i]);
	return 0;
	}
}

