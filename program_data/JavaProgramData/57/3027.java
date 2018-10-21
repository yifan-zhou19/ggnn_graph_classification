package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
			String str = new String(new char[30]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}


		for (i = 0;i < n;i++)
		{
			l = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			l = str.length();

			if (str.charAt(l - 2) == 'e' && str.charAt(l - 1) == 'r')
			{
				for (j = 0;j < l - 2;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
				System.out.print("\n");
			}

			if (str.charAt(l - 2) == 'l' && str.charAt(l - 1) == 'y')
			{
				for (j = 0;j < l - 2;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
				System.out.print("\n");
			}

			if (str.charAt(l - 3) == 'i' && str.charAt(l - 2) == 'n' && str.charAt(l - 1) == 'g')
			{
				for (j = 0;j < l - 3;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
				System.out.print("\n");
			}




		}


		return 0;

	}
}

