package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //?????abc????????0?1?2
		int b;
		int c;
		int t; //???????????t?p
		int p;
		int i; //??????i,j
		int j;
		int[] m = new int[4]; //????m??a,b,c??
		String n = new String(new char[4]); //????n??a?b,c,????
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				for (c = 0;c <= 2;c++)
				{
						if ((b > a) + (c == a) == (2 - a) && (a > b) + (a > c) == (2 - b) && (c > b) + (b > a) == (2 - c))
						{
					//?????????2-a???????????????�???�
					m[1] = a;
					m[2] = b;
					m[3] = c;
		n = tangible.StringFunctions.changeCharacter(n, 1, 'A');
		n = tangible.StringFunctions.changeCharacter(n, 2, 'B');
		n = tangible.StringFunctions.changeCharacter(n, 3, 'C');
			for (j = 1;j <= 2;j++)
			{
				for (i = 1;i <= 3 - j;i++)
				{
					if (m[i] > m[i + 1])
					{
						t = m[i];
						m[i] = m[i + 1];
						m[i + 1] = t;
					 p = n.charAt(i);
					 n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i + 1));
					 n = tangible.StringFunctions.changeCharacter(n, i + 1, p);
					} //?????????
				}
			}
						}
				}
			}
		}
			System.out.print(n.charAt(1));
			System.out.print(n.charAt(2));
			System.out.print(n.charAt(3));
			System.out.print("\n");
		return 0;
	}
}

