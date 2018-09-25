package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int aa;
		int bb;
		int cc;
		int i;
		String food = new String(new char[4]);
		for (a = 1;a < 4;a++)
		{
			for (b = 1;b < 4;b++)
			{
				for (c = 1;c < 4;c++)
				{
					aa = ((b > a) + (c == a));
						bb = ((a > b) + (a > c));
						cc = ((c > b) + (b > a));
					 if ((((a == b) && (aa == bb)) + ((a < b) && (aa> bb)) + ((a > b) && (aa < bb))) == 1)
					 {
						 if ((((a == c) && (aa == cc)) + ((a < c) && (aa> cc)) + ((a > c) && (aa < cc))) == 1)
						 {
							 if ((((b == c) && (bb == cc)) + ((b > c) && (bb < cc)) + ((b < c) && (bb> cc))) == 1)
							 {
								 food = tangible.StringFunctions.changeCharacter(food, a, 'A');
								 food = tangible.StringFunctions.changeCharacter(food, b, 'B');
								 food = tangible.StringFunctions.changeCharacter(food, c, 'C');
								for (i = 1;i < 4;i++)
								{
									System.out.print(food.charAt(i));
								}
								System.out.print("\n");
							 }
						 }
					 }
				}
			}
		}
	return 0;
	}

}

