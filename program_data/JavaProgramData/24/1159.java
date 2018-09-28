package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfsz = new String(new char[w]);
		zfsz = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int len;
		int max;
		int min;
		int m;
		int a;
		int b;
		int[] sz = new int[100];
		len = zfsz.length();
		sz[0] = -1;
		j = 1;
		for (i = 0;i < len;i++)
		{
			if (zfsz.charAt(i) == ' ')
			{
				sz[j] = i;
				j++;
			}
		}
		sz[j] = i;
		max = sz[1] - sz[0] - 1;
		a = 0;
		min = sz[2] - sz[1] - 1;
		b = 0;
		if (max < min)
		{
			m = max;
			max = min;
			min = m;
			a = 1;
			b = 0;
		}
		for (k = 3;k <= j;k++)
		{
			m = sz[k] - sz[k - 1] - 1;
			if (m > max)
			{
				max = m;
				a = k - 1;
			}
			else if (m < min)
			{
				min = m;
				b = k - 1;
			}
		}
		for (i = sz[a] + 1;i < sz[a + 1] - 1;i++)
		{
			System.out.printf("%c",zfsz.charAt(i));
		}
		System.out.printf("%c\n",zfsz.charAt(i));
		for (j = sz[b] + 1;j <= sz[b + 1] - 1;j++)
		{
			System.out.printf("%c",zfsz.charAt(j));
		}


		return 0;
	}

}
