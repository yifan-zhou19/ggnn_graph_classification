package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //d??????????d?2?3?4?5?6???
		int i1;
		int d;
		int sum = 0;
		int[] pl = new int[500];
		int[] sl = new int[500];
		String s = new String(new char[500]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}

		for (i = 0; s.charAt(i) != '\0'; i++)
		{
			if (s.charAt(i) == s.charAt(i + 1))
			{
				System.out.printf("%c%c\n",s.charAt(i),s.charAt(i + 1));
				pl[i] = pl[i + 1] = 2;
			}
		}
		for (i = 0; s.charAt(i) != '\0'; i++)
		{
			if (s.charAt(i) == s.charAt(i + 2))
			{
				System.out.printf("%c%c%c\n",s.charAt(i),s.charAt(i + 1),s.charAt(i + 2));
				sl[i + 1] = 3;
			}
		}


		for (d = 4; d <= s.length(); d++)
		{
			if (d % 2 == 0)
			{
				for (i = 0; s.charAt(i) != '\0'; i++,sum = 0)
				{
					if (pl[i + d / 2 - 1] == (d - 2) && pl[i + d / 2] == (d - 2) && s.charAt(i + d - 1) == s.charAt(i))
					{
						for (i1 = i; i1 < i + d - 1; i1++)
						{
							System.out.printf("%c",s.charAt(i1));
						}
						System.out.printf("%c\n",s.charAt(i + d - 1));
						pl[i + d / 2 - 1] = pl[i + d / 2] = d;
					}
				}
			}
			if (d % 2 == 1)
			{
				for (i = 0; s.charAt(i) != '\0'; i++,sum = 0)
				{
					if (sl[i + d / 2] == (d - 2) && s.charAt(i + d - 1) == s.charAt(i))
					{
						for (i1 = i; i1 < i + d - 1; i1++)
						{
							System.out.printf("%c",s.charAt(i1));
						}
						System.out.printf("%c\n",s.charAt(i + d - 1));
						sl[i + d / 2] = d;
					}
				}
			}
		}
		return 0;
	}

}

