package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String b = new String(new char[1000]);
		String bc = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		System.in.read();
		for (a = 0;a < n;a++)
		{
			b = new Scanner(System.in).nextLine();
			int c;
			c = b.length();
			int ch;
			for (ch = 0;ch < c;ch++)
			{
				System.out.printf("%c",b.charAt(ch));
			}
			int d;
			for (d = 0;d < c;d++)
			{
				if (b.charAt(d) == '(')
				{
					int e;
					int[] shao = new int[100];
					int f = 0;
					shao[0] = d;
					for (e = d + 1;e < c;e++)
					{
						if (b.charAt(e) == '(')
						{
							f++;
							shao[f] = e;
						}
						 else if (b.charAt(e) == ')')
						 {
							b = tangible.StringFunctions.changeCharacter(b, e, ' ');
							b = tangible.StringFunctions.changeCharacter(b, shao[f], ' ');
							f--;
						 }
						 if (f == -1)
						 {
							 break;
						 }
					}
					if (f != -1)
					{
						b = tangible.StringFunctions.changeCharacter(b, d, '$');
					}
				}
				else if (b.charAt(d) == ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, d, '?');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, d, ' ');
				}
			}
			System.out.print("\n");
			int x;
			for (x = 0;x < c;x++)
			{
				System.out.printf("%c",b.charAt(x));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

