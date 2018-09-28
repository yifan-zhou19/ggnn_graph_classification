package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		String s = new String(new char[21]);
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
			m = 0;
			for (k = 0;s.charAt(k) != '\0';k++)
			{
				if (s.charAt(0) != '0' && s.charAt(0) != '1' && s.charAt(0) != '2' && s.charAt(0) != '3' && s.charAt(0) != '4' && s.charAt(0) != '5' && s.charAt(0) != '6' && s.charAt(0) != '7' && s.charAt(0) != '8' && s.charAt(0) != '9' && s.charAt(k) >= 'A' && s.charAt(k) <= 'Z' || s.charAt(k) >= 'a' && s.charAt(k) <= 'z' || s.charAt(k) >= '0' && s.charAt(k) <= '9' || s.charAt(k) == '_')
				{
					m++;
				}
			}
			if (m == k)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

