package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int[] word = new int[5];

	for (a = 1;a <= 5;a++)
	{
	 for (b = 1;b <= 5;b++)
	 {
		 if (a == b)
		 {
			 continue;
		 }
		 else
		 {
			 for (c = 1;c <= 5;c++)
			 {
				 if (a == c || b == c)
				 {
					 continue;
				 }
				 else
				 {
					 for (d = 1;d <= 5;d++)
					 {
						 if (a == d || b == d || c == d)
						 {
							 continue;
						 }
						 else
						 {
							 e = 15 - a - b - c - d;
							 word[0] = (e == 1) && ((a == 1) || (a == 2));
	word[1] = (b == 2) && ((b == 1) || (b == 2));
	word[2] = (a == 5) && ((c == 1) || (c == 2));
	word[3] = (c != 1) && ((d == 1) || (d == 2));
	word[4] = (d == 1) && ((e == 1) || (e == 2));
	if ((word[0] + word[1] + word[2] + word[3] + word[4] == 2) && (b == 2) && (c == 1) && (d == 3) && (e == 4))
	{

	System.out.print(a);
	System.out.print(' ');
	System.out.print(b);
	System.out.print(' ');
	System.out.print(c);
	System.out.print(' ');
	System.out.print(d);
	System.out.print(' ');
	System.out.print(e);
	}
						 }
					 }
				 }
			 }
		 }
	 }
	}

		return 0;
	}

}
