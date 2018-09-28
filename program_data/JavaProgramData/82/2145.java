package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] n = new int[1000];
		int[] m = new int[1000];
		int k;
		int a;
		int s;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] d = new int[1000];
		for (i = 0,a = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			if (m[i] >= 90 && m[i] <= 140 && n[i] <= 90 && n[i] >= 60)
			{
			   d[a]++;
			}
			else
			{
				a++;
			}
			p = a;
		}
		for (i = p;i > 0;i--)
		{
			if (d[i] > d[i - 1])
			{
				s = d[i];
				d[i] = d[i - 1];
				d[i - 1] = s;
			}
		}
		System.out.printf("%d",d[0]);

		return 0;
	}
}

