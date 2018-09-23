package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int max;
		int min;
		int c;
		int as;
		int bs;
		int cs;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
				as = (b > a) + (a == c);
				bs = (a > b) + (a > c);
				cs = (c > b) + (b > a);
				if ((((a > b) && (as < bs)) || ((a < b) && (as> bs))) && (((c> b) && (cs < bs)) || ((c < b) && (cs> bs))) && (((a> c) && (as < cs)) || ((a < c) && (as> cs))))
				{
				   System.out.print("BCA");
				}
				}
			}
		}
				return 0;
	}
}
