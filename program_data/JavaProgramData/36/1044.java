package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int amount;
		int n;
		String small = new String(new char[51]);
		String big = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			small = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			big = tempVar2.charAt(0);
		}
		n = small.length();
		if (small.length() == big.length())
		{
		   for (i = 0;big.charAt(i) != '\0';i++)
		   {
				for (j = 0;small.charAt(j) != '\0';j++)
				{
					 if (small.charAt(j) == big.charAt(i))
					 {
										   small = tangible.StringFunctions.changeCharacter(small, j, small.charAt(n - 1));
										   small = tangible.StringFunctions.changeCharacter(small, n - 1, '\0');
										   n = n - 1;

					 }
				}

		   }
			if (n == 0)
			{
					 System.out.print("YES\n");
			}
			else
			{
				  System.out.print("NO\n");
			}
		}
		else
		{
			System.out.print("NO\n");
		}

		 return 0;
	}

}

