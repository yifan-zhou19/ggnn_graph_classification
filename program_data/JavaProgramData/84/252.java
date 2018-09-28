package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int q = 0;
		int w = 0;
		int e = 0;
		int a;
		int b;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		q = a;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = Integer.parseInt(tempVar3);
		}
		w = a;
		if (q < w)
		{
			t = q;
			q = w;
			w = t;
		}

	for (i = 1;i <= n - 2;i++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a = Integer.parseInt(tempVar4);
		}
		if (a > q)
		{
			w = q;
			q = a;
		}
		else if (a > w)
		{
			w = a;
		}





	}
	System.out.printf("%d\n%d\n",q,w);

	}

}

