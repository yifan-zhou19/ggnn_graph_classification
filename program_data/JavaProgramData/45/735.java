package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int t;
		int n;
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
		n = a.length();
		for (i = 0;;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				c = 0;
				for (t = 1;t <= n - 1;t++)
				{
					if (b.charAt(i + t) == a.charAt(t))
					{
					;
					}
						else
						{
					c = -1;
					break;
						}
				}
				if (c == 0)
				{
					System.out.printf("%d\n",i);
					break;
				}
			}
		}
	}
}

