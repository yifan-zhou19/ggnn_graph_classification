package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int min = 0;
	int max = 0;
	float j;
	int[] a = new int[50000];
	int[] b = new int[50000];
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
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (i == 0)
	{
	min = a[0];
	max = b[0];
	}
	if (a[i] < min)
	{
		min = a[i]; //?????//
	}
	if (b[i] > max)
	{
		max = b[i];
	}
	}

	for (j = min + 0.0;j <= max + 0.0;j = j + 0.5)
	{
	  for (i = 0;i < n;i++)
	  {
		if (a[i] <= j != 0 && j <= b[i])
		{
			break;
		}
	  }
	  if (i == n)
	  {
		  System.out.print("no");
		  break;
	  }
	}

	if (j > max)
	{
		System.out.printf("%d %d",min,max);
	}
	return 0;
	}
}

