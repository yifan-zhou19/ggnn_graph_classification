package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int n;
		int m;
		int i;
		int j;
		int index = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		for (i = 0;i < str2.length();i++)
		{
			if (str1.charAt(0) == str2.charAt(i))
			{
				for (j = 1;j < str1.length();j++)
				{
					if (str1.charAt(j) == str2.charAt(j + i))
					{
						index++;
					}
				}
				if (index = str1.length())
				{
					System.out.printf("%d",i);
					return 0;
				}
			}
		}
	}
}

