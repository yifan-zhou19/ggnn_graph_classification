package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int sum10 = 0;
		int[] n10 = new int[100];
		int[] nb = new int[100];
		int lenn;
		int q;
		String n = new String(new char[100]);
		String nc = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lenn = n.length();
		for (i = 0;n.charAt(i) != '\0';i++)
		{
							   if ((n.charAt(i) >= 'a') && (n.charAt(i) <= 'z'))
							   {
														   n10[i] = n.charAt(i) - 'a' + 10;
							   }
							   else if ((n.charAt(i) >= 'A') && (n.charAt(i) <= 'Z'))
							   {
									 n10[i] = n.charAt(i) - 'A' + 10;
							   }
							   else
							   {
								   n10[i] = n.charAt(i) - '0';
							   }
							   for (j = 1;j <= lenn - i - 1;j++)
							   {
													   n10[i] = n10[i] * a;
							   }
							   sum10 = sum10 + n10[i];
		}
		if (sum10 == 0)
		{
			System.out.print(0);
		}
		else
		{
			i = 0;
		while (sum10 != 0)
		{
					 nb[i] = sum10 % b;
					 sum10 = sum10 / b;
					 i++;
		}
		for (j = i - 1;j >= 0;j--)
		{
						 if (nb[j] > 9)
						 {
									nc = tangible.StringFunctions.changeCharacter(nc, j, nb[j] - 10 + 'A');
						 }
						 else
						 {
							 nc = tangible.StringFunctions.changeCharacter(nc, j, nb[j] + '0');
						 }
						 System.out.print(nc.charAt(j));
		}
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

