package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int j = 0;
		int[] c = new int[100];
		int z;
		int r;
		char[][] s = new char[100][10];
		char[][] b = new char[100][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] >= 60)
			{
				c[j] = a[i];
				b[j] = s[i];
				j++;
			}
		}
		for (z = j - 1;z > 0;z--)
		{
			for (r = 0;r < z;r++)
			{
				if (c[r] < c[r + 1])
				{
					int tep;
					String m = new String(new char[10]);
					tep = c[r + 1];
					c[r + 1] = c[r];
					c[r] = tep;
					m = b[r];
					b[r] = b[r + 1];
					b[r + 1] = m;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",b[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < 60)
			{
				System.out.printf("%s\n",s[i]);
			}
		}
		return 0;
	}
}

