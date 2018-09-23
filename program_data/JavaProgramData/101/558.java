package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i1;
		int i2;
		int i3;
		int i4;
		int i5;
		int i6;
		int i7;
		int i8;
		int i9;
		int i;
		String n = new String(new char[3]);
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				for (c = 0;c <= 2;c++)
				{
					i1 = (b > a);
					i2 = (a == c);
					i3 = (a > b);
					i4 = (a > c);
					i5 = (c > b);
					i6 = (b > a);
					i7 = a + i1 + i2;
					i8 = b + i3 + i4;
					i9 = c + i5 + i6;

		 if (i7 == 2 && i8 == 2 && i9 == 2)
		 {
			 n = tangible.StringFunctions.changeCharacter(n, a, 'A');
			 n = tangible.StringFunctions.changeCharacter(n, b, 'B');
			 n = tangible.StringFunctions.changeCharacter(n, c, 'C');
			 for (i = 0;i < 3;i++)
			 {
				 System.out.print(n.charAt(i));
			 }
		 }



				}
			}
		}


				return 0;
	}










}

