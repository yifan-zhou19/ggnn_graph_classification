package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int i = 1;
		int j;
		int k;
		int flag = 0;
		int[] a = new int[300];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[0] = Integer.parseInt(tempVar);
	}
	while (scanf(",%d", a[i]))
	{
		n++;
		i++;
	}
	for (i = 1;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	if (n >= 2)
	{
		  for (i = 0;i < n - 1;i++)
		  {
		   for (j = i + 1;j < n;j++)
		   {
			   if (a[i] > a[j])
			   {
				   k = a[i];
				   a[i] = a[j];
				   a[j] = k;
			   }
		   }
		  }
	for (i = n - 2;i >= 0;i--)
	{
		if (a[i] != a[n - 1])
		{
			System.out.printf("%d",a[i]);
			flag++;
			break;
		}
	}
	}
	if (flag == 0)
	{
		System.out.print("No");
	}
	}
}

