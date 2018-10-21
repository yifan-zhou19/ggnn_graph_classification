package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String a = new String(new char[30]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			int b;
			b = a.length();
			if (a.charAt(b - 2) == 'e')
			{
				int j;
				for (j = 0;j < b - 2;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
			if (a.charAt(b - 2) == 'l')
			{
				int j;
				for (j = 0;j < b - 2;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
			if (a.charAt(b - 3) == 'i' && a.charAt(b - 2) == 'n')
			{
				int j;
				for (j = 0;j < b - 3;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

