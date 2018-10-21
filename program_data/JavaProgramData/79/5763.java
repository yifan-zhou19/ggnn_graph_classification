package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int s;
		int x;
		int[] a = new int[301];
		int i;
		for (i = 1;i <= 300;i++)
		{
			a[i] = i;
		}
		x = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
			while (n != 0 || m != 0)
			{

			if (n == 0 || m == 0)
			{
				break;
			}
			s = n;
			for (i = 1;i <= 300;i++)
			{
				a[i] = i;
			}
			x = 1;
			while (s > 1)
			{
				for (i = 1;i < m;i++)
				{
					x++;
					if (x > n)
					{
						x = x - n;
					}
					while (a[x] == 0)
					{
						x++;
						if (x > n)
						{
							x = x - n;
						}
					}
				}
				a[x] = 0;
				s = s - 1;
				x = x + 1;
				if (x > n)
				{
					x = x - n;
				}
				while (a[x] == 0)
				{
					x = x + 1;
					if (x > n)
					{
						x = x - n;
					}
				}
			}
			System.out.printf("%d\n",x);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
			}
	}

}

