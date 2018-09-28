package <missing>;

public class GlobalMembers
{
	public static int f(int[] a, int n, int m)
	{
		int l;
		int i;
		int k;
		int sum;
		int j = 1;
	for (i = 0;i < n;i++)
	{
	  a[i] = 1;
	}
	  for (k = 1;k < n;k++)
	  {
		  for (sum = 0;sum < m;j++)
		  {
		  i = (j - 1) % n;
		sum = sum + a[i];
		  }
		a[i] = 0;
	  }
	  for (l = 0;l < n;l++)
	  {
		  if (a[l] != 0)
		  {
			return (l + 1);
		  }
	  }

	}
	  public static void Main()
	  {
		  int p;
		  int k = 0;
		  int n;
		  int m;
		  int[] a = new int[300];
		  int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (n != 0)
		{
			b[k] = f(a, n, m);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		k++;
		}
	 for (p = 0;p < k;p++)
	 {
		System.out.printf("%d\n",b[p]);
	 }

	  }
}

