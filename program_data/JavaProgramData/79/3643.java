package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int n;
		int m;
		int i;
		int s;
		int[] a = new int[301];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (n != 0)
		{
			for (i = 1;i <= 300;i++)
			{
				a[i] = 0;
			}
			i = 0;
			s = n;
			for (;s >= 1;)
			{
				t = m;
				s--;
				while (t > 0)
				{
					i = ((1 + i) > n)? 1:(i + 1);
					while (a[i] != 0)
					{
						i = ((1 + i) > n)? 1:(i + 1);
					}
					t--;
				}
				a[i] = 1;

			}
			System.out.printf("%d\n",i);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
	}

}

