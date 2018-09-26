package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int A;
		int k;
		int yes = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100000]);
		String b = new String(new char[26]);
		int[] c = new int[26];
		for (i = 0;i < 26;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, 'a' + i);
			c[i] = 0;
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			A = a.length();
			m = A;
			for (j = 0;j < A;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (a.charAt(j) == b.charAt(k))
					{
						c[k] = c[k] + 1;
					}
				}
			}
			for (k = 0;k < 26;k++)
			{
				if (c[k] == 1)
				{
					yes = 1;
					for (j = 0;j < A;j++)
					{
						if (a.charAt(j) == b.charAt(k))
						{
							if (j < m)
							{
								m = j;
							}
							break;
						}
					}
				}
			}
			if (yes == 1)
			{
				System.out.printf("%c\n",a.charAt(m));
			}
			if (yes == 0)
			{
				System.out.print("no\n");
			}
			for (j = 0;j < A;j++)
			{
				a = a.substring(0, j);
			}
			yes = 0;
			for (j = 0;j < 26;j++)
			{
				c[j] = 0;
			}
		}

	}
}

