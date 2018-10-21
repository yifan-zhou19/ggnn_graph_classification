package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int s1;
		int s2;
		int q1;
		int q2;
		int a;
		int b;
		int t;
		int k;
		int p;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			int[] pi = new int[100001];
			s1 = 0;
			s2 = 0;
			q1 = 0;
			q2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			for (j = 1;j <= a * b;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					pi + j - 1 = tempVar4;
				}
			}
			for (t = 1;t <= b;t++)
			{
				s1 = s1 + pi[t - 1];
				s2 = s2 + pi[a * b - t];
			}
			for (p = 1;p < a - 1;p++)
			{
				q1 = q1 + pi[p * b];
				q2 = q2 + pi[b - 1 + p * b];
			}
			s = s1 + s2 + q1 + q2;
			if (a == 1 & b == 1)
			{
				System.out.printf("%d\n",s / 2);
			}
			else
			{
				System.out.printf("%d\n",s);
			}
		}
		return 0;
	}

}

