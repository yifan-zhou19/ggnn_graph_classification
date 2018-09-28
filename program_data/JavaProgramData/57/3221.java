package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		String s = new String(new char[15]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			k = s.length();
			if (s.charAt(k - 1) == 'r')
			{
				k = k - 3;
			}
			if (s.charAt(k - 1) == 'y')
			{
				k = k - 3;
			}
			if (s.charAt(k - 1) == 'g')
			{
				k = k - 4;
			}
			for (j = 0;j <= k;j++)
			{
			System.out.printf("%c",s.charAt(j));
			}
			System.out.print("\n");
		}
	}
}

