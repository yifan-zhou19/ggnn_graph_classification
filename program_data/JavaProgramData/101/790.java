package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		/*A??B??????C??????? 
		  B??A??????A??C??? 
		  C????B????B?A???? 
		  ?????????????????????*/
		int a;
		int b;
		int c;
		int a0;
		int b0;
		int c0;
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				for (c = 0;c <= 2;c++)
				{
					a0 = (b > a) + (c == a);
					b0 = (a > b) + (a > c);
					c0 = (c > b) + (b > a);
					if (((a > c && a0 < c0) || (a == c && a0 == c0) || (a < c && a0> c0)) && ((a> b && a0 < b0) || (a == b && a0 == b0) || (a < b && a0> b0)) && ((c> b && c0 < b0) || (c == b && c0 == b0) || (c < b && c0> b0)))
					{
						for (int i = 0;i <= 2;i++)
						{
							if (a == i)
							{
								System.out.print("A");
							}
							if (b == i)
							{
								System.out.print("B");
							}
							if (c == i)
							{
								System.out.print("C");
							}
						}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto end;
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		end:
		return 0;
	}
}
