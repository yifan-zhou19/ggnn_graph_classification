package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		int j;
		String z = new String(new char[21]);
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
				z = tempVar2.charAt(0);
			}
			b = Character.isLetter(z.charAt(0));
			j = z.length();
			c = 1;
			if ((b == 0) && (z.charAt(0) != '_'))
			{
				System.out.print("no\n");
				continue;
			}
			for (d = 1;d < j;d++)
			{
				e = Character.isLetterOrDigit(z.charAt(d));
				if ((e == 0) && (z.charAt(d) != '_'))
				{
					c = 0;
					break;
				}
			}
			if (c != 0)
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

