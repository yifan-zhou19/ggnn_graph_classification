package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int sum;
		int d;
		int i = 0;
		int j;
		String n = new String(new char[20]);
		char[] e = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
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
		for (i = 0,sum = 0;n.charAt(i) != '\0';i++)
		{
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				d = n.charAt(i) - '0';
			}
			else
			{
				if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
				{
					d = n.charAt(i) - 'a' + 10;
				}
				else
				{
					if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
					{
						d = n.charAt(i) - 'A' + 10;
					}
				}
			}
			sum = sum * a + d;
		}
		for (i = 0;sum >= b;i++)
		{
			d = (sum % b);
			if (d <= 9)
			{
				e[i] = d + '0';
			}
			else
			{
				if (d > 9)
				{
					e[i] = d - 10 + 'A';
				}
			}
				sum = (sum - d) / b;
		}
		if (sum <= 9)
		{
				e[i] = sum + '0';
		}
			else
			{
				if (sum > 9)
				{
					e[i] = sum - 10 + 'A';
				}
			}
		for (j = i;j >= 0;j--)
		{
			System.out.printf("%c",e[j]);
		}
		return 0;
	}
}

