public class s
{
		public int a;
		public int[] sc = new int[2];
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		s[] st = tangible.Arrays.initializeWithDefaultsInstances(100000);
		int t = 0;
		int j = 0;
		int max = 0;
		int[] p = {-1, -1, 0};
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				st[i].sc[0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				st[i].sc[1] = Integer.parseInt(tempVar4);
			}
			st[i].sc[0] = st[i].sc[0] + st[i].sc[1];
		}
		i = 0;
		while (t < 3)
		{
			if (i < n && i != p[0] && i != p[1])
			{
				j = (st[i].sc[0] > max)? i:j;
				max = (st[i].sc[0] > max)? st[i].sc[0]:max;
				i++;
			}
			else if (i < n && (i == p[0] || i == p[1]))
			{
				i++;
			}
			else if (i = n)
			{
				System.out.printf("%d %d\n",j + 1,max);
				p[t] = j;
				t++;
				j = 0;
				max = 0;
				i = 0;
			}
		}
	}
}

