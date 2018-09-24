package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[256]);
		String substr = new String(new char[256]);
		String replace = new String(new char[256]);
		int i;
		int j;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		for (i = 0;string.charAt(i) != '\0';)
		{
			i++;
		}
		m = i;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
		for (i = 0;substr.charAt(i) != '\0';)
		{
			i++;
		}
		n = i;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replace = tempVar3.charAt(0);
		}
		for (i = 0;i < m;i++)
		{
			if (String[i] == substr.charAt(0))
			{
				for (j = 0;j < n;j++)
				{
					if (String[i + j] != substr.charAt(j))
					{
						break;
					}
				}
				if (j == n)
				{
					for (j = 0;j < n;j++)
					{
					String[i + j] = replace.charAt(j);
					}
					break;
				}
			}
		}
		System.out.printf("%s",String);
	}

}

