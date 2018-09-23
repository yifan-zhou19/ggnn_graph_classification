package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 1;
		for (i = 1;i <= n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  k = Integer.parseInt(tempVar2);
		  }
		  if (b[k] == 0)
		  {
			a[j] = k;
			j++;
			b[k] = 1;
		  }
		}
		  for (i = 1;i < j;i++)
		  {
			if (i == 1)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		  }
	}
}

