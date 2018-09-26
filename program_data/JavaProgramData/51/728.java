package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s;
		int[] p = new int[999];
		int m;
		int[] w = new int[99];
		int x;
		int l;
		String a = new String(new char[999]);
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
		l = a.length();
		for (k = 0;k < n;k++)
		{
			a = tangible.StringFunctions.changeCharacter(a, l + k, '2');
		}
		for (i = 0;i <= l - n;i++)
		{
			for (j = i + 1;j <= l - n;j++)
			{
				s = 0;
				for (k = 0;k < n;k++)
				{
					if (a.charAt(i + k) != a.charAt(j + k))
					{
						s = 1;
						break;
					}
				}
				if (s == 0)
				{
					p[i]++;
				}
			}
		}
		m = p[0];
		for (i = 1;i <= l - n;i++)
		{
			if (m < p[i])
			{
				m = p[i];
			}
		}
		if (m >= 1)
		{
		System.out.printf("%d\n",m + 1);
		for (i = 0;i <= l - n;i++)
		{
			if (p[i] == m)
			{
				for (k = 0;k < n;k++)
				{
					System.out.printf("%c",a.charAt(i + k));
				}
				System.out.print("\n");
			}
		}
		}
		else
		{
			System.out.print("NO");
		}
	}
}

