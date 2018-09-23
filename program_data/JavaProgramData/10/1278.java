package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[25];
	int[] b = new int[25];
	int k;
	int i;
	int j;
	int max = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		b[i] = 1;
	}
	for (i = 1;i < k;i++)
	{
	 for (j = 0;j < i;j++)
	 {
	  if (a[j] >= a[i])
	  {
		if (b[j] + 1 > b[i])
		{
			b[i] = b[j] + 1;
		}
	  }
	 }
	}
	for (i = 0;i < k;i++)
	{
	 if (b[i] > max)
	 {
		 max = b[i];
	 }
	}
	System.out.printf("%d",max);
	}
}

