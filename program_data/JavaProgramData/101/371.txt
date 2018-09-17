package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //??abc?? ? ABC???
		int b;
		int c;
		int As;
		int Bs;
		int Cs;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
					if (a == b)
					{
						continue;
					}
				 for (c = 1;c <= 3;c++)
				 {
						 if (c == a || c == b)
						 {
							 continue;
						 }
					 As = (b > a) + (c == a);
					 Bs = (a > b) + (a > c);
					 Cs = (c > b) + (b > a);
					 if ((a + As == 3) && (b + Bs == 3) && (c + Cs == 3))
					 {
					 for (int i = 1;i <= 3;i++) //?????????i???????
					 {
						 if (a == i)
						 {
							 System.out.print('A');
						 }
						 if (b == i)
						 {
							 System.out.print('B');
						 }
						 if (c == i)
						 {
							 System.out.print('C');
						 }
					 }
					 }
				 }


			}
		}

	}
}
