package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int num;
		int len;
		int[] c = new int[500];
		int[] d = new int[500];
		String a = new String(new char[500]);
		String b = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		len = a.length();
		for (x = 0;x < len - n + 1;x++)
		{
			num = 0;
			for (i = 0;i < n;i++)
			{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(x + i));
			}
			for (i = x;i < len - n + 1;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (b.charAt(j) != a.charAt(i + j))
					{
					break;
					}
				}
				if (j == n)
				{
				num = num + 1;
				}
			}
			c[x] = num;
		}

		for (i = 0;i < len - n + 1;i++)
		{
		d[i] = c[i];
		}
		for (i = 0;i < len - n;i++)
		{
		if (c[i] >= c[i + 1])
		{
			y = c[i];
			c[i] = c[i + 1];
			c[i + 1] = y;
		}
		}

		if (c[len - n] == 1)
		{
		System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",c[len - n]);
			for (i = 0;i < len - n + 1;i++)
			{
			if (d[i] == c[len - n])
			{
				for (j = 0;j < n;j++)
				{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i + j));
				}
				for (j = 0;j < n;j++)
				{
				System.out.printf("%c",b.charAt(j));
				}
				System.out.print("\n");
			}
			}
		}
	}

}

