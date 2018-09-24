package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		int n;
		int i;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] c = new int[n];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		int[] b = new int[21];
		b[0] = 0;
		b[1] = b[2] = 1;
		for (i = 3;i < 21;i++)
		{
		   b[i] = b[i - 1] + b[i - 2];
		}
		for (i = 0;i < n;i++)
		{
		   k = a[i];
		   c[i] = b[k];
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d\n",c[i]);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		return 0;
		}

}

