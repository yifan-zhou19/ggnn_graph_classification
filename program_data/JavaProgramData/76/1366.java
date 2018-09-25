package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[10003];
		int i;
		int max;
		int min;
		int k;
		int s = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		int t1 = a[0];
		int t2 = b[0];
		for (i = 1;i < n;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			a[i] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[i] = Integer.parseInt(tempVar5);
		}
		if (a[i] < t1)
		{
			t1 = a[i];
		}
		if (b[i] > t2)
		{
			t2 = b[i];
		}
		}
		for (i = 0;i < n;i++)
		{

		  for (k = a[i] * 2;k <= b[i] * 2;k++)
		  {
		  c[k] = 1;
		  }
		}
		for (k = 0;k < 10001;k++)
		{
		s += c[k];
		}
		if ((t2 - t1 + 1) * 2 - 1 != s)
		{
		System.out.print("no");
		}
		else
		{
		System.out.printf("%d %d",t1,t2);
		}

	return 0;
	}
}

