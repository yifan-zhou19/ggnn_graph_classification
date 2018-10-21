package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int m;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		}
		for (j = 1;j < n;j++)
		{
		  for (i = 0;i < n - j;i++)
		  {
		   if (b[i] > b[i + 1])
		   {
			 s = b[i + 1];
			 b[i + 1] = b[i];
			 b[i] = s;
			 m = a[i + 1];
			 a[i + 1] = a[i];
			 a[i] = m;
		   }
		  }
		}
	   for (i = n - 2;i >= 0;i--)
	   {
		  if (b[i] >= a[n - 1] != 0 && a[i] < a[n - 1])
		  {
		   a[n - 1] = a[i];
		  }
		  if (b[i] < a[n - 1])
		  {
		   h = 1;
		  }
	   }
	   if (h == 0)
	   {
		System.out.printf("%d %d",a[n - 1],b[n - 1]);
	   }
		if (h == 1)
		{
		System.out.print("no");
		}
		return 0;
	}

}

