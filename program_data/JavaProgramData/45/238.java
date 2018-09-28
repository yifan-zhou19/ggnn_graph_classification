package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int na;
		int nb;
		int i = 0;
		int j;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		na = a.length();
		nb = b.length();

		for (i = 0;i <= nb - na;i++)
		{
			if (a.charAt(0) == b.charAt(i))
			{
				c = 0;
				for (j = 0;j < na;j++)
				{
					if (a.charAt(j) == b.charAt(j + i))
					{
					   c++;
					}
				}
				if (c == na)
				{
					System.out.printf("%d",i);
				}
				break;
			}
		}

	}

}

