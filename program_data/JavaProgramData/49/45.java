package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[500]);
		int l;
		int i;
		int k;
		int t;
		int g = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		for (k = 1;k < l;k++) //k???????
		{
			for (i = 0;i < l - k;i++) //i???????
			{
				for (t = 1;t <= k;t++)
				{
					g = 1;
					if (s.charAt(i + t - 1) != s.charAt(i + 2 * k - t)) //????
					{
						g = 0;
						break;
					}
				}
				if (g == 1)
				{
					for (t = i;t < 2 * k + i;t++)
					{
					System.out.printf("%c",s.charAt(t));
					}
					System.out.print("\n");
				}
			}
		}
	}

}

