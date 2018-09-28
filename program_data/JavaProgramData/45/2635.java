package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String temp = new String(new char[50]);
		int i;
		int j;
		int len1;
		int len2;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();
		for (i = 0;i <= len2 - len1;i++)
		{
			p = 1;
			for (j = i;j < i + len1;j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j - i, b.charAt(j));
			}
			for (j = 0;j < len1;j++)
			{
				if (temp.charAt(j) == a.charAt(j))
				{
					p = 1;
				}
				else
				{
					p = 0;
					break;
				}
			}
			if (p != 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}
}

