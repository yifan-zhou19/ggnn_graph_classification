package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
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
		int i;
		int j;
		i = 0;
		int k = 1;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) == b.charAt(0))
			{
				if (b.length() >= 1)
				{
					for (j = 1;j < b.length();j++)
					{
						if (a.charAt(i + j) == b.charAt(j))
						{
							k++;
						}
					}
					if (k == b.length())
					{
						System.out.printf("%d",i);
						return 0;
					}
					k = 1;
				}
			}
			i++;
		}
		return 0;

	}

}

