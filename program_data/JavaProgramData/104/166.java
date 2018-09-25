package <missing>;

public class GlobalMembers
{
	public static int find(int a, int[] b)
	{
		int i;
		int[] j = new int[100];
		int k;
		int l = a;
		j[0] = 1;
		for (i = 1;i < 100;i++)
		{
			j[i] = 2 * j[i - 1];
		}
		for (i = 0;;i++)
		{
			if (a > j[i])
			{
				a = a - j[i];
			}
			else
			{
				break;
			}
		}
		k = i + 1;
		b[0] = l;
		for (i = 1;i < k;i++)
		{
			if (b[i - 1] % 2 == 0)
			{
				b[i] = b[i - 1] / 2;
			}
			else
			{
				b[i] = (b[i - 1] - 1) / 2;
			}
		}
		return k;
	}

	public static int Main()
	{
		int[] sx = new int[1000]; //????xi?yi
		int[] sy = new int[1000];
		int x;
		int y;
		int i;
		int j;
		int k;
		int l;
		int xi = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		if (x == y)
		{
			xi = x;
		}
		else
		{
		i = find(x, sx);
		j = find(y, sy);

		for (k = i,l = j;;k--,l--)
		{
			 if (sx[k] != sy[l])
			 {
				xi = sx[k + 1];
			 }
			if (xi != 0)
			{
				break;
			}
		}
		}
		System.out.printf("%d\n",xi);
	}
}

