package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int e = 0;
		int k;
		int l = 0;
		final String a = "";
		final String b = "";
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		for (i = 0;i < b.length();i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = 0;j < a.length();j++)
				{
					if (b.charAt(i + j) != a.charAt(j))
					{
						e = 1;
					}
				}
				if (e == 0)
				{
					k = i;
					l = 1;
					break;
				}
				else
				{
					e = 0;
				}
			}
		}

		if (l == 1)
		{
			for (i = 0;i < k;i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
			System.out.printf("%s",c);
			for (i = k + a.length();i < b.length();i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
		}
		else
		{
			System.out.printf("%s",b);
		}
		return 0;
	}


}

