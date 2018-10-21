package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[15]);
		int n;
		int i;
		int j;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			str = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			l = str.length();
			if (str.charAt(l - 1) == 'g')
			{
				for (j = 0;j < l - 3;j++)
				{
				System.out.printf("%c",str.charAt(j));
				}
			}
			else
			{
				for (j = 0;j < l - 2;j++)
				{
				System.out.printf("%c",str.charAt(j));
				}
			}
			System.out.print("\n");
		}
	}
}

