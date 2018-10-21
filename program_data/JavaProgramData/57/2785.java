package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int len;
		String str = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			len = str.length();
			if ((str.charAt(len - 1) == 'r') && (str.charAt(len - 2) == 'e') || (str.charAt(len - 1) == 'y') && (str.charAt(len - 2) == 'l'))
			{
				for (j = 0;j < len - 2;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
				System.out.print("\n");
			}
			if ((str.charAt(len - 3) == 'i') && (str.charAt(len - 2) == 'n') && (str.charAt(len - 1) == 'g'))
			{
				for (p = 0;p < len - 3;p++)
				{
					System.out.printf("%c",str.charAt(p));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}

}

