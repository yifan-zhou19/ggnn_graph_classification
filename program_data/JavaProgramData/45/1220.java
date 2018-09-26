package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n1;
		int n2;
		int e;
		int p;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n1 = a.length();
		n2 = b.length();
		for (i = 0;i <= n2 - 1;i++)
		{
			if (a.charAt(0) == b.charAt(i))
			{
				e = 0;
				for (p = 0;p <= n1 - 1;p++)
				{
					if (a.charAt(p) != b.charAt(i + p))
					{
						e = 1;
						break;
					}
				}
				if (e == 0)
				{
					System.out.printf("%d\n",i);
					break;
				}
			}
		}
	}
}

