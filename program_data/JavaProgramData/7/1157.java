package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[260]);
		String w = new String(new char[260]);
		String h = new String(new char[260]);
		int l1;
		int l2;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			h = tempVar3.charAt(0);
		}
		l1 = s.length();
		l2 = w.length();
		for (j = 0;j < l1;j++)
		{
			if (s.charAt(j) == w.charAt(0))
			{
				for (i = 1;i < l2;i++)
				{
					if (s.charAt(j + i) != w.charAt(i))
					{
						break;
					}
				}
					if (i == l2)
					{
						k = 1;
						break;
					}
			}
		}
					if (k != 0)
					{
						for (k = 0;k < j;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						for (k = 0;k < l2;k++)
						{
							System.out.printf("%c",h.charAt(k));
						}
						for (k = j + l2;k < l1;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						System.out.print("\n");
					}
					else
					{
						System.out.printf("%s",s);
					}
	}

}

