package <missing>;

public class GlobalMembers
{
	public static int qium(int num, int resi)
	{
		int i;
		int j;
		int k = 1;
		int a;
		int b;
		i = -1;
		while (k != num)
		{
			k = 1;
			i++;
			a = num * (i + 1) + resi;
			b = a;
			for (j = 0; ;j++)
			{
				b = (num - 1) * (b - resi) / num;
				if ((b < num) || (b % num != resi))
				{

					break;
				}
				else
				{
					k++;
				}
			}
		}
		return a;
	}
	public static int Main()
	{
		int n;
		int p;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		m = qium(n, p);
		System.out.printf("%d",m);
		return 0;
	}

}

