package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[60]);
		String n = new String(new char[60]);
		int k;
		int t;
		int s;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		for (t = 0;n.charAt(t) != '\0';t++)
		{
			if (m.charAt(0) == n.charAt(t))
			{
				a = t;
			}
			for (k = 1,s = t;m.charAt(k) != '\0';k++,s++)
			{
				if (m.charAt(k) != n.charAt(s))
				{
					k = 0;
					break;
				}
			}
			if (k != 0)
			{
				break;
			}
		}
		System.out.printf("%d",a);
		return 0;
	}
}

