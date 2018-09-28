package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int t = 1;
		int w;
		String n = new String(new char[32]);
		char[] k = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = n.length();i >= 0;i--)
		{
			if ((n.charAt(i) >= '0') && (n.charAt(i) <= '9'))
			{
				m = m + (n.charAt(i) - '0') * t;
				t = t * a;
			}
			else if ((n.charAt(i) >= 'a') && (n.charAt(i) <= 'z'))
			{
				m = m + (n.charAt(i) - 'a' + 10) * t;
				t = t * a;
			}
			else if ((n.charAt(i) >= 'A') && (n.charAt(i) <= 'Z'))
			{
				m = m + (n.charAt(i) - 'A' + 10) * t;
				t = t * a;
			}
		}
		if (m == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			if (b == 10)
			{
				System.out.printf("%ld",m);
			}
			else
			{
				for (i = 0;m != 0;i++)
				{
					w = m % b;
					if (w >= 0 && w <= 9)
					{
						k[i] = w + '0';
					}
					else if (w > 9 && w < 36)
					{
						k[i] = w - 10 + 'A';
					}
					m = (m - w) / b;
				}
				k[i] = '\0';
				for (i = k.length() - 1;i >= 0;i--)
				{
					System.out.printf("%c",k[i]);
				}
				System.out.print("\n");
			}
		}
	}
}

