package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int t1;
		int t2;
		int t3;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++) //???????????3,2,1??????????
				{
					if (c != b && c != a && b != a) //?a,b,c?????????
					{
						t1 = (b > a) + (a == c);
						t2 = (a > b) + (a > c);
						t3 = (c > b) + (b > a); //t1,t2,t3????a?b?c???????????
						if (a == 1 && t1 > t2 && t1 > t3)
						{
							if (b == 2)
							{
								System.out.print("A");
								System.out.print("B");
								System.out.print("C");
							}
						else
						{
							System.out.print("A");
							System.out.print("C");
							System.out.print("B");
						}
						}
						if (b == 1 && t2 > t1 && t2 > t3)
						{
							if (a == 2)
							{
								System.out.print("B");
								System.out.print("A");
								System.out.print("C");
							}
						else
						{
							System.out.print("B");
							System.out.print("C");
							System.out.print("A");
						}
						}
						if (c == 1 && t3 > t1 && t3 > t2)
						{
							if (a == 2)
							{
								System.out.print("C");
								System.out.print("A");
								System.out.print("B");
							}
						else
						{
							System.out.print("C");
							System.out.print("B");
							System.out.print("A");
						}
						} //???????????????????????
					}
				}
			}
		}
		return 0;
	}



}
