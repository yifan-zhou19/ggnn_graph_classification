package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String c = new String(new char[260]);
		int i;
		int j;
		int k = 0;
		int len1;
		int len2;
		int flag;
		int m;
		int t;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();
		for (i = 0;i < len2;i++)
		{
			flag = 1;
			q = 1;
			if (b.charAt(i) == a.charAt(0))
			{
				k = i + 1;
				for (j = 1;j < len1;j++)
				{
					if (b.charAt(k++) != a.charAt(j))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					t = 0;
					for (m = i;m < i + len1;m++)
					{
						b = tangible.StringFunctions.changeCharacter(b, m, c.charAt(t++));
					}
					q = 0;

				}

			}
			if (q == 0)
			{
				break;
			}
		}
			System.out.printf("%s\n",b);
			return 0;
	}


}

