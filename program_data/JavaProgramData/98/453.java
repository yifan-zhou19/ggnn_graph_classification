package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		String s = new String(new char[40]);
		int length = 0;
		int len = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			length += len;
			if (length < MAX)
			{
				if (length != len)
				{
					System.out.print(" ");
					length++;
				}
				System.out.print(s);
			}
			else
			{
				System.out.print("\n");
				length = len;
				System.out.print(s);
			}
		}
		return 0;
	}
}

