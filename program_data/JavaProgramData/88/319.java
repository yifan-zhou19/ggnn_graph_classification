package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char x;
		char a;
		int i;
		int m = 0;

		for (i = 0;i < 30;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				x = tempVar.charAt(0);
			}
			if (x == '1' || x == '2' || x == '3' || x == '4' || x == '5' || x == '6' || x == '7' || x == '8' || x == '9' || x == '0')
			{
				a = x;
				System.out.printf("%c",x);
			}
			else if (a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0')
			{
					a = x;
					System.out.print("\n");
			}
		}
		return 0;
	}

}

