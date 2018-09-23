package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int x;
		int i;
		int n;
		int m = 0;
		int j = 0;
		int k = 0;
		int s;
		int l1;
		int l2;
		int l3;
		int[] a = new int[100000];
		int[] b = new int[100000];
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
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(a[i]) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(b[i]) = Integer.parseInt(tempVar4);
			}
			s = a[i] + b[i];
			if (s > m)
			{

				j = m;
				m = s;
				l2 = l1;
				l1 = i;
			}
			else if (s > j)
			{
			k = j;
			j = s;
			l3 = l2;
			l2 = i;
			}
			else if (s > k)
			{
				k = s;
			l3 = i;
			}
		}
		System.out.printf("%d %d\n",l1,m);
		System.out.printf("%d %d\n",l2,j);
		System.out.printf("%d %d\n",l3,k);
	}


}

