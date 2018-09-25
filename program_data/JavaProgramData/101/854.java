package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{

		for (int A = 0 ; A < 3 ; A++) //??A B C?????
		{
			for (int B = 0 ; B < 3 ; B++)
			{
				for (int C = 0 ; C < 3 ; C++)
				{
					int a = 0; //??????a,b,c
					int b = 0;
					int c = 0;
					if (B > A) //??A????????
					{
						a++;
					}
					if (C == A)
					{
						a++;
					}
					if (A > B) //??B????????
					{
						b++;
					}
					if (A > C)
					{
						b++;
					}
					if (C > B) //??C????????
					{
						c++;
					}
					if (B > A)
					{
						c++;
					}
					if (((A == B && a == b) || ((A - B) * (a - b) < 0)) && ((A == C && a == c) || ((A - C) * (a - c) < 0)) && ((B == C && b == c) || ((B - C) * (b - c) < 0))) //????????????????????
					{
						int p;
						int[] a = new int[10]; //????????a
						String b = new String(new char[10]); //?????????b
						char k; //????k
						a[0] = A; //?A,B,C????a??
						a[1] = B;
						a[2] = C;
						b = tangible.StringFunctions.changeCharacter(b, 0, 'A'); //?A,B,C??????b??
						b = tangible.StringFunctions.changeCharacter(b, 1, 'B');
						b = tangible.StringFunctions.changeCharacter(b, 2, 'C');
						for (int i = 0 ; i < 3 ; i++) //?A,B,C?????
						{
							for (int j = i + 1 ; j < 3 ; j++)
							{
								if (a[i] > a[j])
								{
									p = a[i];
									a[i] = a[j];
									a[j] = p;

									k = b.charAt(i);
									b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
									b = tangible.StringFunctions.changeCharacter(b, j, k);

								}
							}
						}
						System.out.print(b.charAt(0));
						System.out.print(b.charAt(1));
						System.out.print(b.charAt(2));
						System.out.print("\n");

					}


				}
			}
		}
		  return 0; //???????????????????

	}


}

