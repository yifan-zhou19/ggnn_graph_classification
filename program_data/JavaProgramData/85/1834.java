package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String str = new String(new char[1024]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int flag;
		while (n-- != 0)
		{
			flag = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			int len = str.length();
			for (int i = 0; i < len; ++i)
			{
				if (Character.isLetter(str.charAt(i)) || str.charAt(i) == '_')
				{
					continue;
				}
				else if (i != 0 && Character.isDigit(str.charAt(i)))
				{
					continue;
				}
				else
				{
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

