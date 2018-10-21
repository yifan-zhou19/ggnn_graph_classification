package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int[] s = new int[50000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
	int c = a[0];
	int d = b[0];
	for (int i = 0;i < n;i++)
	{
	  if (c > a[i])
	  {
		 c = a[i];
	  }
	  if (d < b[i])
	  {
		 d = b[i];
	  }
	for (int m = c;m <= d;m++)
	{
	   s[m] = 1;
	   for (int i = 0;i < n;i++)
	   {
		   if (m >= a[i] != 0 && m < b[i])
		   {
			  s[m] = 0;
		   }
	   }
	}
	}
	int result = 0;
	for (int m = c;m < d;m++)
	{
		result += s[m];
	}
	if (result == 0)
	{
	System.out.printf("%d %d",c,d);
	}
	else
	{
	System.out.print("no");
	}
	return 0;
	}



}

