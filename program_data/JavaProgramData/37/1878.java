package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int p;
		int l;
		final String a = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
		}
		}
		for (p = 0;p < t;p++)
		{
			l = String.valueOf(a.charAt(p)).length();
			for (i = 0;i < l;i++)
			{
				k = 1;
				for (j = 0;j < l;j++)
				{
					if (a.charAt(p)[i] != a.charAt(p)[j])
					{
					k++;
					}
				}
				if (k == l)
				{
					System.out.printf("%c\n",a.charAt(p)[i]);
					break;
				}
			}
			if (i == l)
			{
			System.out.print("no\n");
			}
		}

	}
}

