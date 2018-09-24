package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //?????????????char????????
		int b;
		int c;
		char A;
		char B;
		char C;
		for (a = 1;a <= 3;a++) //???????????a,b,c ??
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					int a1 = (a < b) + (c == a);
					int b1 = (b < a) + (c < a);
					int c1 = (c > b) + (b > a);
					if (a == 3 - a1 && b == 3 - b1 && c == 3 - c1)
					{
					  int[] liang = new int[4]; //??????????
					  String ren = new String(new char[4]); //?????????????
					  liang[1] = a;
					  liang[2] = b;
					  liang[3] = c;
					  ren = tangible.StringFunctions.changeCharacter(ren, 1, 'A');
					  ren = tangible.StringFunctions.changeCharacter(ren, 2, 'B');
					  ren = tangible.StringFunctions.changeCharacter(ren, 3, 'C');
					  int i; //????????????
					  int j;
					  char k; //??????
					  for (j = 1;j <= 2;j++) //????????
					  {
						  for (i = 1;i <= 3 - j;i++)
						  {
							  if (liang[i] < liang[i + 1])
							  {

								  k = ren.charAt(i);
								  ren = tangible.StringFunctions.changeCharacter(ren, i, ren.charAt(i + 1));
								  ren = tangible.StringFunctions.changeCharacter(ren, i + 1, k);

							  }
						  }
					  }
					  for (int i = 3;i > 0;i--) //??????
					  {
						  System.out.print(ren.charAt(i));
					  }


					}

				}

			}
		}
		return 0;
	}
}

