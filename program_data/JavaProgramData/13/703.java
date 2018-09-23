package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		}
		if (n == 1)
		{
		System.out.printf("%d",a[0]);
		}
		else
		{
		System.out.printf("%d",a[0]);
		for (i = 1;i < n - 1;i++)
		{
		  for (j = 0;j < i;j++)
		  {
			if (a[i] == a[j])
			{
			break;
			}
		  }
		  if (i == j && a[i] != a[i - 1])
		  {
		  System.out.printf(" %d",a[i]);
		  }
		}
		 for (j = 0;j < n - 1;j++)
		 {
			if (a[n - 1] == a[j])
			{
			break;
			}
		 }
		  if (n - 1 == j && a[n - 1] != a[n - 2])
		  {
		  System.out.printf(" %d",a[n - 1]);
		  }
		}
		  System.in.read();
		  System.in.read();
	}

}

