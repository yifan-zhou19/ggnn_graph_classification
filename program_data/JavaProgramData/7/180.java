package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[256]);
		String s2 = new String(new char[256]);
		String s3 = new String(new char[256]);
		int i;
		int j;
		int a = 1;
		int n;
		int m;
		int k;
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
		n = s1.length();
		m = s2.length();
		for (i = 0;i < n;i++)
		{
			if (s1.charAt(i) == s2.charAt(0))
			{
				for (j = 1;j < m;j++)
				{
					if (s1.charAt(j + i) == s2.charAt(j))
					{
						a++;
					}
				}
				if (a == m)
				{
					for (k = 0;k < i;k++)
					{
						System.out.printf("%c",s1.charAt(k));
					}
					for (k = 0;k < m;k++)
					{
						System.out.printf("%c",s3.charAt(k));
					}
					for (k = i + m;k < n;k++)
					{
						System.out.printf("%c",s1.charAt(k));
					}
					System.out.print("\n");
					break;
				}
			}
		}
		if (a != m)
		{
			System.out.printf("%s\n",s1);
		}
		return 0;
	}

}

