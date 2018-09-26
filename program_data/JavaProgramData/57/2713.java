package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int length;
		String a = new String(new char[100]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n + 1;j++)
		{
			a = new Scanner(System.in).nextLine();
			length = a.length();
			if (a.charAt(length - 3) == 'i' && a.charAt(length - 2) == 'n' && a.charAt(length - 1) == 'g')
			{
				for (i = 0;i <= length - 4;i++)
				{
					System.out.printf("%c",a.charAt(i));
				}
					System.out.print("\n");
			}
			else
			{
				for (i = 0;i <= length - 3;i++)
				{
					System.out.printf("%c",a.charAt(i));
				}
					System.out.print("\n");
			}
		}
	}
}

