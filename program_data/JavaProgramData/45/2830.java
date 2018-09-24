package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		char i;
		char j;
		char m;
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
		m = 0;
		for (i = 0;i <= b.length() - a.length();i++)
		{
			if (b.charAt(i) != a.charAt(0))
			{
				continue;
			}
			for (j = 0;j < a.length();j++)
			{
				if (b.charAt(i + j) == a.charAt(j))
				{
					m++;
				}
			}
			if (m == a.length())
			{
				System.out.printf("%d", i);
				break;
			}
		}
		return 0;
	}
}

