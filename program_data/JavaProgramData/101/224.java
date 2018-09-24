package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ??
	* @date 2010?11?17
	* @description
	* ??????: ??? 
	*/
	public static int Main()
	{
		int a; //????
		int b;
		int c;
		int[] l = new int[3];
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++) //?? ??
				{
				   if (a != b && b != c && a != c)
				   {
					   l[a] = (b > a) + (c == a);
					   l[b] = (a > b) + (a > c);
					   l[c] = (c > b) + (b > a);
					   if ((a + l[a]) == 2 && (b + l[b]) == 2 && (c + l[c]) == 2)
					   {
						   if (a < b && b < c)
						   {
							   System.out.print("ABC");
						   }
						   if (a < c && c < b)
						   {
							   System.out.print("ACB");
						   }
						   if (b < a && a < c)
						   {
							   System.out.print("BAC");
						   }
						   if (b < c && c < a)
						   {
							   System.out.print("BCA");
						   }
						   if (c < a && a < b)
						   {
							   System.out.print("CAB");
						   }
						   if (c < b && b < a)
						   {
							   System.out.print("CBA");
						   }
					   }
				   }
				}
			}
		}
				return 0;
	}
}
