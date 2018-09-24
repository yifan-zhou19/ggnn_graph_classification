package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int l;
		int n;
		String str = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
				l = str.length();
			if (str.charAt(l - 2) == 'e')
			{
				for (j = 0;j < l - 2;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
			}
					if (str.charAt(l - 2) == 'l')
					{
				for (j = 0;j < l - 2;j++)
				{
						System.out.printf("%c",str.charAt(j));
				}
					}
					if (str.charAt(l - 3) == 'i')
					{
				for (j = 0;j < l - 3;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
					}
	System.out.print("\n");

		}
	}

}

