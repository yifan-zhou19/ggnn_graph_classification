package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int m;
		int j;
		int add = 0;
		String sz = new String(new char[21]);
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
				sz = tempVar2.charAt(0);
			}
			m = sz.length();
			for (j = 0;j < m;j++)
			{
				if ((sz.charAt(j) >= 'A' && sz.charAt(j) <= 'Z' || sz.charAt(j) >= 'a' && sz.charAt(j) <= 'z' || sz.charAt(j) == '_' || sz.charAt(j) >= '0' && sz.charAt(j) <= '9'))
				{
					if (j == 0 && (sz.charAt(j) < '0' || sz.charAt(j)>'9'))
					{
						add++;
					}
					if (j > 0)
					{
						add++;
					}
				}
			}
			if (add == m)
			{
				System.out.print("yes\n\n");
			}
			else
			{
				System.out.print("no\n\n");
			}
			add = 0;
		}
	}
}

