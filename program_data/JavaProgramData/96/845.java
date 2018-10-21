package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[105]);
		int[] m = new int[105];
		int[] s = new int[105];
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}

		for (i = 0;n.charAt(i) != '\0';i++)
		{
			s[i] = n.charAt(i) - '0';
		}
		a = s[0];
		if (n.length() == 1)
		{
			m[0] = 0;
			a = s[0];
		}
		else
		{
			for (i = 0;i < (n.length() - 1);i++)
			{
				m[i] = (10 * a + s[i + 1]) / 13;
				a = (10 * a + s[i + 1]) % 13;
			}
		}
		if (n.length() == 1)
		{
			System.out.printf("%d",m[0]);
		}
		else
		{
		for (i = 0;i < n.length() - 1;i++)
		{
			if (i == 0)
			{
				if (m[i] != 0)
				{
					System.out.printf("%d",m[i]);
				}
				else
				{
					if (n.length() == 2)
					{
						System.out.printf("%d",m[i]);
					}
					else
					{
					continue;
					}
				}
			}
			if (i != 0)
			{
				System.out.printf("%d",m[i]);
			}
		}
		}
		System.out.printf("\n%d",a);
			return 0;
	}

}

