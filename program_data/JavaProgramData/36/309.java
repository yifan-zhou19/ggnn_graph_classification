package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k = 0;
	 String str1 = new String(new char[100]);
	 String str2 = new String(new char[100]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 str1 = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 str2 = tempVar2.charAt(0);
	 }
	 if (str1.length() == str2.length())
	 {
		int m = str1.length();
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (str2.charAt(j) == '0')
				{
					continue;
				}
				else if (str1.charAt(i) == str2.charAt(j))
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, j, '0');
					k++;
					break;
				}
			}
		}
		if (k == m)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	 }
	else if (str1.length() != str2.length())
	{
		System.out.print("NO");
	}
	}
}

