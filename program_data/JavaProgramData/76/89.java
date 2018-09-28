package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] first = new int[NUMBER];
		int[] second = new int[NUMBER];
		int i = 0;
		int j;
		int k;
		int x;
		int p;
		int y;
		int q;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				first[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				second[i] = Integer.parseInt(tempVar3);
			}
			i++;
		}
		for (j = (n - 1);j > 0;j--)
		{
			for (k = 0;k < j;k++)
			{
				if (first[k] > first[k + 1])
				{
					int tmpfirst;
					int tmpsecond;
					tmpfirst = first[k];
					tmpsecond = second[k];
					first[k] = first[k + 1];
					second[k] = second[k + 1];
					first[k + 1] = tmpfirst;
					second[k + 1] = tmpsecond;

				}
			}
		}
		i = 0;
		while (i < n)
		{
			p = 0;
			x = second[0];
			while (p <= i)
			{

				if (second[p] >= x)
				{
					x = second[p];
					p++;
				}
				else
				{
					p++;
				}
			}
			if (first[i + 1] <= x)
			{
				i++;
				continue;

			}
			else
			{
				break;
			}
		}
		q = 0;
		y = second[0];
		while (q < n)
		{
			   if (second[q] >= x)
			   {
					y = second[q];
					q++;
			   }
				else
				{
					q++;
				}

		}
		if (i == n)
		{
			System.out.printf("%d %d", first[0], y);
		}
		else
		{
			System.out.print("no");
		}
			return 0;
	}
}

