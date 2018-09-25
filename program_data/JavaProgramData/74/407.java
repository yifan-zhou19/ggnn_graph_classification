package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int oho = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int k = 0;
		int[] save = new int[2000];
		int l;
		int x;
		int y = 0;
		for (i = m;i <= n;i++)
		{
			if (i == 1)
			{
				y++;
				continue;
			}
			else if (i == 2)
			{
				save[k] = i;
				k++;
				y++;
			}
			else
			{
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j == i)
				{
					save[k] = i;
					k++;
				}
				else
				{
					y++;
				}
			}
		}
		int r = 0;
		for (l = 0;l < k;l++)
		{
			if (oho(save[l]) == save[l])
			{
				System.out.printf("%d",save[l]);
				break;
			}
			else
			{
				r++;
			}
		}
		if (r == k)
		{
			System.out.print("no");
		}
		for (x = l + 1;x < k;x++)
		{
			if (oho(save[x]) == save[x])
			{
				System.out.printf(",%d",save[x]);
			}
		}
	}
	public static int oho(int x)
	{
		int r;
		int c = 0;
		while (x >= 1)
		{
			r = x % 10;
			x = x / 10;
			c = c * 10 + r;
		}
		return (c);
	}
}

