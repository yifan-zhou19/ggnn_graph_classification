package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int x;
		int y;
		int c;
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
		x = a.length();
		y = b.length();
		for (int i = 0;i < y;i++)
		{
			if (a.charAt(0) - '0' == b.charAt(i) - '0')
			{
				System.out.printf("%d",i);
				break;
				for (int j = 0;j < x;j++)
				{
					if (a.charAt(j + 1) - '0' == b.charAt(i + j + 1) - '0')
					{
						continue;
					}
					else
					{
						c = 0;
						break;
					}
				}

			}
			else
			{
				continue;
			}
		}
	}
}

