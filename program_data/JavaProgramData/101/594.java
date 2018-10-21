package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String x = new String(new char[4]);
		int i = 0;
	for (a = 1;a <= 3;a++)
	{
		for (b = 1;b <= 3;b++)
		{
			if (b != a)
			{
				for (c = 1;c <= 3;c++)
				{
					if (c != a && c != b)
					{
					d = (b > a) + (c == a);
					e = (a > b) + (a > c);
					f = (c > b) + (b > a);
	//cout<<d<<e<<f<<endl;}
					 if ((a + d) == (b + e) && (a + d) == (c + f))
					 {
						 for (i = 1;i <= 3;i++)
						 {
							 if (i == a)
							 {
								 x = tangible.StringFunctions.changeCharacter(x, i, 'A');
							 }
							 if (i == b)
							 {
								 x = tangible.StringFunctions.changeCharacter(x, i, 'B');
							 }
							 if (i == c)
							 {
								 x = tangible.StringFunctions.changeCharacter(x, i, 'C');
							 }
						 }
					 }
					}
				}
			}
		}
	}
	for (i = 1;i <= 3;i++)
	{
		System.out.print(x.charAt(i));
	}
	System.out.print("\n");


	System.in.read();
	System.in.read();
	return 0;
	}

}

