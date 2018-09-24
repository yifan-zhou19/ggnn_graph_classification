package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int[] answerx = new int[100];
		int[] answery = new int[100];
		int i = 1;
		int j = 1;
		int p;
		int q;
		int temp;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		answerx[0] = x;
		answery[0] = y;
		while (x != 1)
		{
			if (x % 2 == 0)
			{
				answerx[i] = x / 2;
				i++;
				x = x / 2;
			}
			else
			{
				answerx[i] = (x - 1) / 2;
				i++;
				x = (x - 1) / 2;
			}
		}
		while (y != 1)
		{
			if (y % 2 == 0)
			{
				answery[j] = y / 2;
				j++;
				y = y / 2;
			}
			else
			{
				answery[j] = (y - 1) / 2;
				j++;
				y = (y - 1) / 2;
			}
		}
		for (p = i - 1;p >= 0;p--)
		{
			for (q = j - 1;q >= 0;q--)
			{
				if (answerx[p] == answery[q])
				{
					temp = answerx[p];
					r = 1;
					break;
				}
			}
		}
		if (r == 1)
		{
			System.out.printf("%d\n",temp);
		}
		else
		{
			System.out.print("1\n");
		}
	}
}

