package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		String c = new String(new char[20]);
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		b = a;
		c = a;
		for (i = 1;i <= 100;i++)
		{
			d = System.in.read();
			if (d == '\n')
			{
				break;
			}
			else
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = tempVar2.charAt(0);
				}
			}
				if (a.length() > b.length())
				{
					b = a;
				}
				if (a.length() < c.length())
				{
					c = a;
				}
		}
		System.out.printf("%s\n%s\n",b,c);
	}
}

