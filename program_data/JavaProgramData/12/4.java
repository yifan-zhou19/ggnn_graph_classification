package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int p;
		for (p = 1;p <= 100;p++)
		{
			int[] a = new int[17];
			int u;
			int i = 0;
			for (u = 1;u <= 16;u++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[u] = Integer.parseInt(tempVar);
				}
				i++;
				if (a[u] == 0)
				{
					 break;
				}
			}
			if (a[1] == -1)
			{
				break;
			}
			int j;
			int k;
			int t;
			for (j = 1;j < i - 1;j++)
			{
				for (k = j + 1;k < i;k++)
				{
					if (a[j] > a[k])
					{
						t = a[k];
						a[k] = a[j];
						a[j] = t;
					}
				}
			}
			int r;
			int s;
			int w = 0;
			for (r = 1;r < i - 1;r++)
			{
				for (s = r + 1;s <= i - 1;s++)
				{
					   if (a[r] * 2 == a[s])
					   {
						w = w + 1;
						break;
					   }
				}
			}
			System.out.printf("%d\n",w);
		}
	}

}

