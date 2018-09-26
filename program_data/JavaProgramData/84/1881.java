package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] an = new int[100];
		int a;
		int b;
		int M;
		int m;
		int n;
		int i;
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
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a >= b)
		{
			M = a;
			m = b;
		}
		else
		{
			m = a;
			M = b;
		}
		for (i = 2;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				an[i] = Integer.parseInt(tempVar4);
			}
			if (an[i] > M)
			{
				m = M;
				M = an[i];
			}
			else if (an[i] < M && an[i]> m)
			{
				m = an[i];
			}
		}
		System.out.printf("%d\n%d",M,m);
		return 0;
	}

}

