package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int c;
		int[] a = new int[21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (j = 1;j <= n;j++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  k = Integer.parseInt(tempVar2);
		  }
		  for (i = 3;i <= k;i++)
		  {
			a[1] = 1;
			a[2] = 1;
		   a[i] = a[i - 1] + a[i - 2];
		  }
			c = a[k];
			System.out.printf("%d\n",c);
		}
		System.in.read();
		System.in.read();
	}

}

