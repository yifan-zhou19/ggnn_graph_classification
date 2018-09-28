package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char z; //z,q,s,l????????????,ch[4]?????????
		char q;
		char s;
		char l;
		String ch = new String(new char[4]);
		int a; //a,b,c,d????????????????c1,c2,c3????????,n[4]??????????
		int b;
		int c;
		int d;
		int c1;
		int c2;
		int c3;
		int[] n = new int[4];
		int i;
		int j;
		int temp = 0;
		a = b = c = d = 1;
		for (a = 1;a < 6;a++)
		{
			for (b = 1;b < 6;b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 1;c < 6;c++)
				{
					if (c == b || c == a)
					{
					continue;
					}
					for (d = 1;d < 6;d++)
					{
						if (d == a || d == c || d == b)
						{
						  continue;
						}
						c1 = ((a + b) == (c + d));
						c2 = (a + d > b + c);
						c3 = (a + c < b);
						if (c1 + c2 + c3 == 3) //??????????????????
						{
							n[0] = a * 10;
							n[1] = b * 10;
							n[2] = c * 10;
							n[3] = d * 10;
						}
					}
				}
			}
		}
		ch = tangible.StringFunctions.changeCharacter(ch, 0, 'z');
		ch = tangible.StringFunctions.changeCharacter(ch, 1, 'q');
		ch = tangible.StringFunctions.changeCharacter(ch, 2, 's');
		ch = tangible.StringFunctions.changeCharacter(ch, 3, 'l');
		for (j = 0;j < 3;j++)
		{
			for (i = 0;i < 3 - j;i++)
			{
					if (n[i] < n[i + 1])
					{
					temp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = temp;
					temp = ch.charAt(i);
					ch = tangible.StringFunctions.changeCharacter(ch, i, ch.charAt(i + 1));
					ch = tangible.StringFunctions.changeCharacter(ch, i + 1, temp);
					} //??????
			}
		}
		for (i = 0;i < 4;i++)
		{
			System.out.print(ch.charAt(i));
			System.out.print(" ");
			System.out.print(n[i]);
			System.out.print("\n");
		}
		return 0;
	}


}

