package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		String a = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			if (a.charAt(len - 1) == 'r')
			{
				for (int j = 0;j < len - 2;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
			}
			System.out.print("\n");
			if (a.charAt(len - 1) == 'y')
			{
				for (int p = 0;p < len - 2;p++)
				{
					System.out.printf("%c",a.charAt(p));
				}
			}
			 System.out.print("\n");
			if (a.charAt(len - 1) == 'g')
			{
				for (int q = 0;q < len - 3;q++)
				{
					System.out.printf("%c",a.charAt(q));
				}
			}
			System.out.print("\n");

		}



		return 0;
	}
}

