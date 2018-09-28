package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int k;
		int n = 0;
		for (k = 0;k < 10000;k++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, k, tempVar);
			}
			if (a.charAt(k) == ' ')
			{
				break;
			}
			n += 1;
		}
		for (k = 1;k < n;k++)
		{
			if (a.charAt(k) == a.charAt(0))
			{
				continue;
			}
			int m = 1;
			int i;
			for (i = k - 1;i >= 0;i--)
			{
				if (a.charAt(i) != a.charAt(0))
				{
					m += 1;
				}
				if (a.charAt(i) == a.charAt(0))
				{
					m -= 1;
				}
				if (m == 0)
				{
					System.out.printf("%d %d\n",i,k);
					break;
				}
			}
		}
		return 0;
	}
}

