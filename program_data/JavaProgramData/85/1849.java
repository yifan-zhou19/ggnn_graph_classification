package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[21]);
		int n;
		int m;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			a = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf = tempVar2.charAt(0);
			}
			m = zf.length();
			if (zf.charAt(0) == 95 || (zf.charAt(0) >= 65 && zf.charAt(0) <= 90) || (zf.charAt(0) >= 97 && zf.charAt(0) <= 122))
			{
				a = a * 1;
			}
			else
			{
				a = a * 0;
			}
			for (int x = 1;x < m;x++)
			{
				if (zf.charAt(x) == 95 || (zf.charAt(x) >= 65 && zf.charAt(x) <= 90) || (zf.charAt(x) >= 97 && zf.charAt(x) <= 122) || (zf.charAt(x) >= 48 && zf.charAt(x) <= 57))
				{
					a = a * 1;
				}
				else
				{
					a = a * 0;
				}
			}
			if (a == 1)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
			System.out.print("\n");
		}
		return 0;
	}

}

