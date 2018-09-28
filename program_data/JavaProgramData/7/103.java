package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		int l1;
		int i;
		int j;
		int n;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		l1 = a.length();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == a.charAt(0))
			{
				flag = 1;
				for (j = i + 1;j < (i + l1);j++)
				{
					if (s.charAt(j) != a.charAt(j - i))
					{
						flag = 0;
					}
					else
					{
						flag = 1;
					}
				}
				if (flag == 1)
				{
					for (n = 0;n < i;n++)
					{
						System.out.printf("%c",s.charAt(n));
					}
					System.out.printf("%s",b);
					for (n = i + l1;s.charAt(n) != '\0';n++)
					{
						System.out.printf("%c",s.charAt(n));
					}
					return 0;
				}
			}
		}
		System.out.printf("%s",s);
		return 0;
	}

}

