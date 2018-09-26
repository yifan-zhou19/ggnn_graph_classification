package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int changdu1;
		int changdu2;
		int i;
		int js = 0;
		double rate;
		double rate1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		changdu1 = s1.length();
		changdu2 = s2.length();
		if (changdu1 != changdu2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < changdu1;i++)
			{
				if ((s1.charAt(i) != 'A' && s1.charAt(i) != 'T' && s1.charAt(i) != 'G' && s1.charAt(i) != 'C') || (s2.charAt(i) != 'A' && s2.charAt(i) != 'T' && s2.charAt(i) != 'G' && s2.charAt(i) != 'C'))
				{
					js = 1;
					break;
				}
			}
			if (js == 1)
			{
				System.out.print("error");
			}
			else
			{
				for (i = 0;i < changdu1;i++)
				{
					if (s1.charAt(i) == s2.charAt(i))
					{
						js++;
					}
				}
				rate1 = 1.0 * js / changdu1;
				if (rate1 > rate)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		return 0;
	}


}

