package <missing>;

public class GlobalMembers
{
	public static int check(String c)
	{
		int len;
		int i;
		String d = new String(new char[1000]);
		len = c.length();
		for (i = 0;i < len;i++)
		{
			*(d.Substring(i)) = c[len - i - 1];
		}
		*(d.Substring(len)) = '\0';
		if (strcmp(c,d) == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}


	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int j;
		int k;
		int len;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		len = a.length();
			for (i = 2;i <= len;i++)
			{
				for (j = 0;j <= len - i;j++)
				{
					for (m = 0;m < i;m++)
					{
						*(b.Substring(m)) = *(a.Substring(j) + m);
					}
					b = tangible.StringFunctions.changeCharacter(b, i, '\0');
					if (check(b) != 0)
					{
						System.out.printf("%s\n",b);
					}
				}
			}
			return 0;
	}
}

