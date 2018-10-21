package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int len1;
		int len2;
		int i;
		int j;
		int x;
		int tag = 0;
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		String s3 = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
		len1 = s1.length();
		len2 = s2.length();
		for (i = 0;i <= len1 - len2;i++)
		{
			for (j = i;j < i + len2;j++)
			{
				if (s1.charAt(j) != s2.charAt(j - i))
				{
					break;
				}
				if (j == i + len2 - 1)
				{
					tag = 1;
					x = i;
				}
			}
			if (tag != 0)
			{
				break;
			}
		}
		if (tag != 0)
		{
			for (i = 0;i < x;i++)
			{
				System.out.printf("%c",s1.charAt(i));
			}
			System.out.printf("%s",s3);
			for (i = x + len2;i < len1;i++)
			{
				System.out.printf("%c",s1.charAt(i));
			}
		}
		else
		{
			System.out.printf("%s",s1);
		}
	}


}

