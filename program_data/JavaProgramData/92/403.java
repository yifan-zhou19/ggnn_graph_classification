package <missing>;

public class GlobalMembers
{
	public static int paixu(tangible.RefObject<Integer> x, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (*(x.argValue + j) < *(x.argValue + j + 1))
				{
					temp = (x.argValue + j);
					*(x.argValue + j) = *(x.argValue + j + 1);
					*(x.argValue + j + 1) = temp;
				}
			}
		}
		return 0;
	}

	public static int Main()
	{
		int n;
		int[] tj = new int[1000];
		int[] p1 = tj;
		int[] qw = new int[1000];
		int[] p2 = qw;
		int i;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
		sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p1 + i) = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p2 + i) = tempVar3;
			}
		}
	tangible.RefObject<Integer> tempRef_p1 = new tangible.RefObject<Integer>(p1);
		paixu(tempRef_p1, n);
		p1 = tempRef_p1.argValue;
	tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p2);
		paixu(tempRef_p2, n);
		p2 = tempRef_p2.argValue;
		int maxtj = 0;
		int mintj = n - 1;
		int maxqw = 0;
		int minqw = n - 1;
		while (mintj >= maxtj)
		{
			if (p1[mintj] > p2[minqw])
			{
				sum++;
				mintj--;
				minqw--;
			}
			else if (p1[mintj] < p2[minqw])
			{
				sum--;
				mintj--;
				maxqw++;
			}
			else
			{
				if (p1[maxtj] > p2[maxqw])
				{
					sum++;
					maxtj++;
					maxqw++;
				}
				else if (p1[maxtj] < p2[maxqw])
				{
					sum--;
					mintj--;
					maxqw++;
				}
				else if (p1[mintj] == p2[maxqw])
				{
					mintj--;
					maxqw++;
				}
				else
				{
					sum--;
					mintj--;
					maxqw++;
				}
			}
		}
		System.out.printf("%d",sum * 200);
		System.out.print("\n");
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		}
		return 0;
	}
}

