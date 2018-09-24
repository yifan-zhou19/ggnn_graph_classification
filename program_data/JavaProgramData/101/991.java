package <missing>;

public class GlobalMembers
{
	/*??????
	 * A??B??????C?????
	 * B??A??????A??C???
	 * C????B????B??A???
	 * ???????????????an?????????????? */
	public static int Main()
	{
		int F = new int(int x,int y,int z);
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					a = (B > A) + (C == A); //????????
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					int sum;
					sum = ((A > B && a < b) || (A == B && a == b) || (A < B && a> b)) + ((A> C && a < c) || (A == C && a == c) || (A < C && a> c)) + ((B < C && b> c) || (B> C && b < c) || (B == C && b == c));
					//sum=((A>B)&&(a<b))((A==B)&&(a==b))((A<B)&&(a>b))
						//+((A>C)&&(a<c))((A==C)&&(a==c))((A<C)&&(a>c))
						//+((C>B)&&(c<b))((C==B)&&(c==b))((C<B)&&(c>b));
					if (sum == 3)
					{
						F(A, B, C);
					}
				}
			}
		}
				return 0;
	}
	public static int F(int A,int B,int C)
	{
		int temp;
		if (A < B)
		{
			temp = A;
			A = B;
			C = temp;
		}
		if (C > A)
		{
			System.out.print("CAB");
		}
		else if (C > B)
		{
			System.out.print("BCA");
		}
		else
		{
			System.out.print("ABC");
		}
	}


}
