package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		char a;
		int i;
		for (i = 0;i < 30;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}


			if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9')
			{
				System.out.printf("%c",a);
			}
			else
			{
				System.out.print("\n");
			}
		}

	}
}

