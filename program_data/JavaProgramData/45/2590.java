package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[N]);
		String s2 = new String(new char[N]);
		int i;
		int k1;
		int k2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		k1 = s1.length();
		k2 = s2.length();
		for (i = 0;i <= k2 - k1;i++)
		{
			if (k1 == 1)
			{
				if (s2.charAt(i) == s1.charAt(0))
				{
					System.out.printf("%d\n",i);
					return 0;
				}
			}
			else if (k1 >= 2)
			{
				if (s2.charAt(i) == s1.charAt(0) && s2.charAt(i + 1) == s1.charAt(1))
				{
					System.out.printf("%d\n",i);
					return 0;
				}
			}
		}
		return 0;
	}

}

