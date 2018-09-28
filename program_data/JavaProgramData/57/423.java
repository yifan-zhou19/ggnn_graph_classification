package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[100]);
		int n;
		int en;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i <= n;i++)
		{
				sz = new Scanner(System.in).nextLine();
				en = sz.length();
				switch (sz.charAt(en - 1))
				{
								case 'g':
									 for (int j = 0;j < en - 4;j++)
									 {
									 System.out.printf("%c",sz.charAt(j));
									 }
									 System.out.printf("%c\n",sz.charAt(en - 4));
									 break;
								 case 'r':
									 for (int j = 0;j < en - 3;j++)
									 {
									 System.out.printf("%c",sz.charAt(j));
									 }
									 System.out.printf("%c\n",sz.charAt(en - 3));
									 break;
								 case 'y':
									 for (int j = 0;j < en - 3;j++)
									 {
									 System.out.printf("%c",sz.charAt(j));
									 }
									 System.out.printf("%c\n",sz.charAt(en - 3));
									 break;
				}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
				return 0;
	}

}

