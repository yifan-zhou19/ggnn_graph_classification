package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int n;
		int c;
		int d;
		int e;
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			d = b.length();
			if ((b.charAt(0) <= 90 && b.charAt(0) >= 65) || b.charAt(0) == 95 || (b.charAt(0) >= 97 && b.charAt(0) <= 122))
			{
				e = 1;
			}
			else
			{
				e = 0;

			}
			for (n = 0;n < d;n++)
			{
				if (b.charAt(n) <= 90 && b.charAt(n) >= 65)
				{
					c = 1;
				}
				else if (b.charAt(n) == 95)
				{
					c = 1;
				}
				else if (b.charAt(n) >= 97 && b.charAt(n) <= 122)
				{
					c = 1;
				}
				else if (b.charAt(n) <= 57 && b.charAt(n) >= 48)
				{
					c = 1;
				}
				else
				{
					c = 0;
					break;
				}


			}
			if (c == 1 && e == 1)
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

