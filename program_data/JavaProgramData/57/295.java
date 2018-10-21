package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void crea(char c[]);
		int n;
		int i;
		char[][] a = new char[100][20];

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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			crea(a[i]);
			System.out.printf("%s\n",a[i]);
		}
		return 0;
	}

	public static void crea(String c)
	{
		int x;
		if (c[(int)c.length() - 1].equals('r'))
		{
			x = 0;
		}
		else if (c[(int)c.length() - 1].equals('y'))
		{
			x = 1;
		}
		else if (c[(int)c.length() - 1].equals('g'))
		{
			x = 2;
		}
		switch (x)
		{
		case 0:
			c[(int)c.length() - 1] = '\0';
			c[(int)c.length() - 1] = '\0';
			break;
		case 1:
			c[(int)c.length() - 1] = '\0';
			c[(int)c.length() - 1] = '\0';
			break;
		case 2:
			c[(int)c.length() - 1] = '\0';
			c[(int)c.length() - 1] = '\0';
			c[(int)c.length() - 1] = '\0';
			break;
		}
	}
}

