package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int p;
			int h;
			String a = new String(new char[20]);
			for (p = 0;;p++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a = tangible.StringFunctions.changeCharacter(a, p, tempVar2);
				}
				if (a.charAt(p) == '\n')
				{
					break;
				}
			}
			if (a.charAt(p - 1) == 'r')
			{
				if (a.charAt(p - 2) == 'e')
				{
					for (h = 0;h < p - 2;h++)
					{
						System.out.printf("%c",a.charAt(h));
					}
					System.out.print("\n");
				}
				else
				{
					for (h = 0;h < p;h++)
					{
						System.out.printf("%c",a.charAt(h));
					}
					System.out.print("\n");
				}
			}
			else if (a.charAt(p - 1) == 'y')
			{
				if (a.charAt(p - 2) == 'l')
				{
					for (h = 0;h < p - 2;h++)
					{
						System.out.printf("%c",a.charAt(h));
					}
					System.out.print("\n");
				}
				else
				{
					for (h = 0;h < p;h++)
					{
						System.out.printf("%c",a.charAt(h));
					}
					System.out.print("\n");
				}
			}
			else if (a.charAt(p - 1) == 'g')
			{
				if (a.charAt(p - 2) == 'n')
				{
					if (a.charAt(p - 3) == 'i')
					{
						 for (h = 0;h < p - 3;h++)
						 {
							System.out.printf("%c",a.charAt(h));
						 }
						 System.out.print("\n");
					}
					else
					{
					  for (h = 0;h < p;h++)
					  {
							System.out.printf("%c",a.charAt(h));
					  }
					  System.out.print("\n");
					}
				}
				else
				{
					for (h = 0;h < p;h++)
					{
						System.out.printf("%c",a.charAt(h));
					}
					System.out.print("\n");
				}
			}
			else
			{
				for (h = 0;h < p;h++)
				{
					System.out.printf("%c",a.charAt(h));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

