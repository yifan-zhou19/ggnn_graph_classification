package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int[] p = new int[1001];
		int s = 0;
		int j;
		int i;
		int ma;
		char c;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[s] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			s += 1;
			if (c != ',')
			{
				break;
			}
		}
		System.out.print("\n");
		s = 0;
		while (true)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[s] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			s += 1;
			if (c != ',')
			{
				break;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < s;j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					p[i] += 1;
				}
			}
		}
		ma = p[0];
		for (i = 0;i < 1000;i++)
		{
			if (p[i] > ma)
			{
				ma = p[i];
			}
		}


		System.out.printf("%d %d",s,ma);

	}


}

