package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int b = 0;
		int c = 0;
		int l;
		int j;
		int k;
		String a = new String(new char[100001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			System.in.read();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			for (j = 0;j < l;j++)
			{
				for (k = 0;k < l;k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
						b = b + 1;
					}
				}
				if (b == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					b = 0;
					break;
				}
				else
				{
					c = c + 1;
				}
				b = 0;
			}
			if (c == l)
			{
				System.out.print("no\n");
			}
			c = 0;
		}
		return 0;
	}

}

