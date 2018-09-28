package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[N]);
		String w = new String(new char[N]);
		String h = new String(new char[N]);
		int len_1;
		int len_2;
		int len_3;
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
		len_1 = s.length();
		len_2 = w.length();
		len_3 = h.length();
		for (j = 0;j < len_1;j++)
		{
			if (s.charAt(j) == w.charAt(0))
			{
				for (i = 1;i < len_2;i++)
				{
					if (s.charAt(j + i) != w.charAt(i))
					{
						break;
					}
				}
					if (i == len_2)
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
						for (k = 0;k < len_3;k++)
						{
							System.out.printf("%c",h.charAt(k));
						}
						for (k = j + len_3;k < len_1;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						System.out.print("\n");
					}
					else
					{
						System.out.printf("%s",s);
					}
					return 0;
	}

}

