package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int[] a = new int[100000];
	int[] b = new int[100000];
	int l;
	int i = 0;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[0] = Integer.parseInt(tempVar3);
	}
	while (!(a[i] == 0 && b[i] == 0))
	{
		i++;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[i] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[i] = Integer.parseInt(tempVar5);
		}
	}
	for (j = 0;j < n;j++)
	{
		l = 0;
	  for (k = 0;k < i;k++)
	  {
	  if (a[k] == j)
	  {
		  break;
	  }
	  else if (b[k] == j)
	  {
		  l++;
	  }
	  }
	  if (l == n - 1)
	  {
		  break;
	  }
	}
	if (j == n)
	{
		System.out.print("NOT FOUND");
	}
	else
	{
		System.out.printf("%d",j);
	}
	}

}

