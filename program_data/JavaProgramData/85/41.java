package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p = 0;
		String s = new String(new char[30]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int z = s.length();
			for (j = 0;j < z;j++)
			{
				if (j == 0 && (s.charAt(j) > '/' && s.charAt(j) < ':'))
				{
					System.out.print("no\n");
					break;
				}
				if (s.charAt(j) > '/' && s.charAt(j) < ':')
				{
					p++;
				}
				else
				{
					p += 0;
				}
				if (s.charAt(j) > '@' && s.charAt(j) < '[')
				{
						p++;
				}
				else
				{
					p += 0;
				}
				if (s.charAt(j) > 'a' && s.charAt(j) < 'z')
				{
						p++;
				}
				else
				{
					p += 0;
				}
				if (s.charAt(j) == 'a' || s.charAt(j) == 'z')
				{
						p++;
				}
				else
				{
					p += 0;
				}
				if (s.charAt(j) == '_')
				{
						p++;
				}
				else
				{
					p += 0;
				}

			}


			if (p == z)
			{
				System.out.print("yes\n");
			}
			else if (p != 0)
			{
				System.out.print("no\n");
			}
			p = 0;
		}
		return 0;
	}

}

