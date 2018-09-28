package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String in = new String(new char[max]);
		String out = new String(new char[max]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int a = 0;a < n;a++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					in = tempVar2.charAt(0);
				}
				for (int c = 0;c < max;c++)
				{
						if ((in.charAt(c)) == '\0')
						{
										  m = c;
										  break;
						}
				}
				for (int b = 0;b <= m;b++)
				{
						if ((in.charAt(b)) == 'A')
						{
										 out = tangible.StringFunctions.changeCharacter(out, b, 'T');
						}
										 else if ((in.charAt(b)) == 'T')
										 {
											   out = tangible.StringFunctions.changeCharacter(out, b, 'A');
										 }
											   else if ((in.charAt(b)) == 'C')
											   {
													 out = tangible.StringFunctions.changeCharacter(out, b, 'G');
											   }
													 else if ((in.charAt(b)) == 'G')
													 {
														   out = tangible.StringFunctions.changeCharacter(out, b, 'C');
													 }
														   else
														   {
																 out = tangible.StringFunctions.changeCharacter(out, b, '\0');
														   }
				}
				System.out.printf("%s\n",out);
		}

		return 0;
	}

}

