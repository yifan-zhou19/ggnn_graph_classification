package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String a = new String(new char[100]);
		int m = 1;
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
				a = tempVar2.charAt(0);
			}
			int j = 1;
			if ((a.charAt(0) >= 65 && a.charAt(0) <= 90) || (a.charAt(0) >= 97 && a.charAt(0) <= 122) || a.charAt(0) == 95)
			{
				m = 1;
				while (a.charAt(j) != '\0')
				{
					if (a.charAt(j) < 48 || (a.charAt(j)>57 && a.charAt(j) < 65) || (a.charAt(j)>90 && a.charAt(j) < 95) || a.charAt(j) == 96 || a.charAt(j)>122)
					{
						m = 0;
					}
					j++;
				}
				if (m == 1)
				{
					System.out.print("yes\n");
				}
				if (m == 0)
				{
					System.out.print("no\n");
				}
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

