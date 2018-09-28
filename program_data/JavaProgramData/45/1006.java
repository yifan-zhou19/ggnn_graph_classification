package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[60]);
		String b = new String(new char[60]);
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
		for (i = 0;i <= b.length() - a.length();i++)
		{
			for (j = i;j < i + a.length();j++)
			{
				if (a.charAt(j - i) != b.charAt(j))
				{
					break;
				}
			}
			if (j == i + a.length())
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
		if (i == b.length() - a.length() + 1)
		{
			System.out.print("no\n");
		}

		return 0;
	}


}

