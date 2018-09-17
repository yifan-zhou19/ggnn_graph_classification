package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //??
		int b;
		int c;
		int aw; //?????
		int bw;
		int cw;
		char a1; //??????
		char b1;
		char c1;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++) //??
				{
					aw = (b > a) + (c == a);
					bw = (a > b) + (a > c);
					cw = (c > b) + (b > a); //?????
					if (!(a <= b != 0 && aw <= bw != 0 || a <= c != 0 && aw <= cw != 0 || b <= a != 0 && bw <= aw != 0 || b <= c != 0 && bw <= cw != 0 || c <= a != 0 && cw <= aw != 0 || c <= b != 0 && cw <= bw)) //????????????????????
					{
						a1 = a;
						b1 = b;
						c1 = c; //????
						//cout<<a<<b<<c<<endl;
					}
				}
			}
		}
		String r = new String(new char[4]);
		r = tangible.StringFunctions.changeCharacter(r, a1, 'A');
		r = tangible.StringFunctions.changeCharacter(r, b1, 'B');
		r = tangible.StringFunctions.changeCharacter(r, c1, 'C');
		for (int j = 1;j <= 3;j++)
		{
		System.out.print(r.charAt(j));
		}
		return 0;
	}
}

