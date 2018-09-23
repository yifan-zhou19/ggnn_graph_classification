package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ?                              *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 11 ? 17 ?                   * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{

		//?????????????????????????????WA??????????
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		for (a = 0; a < 3; a++)
		{
			for (b = 0; b < 3; b++)
			{
				for (c = 0; c < 3; c++)
				{
					A = (b > a) + (c == a);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);
					if ((((a > b && A < B) || (a < b && A > B)) + ((a > c && A < C) || (a < c && A > C)) + ((b > c && B < C) || (b < c && B > C))) == 3)
					{
						if (a > b)
						{
							if (b > c)
							{
								System.out.print("CBA");
							}
							else if (a > c)
							{
								System.out.print("BCA");
							}
							else
							{
								System.out.print("BAC");
							}
						}
						else if (b < c)
						{
							System.out.print("ABC");
						}
						else if (a > c)
						{
							System.out.print("CAB");
						}
						else
						{
							System.out.print("ACB");
						}
					}
				}
			}
		}
		return 0;
	}
}
