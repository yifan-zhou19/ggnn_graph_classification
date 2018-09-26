package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		String word = new String(new char[33]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			len = word.length();
			if (word.charAt(len - 1) == 'r')
			{
				for (i = 0;i < len - 2;i++)
				{
					System.out.printf("%c",word.charAt(i));
				}
			}
			else if (word.charAt(len - 1) == 'y')
			{
				for (i = 0;i < len - 2;i++)
				{
					System.out.printf("%c",word.charAt(i));
				}
			}
			else
			{
				for (i = 0;i < len - 3;i++)
				{
					System.out.printf("%c",word.charAt(i));
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

