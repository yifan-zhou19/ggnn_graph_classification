package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[32]);
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
				a = tempVar2.charAt(0);
			}
			int num = a.length();
			if (((a.charAt(num - 2) == 'e') && (a.charAt(num - 1) == 'r')) || ((a.charAt(num - 2) == 'l') && (a.charAt(num - 1) == 'y')))
			{
				for (j = 0;j < num - 2;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
			else if ((a.charAt(num - 3) == 'i') && (a.charAt(num - 2) == 'n') && (a.charAt(num - 1) == 'g'))
			{
				for (j = 0;j < num - 3;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
			else
			{
				System.out.printf("%s\n",a);
			}
		}
		return 0;
	}

}

