package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int p;
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
		for (i = 0; i <= b.length() - a.length(); i++)
		{
			p = 1;
			for (j = 0; j < a.length(); j++)
			{
				if (b.charAt(i + j) != a.charAt(j))
				{
					p = 0;
				}
			}
			if (p != 0)
			{
				break;
			}
		}
		System.out.printf("%d\n", i);
	}
}

