package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int j;
		int n;
		int l;
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
		 l = a.length() - 1;
			if (a.charAt(l) == 'r')
			{
				for (n = 0;n < l - 1;n++)
				{
					System.out.printf("%c",a.charAt(n));
				}
				System.out.print("\n");
			}
			if (a.charAt(l) == 'y')
			{
				for (n = 0;n < l - 1;n++)
				{
					System.out.printf("%c",a.charAt(n));
				}
				System.out.print("\n");
			}
			if (a.charAt(l) == 'g')
			{
				for (n = 0;n < l - 2;n++)
				{
					System.out.printf("%c",a.charAt(n));
				}
				System.out.print("\n");
			}

		}
	}

}

