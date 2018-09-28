package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int m;
		 int i;
		 int j;
		 int k;
		 int[] a = new int[100];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i - 1] = Integer.parseInt(tempVar2);
		}
		}
		int[] b = new int[100];
		b[1] = 1;
		b[0] = 1;
		for (i = 2;i <= 22;i++)
		{
		  b[i] = b[i - 1] + b[i - 2];
		}
		  for (i = 0;i < n;i++)
		  {
			 m = a[i];
			 System.out.printf("%d\n",b[m - 1]);
		  }
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();

	}
}

