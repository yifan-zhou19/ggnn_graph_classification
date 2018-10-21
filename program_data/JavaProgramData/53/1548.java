package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int j = 0;
		int m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[0] = Integer.parseInt(tempVar2);
	}
	while (i < n)
	{
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		i++;
	}
	System.out.printf("%d",a[0]);
	i = 1;
	while (i < n)
	{
		j = i - 1;
		m = 0;
		while (j >= 0)
		{
		   if (a[i] == a[j])
		   {
			   m = 1;
		   }
		   j--;
		}
	   if (m == 0)
	   {
		   System.out.printf(",%d",a[i]);
	   }
	   i++;
	}
	return 0;
	}
}

