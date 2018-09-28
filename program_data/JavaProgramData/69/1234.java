package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int j;
		int i;
		int l;
		int t;
		int q = 0;
		int w = 0;
		int y;
		int[] m = new int[300];
		int[] n = new int[300];
		int[] k = new int[300];
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		x = a.length();
		y = b.length();

		for (i = x;i >= 0;i--)
		{
			m[i] = a.charAt(i) - '0';
			if (m[i] == 0)
			{
				q += 1;
			}
		}
		for (i = y;i >= 0;i--)
		{
			n[i] = b.charAt(i) - '0';
			if (n[i] == 0)
			{
				w += 1;
			}
		}
		if (q == x && w == y)
		{
			System.out.print("0");
			return 0;
		}
		if (x >= y)
		{
			l = x;
			for (i = x;i >= x - y + 1;i--)
			{
				k[i] = k[i] + m[i - 1] + n[i - x + y - 1];
				if (k[i] >= 10)
				{
					k[i] = k[i] - 10;
					k[i - 1] = k[i - 1] + 1;
				}
			}
			for (i = x - y;i > 0;i--)
			{
				k[i] = k[i] + m[i - 1];
				if (k[i] >= 10)
				{
					k[i] = k[i] - 10;
					k[i - 1] = k[i - 1] + 1;
				}
			}
		}
		if (x < y)
		{
			l = y;
			for (i = y;i >= y - x + 1;i--)
			{
				k[i] = k[i] + n[i - 1] + m[i - y + x - 1];
				if (k[i] >= 10)
				{
					k[i] = k[i] - 10;
					k[i - 1] = k[i - 1] + 1;
				}
			}
			for (i = y - x;i > 0;i--)
			{
				k[i] = k[i] + n[i - 1];
				if (k[i] >= 10)
				{
					k[i] = k[i] - 10;
					k[i - 1] = k[i - 1] + 1;
				}
			}
		}
		//printf("%d %d %d",k[0],k[1],k[2]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
		for (i = 0;i <= l;i++)
		{
			if (k[i] != 0)
			{
				j = i;
				t = l + 1 - j;
				break;
			}
		}
		for (i = 0;i <= t - 1;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, k[j + i] + '0');
		}
		System.out.printf("%s",a);
		return 0;
	}

}

