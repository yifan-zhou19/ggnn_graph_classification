package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[600]);
		String z = new String(new char[256]);
		String t = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}
		int len1 = m.length();
		int len2 = z.length();
		int i;
		int j;
		int c = 1;
		int flag = 0;
		for (i = 0;i < len1;i++)
		{
			int k = 0;
			if (m.charAt(i) == z.charAt(k))
			{
				j = i;
				for (k = 1;k < len2;k++)
				{
					if (m.charAt(i + 1) == z.charAt(k))
					{
						i++;
						c++;
					}
					else
					{
						break;

					}
				}
			}
			if (c == len2)
			{
				break;
			}
		}
		if (c == len2)
		{
			for (i = 0;i < j;i++)
			{
				System.out.printf("%c",m.charAt(i));
			}
			System.out.printf("%s",t);
			for (i = j + len2;i < len1;i++)
			{
				System.out.printf("%c",m.charAt(i));
			}
		}
		else
		{
			System.out.printf("%s\n",m);
		}
		return 0;
	}





}

