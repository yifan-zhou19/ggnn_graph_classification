package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a; //aa1 bb1 cc1 dd1 ee1 ?????????????
	   int b;
	   int c;
	   int d;
	   int e;
	   int aa1;
	   int bb1;
	   int cc1;
	   int dd1;
	   int ee1;
	   for (a = 1;a <= 5;a++)
	   {
		   for (b = 1;b <= 5;b++)
		   {
			   for (c = 1;c <= 5;c++)
			   {
				   for (d = 1;d <= 5;d++)
				   {
					   for (e = 1;e <= 5;e++) //??????a.b.c.d.e??1?2?3?4?5
					   {
						   if (a == b || a == c || a == d || a == e || b == c || b == d || b == e || c == d || c == e || d == e || e == 2 || e == 3)
						   {
							   continue; //????????????
						   }
						   aa1 = (e == 1);
						   bb1 = (b == 2);
						   cc1 = (a == 5);
						   dd1 = (c != 1);
						   ee1 = (d == 1);
						   if (a * aa1 + b * bb1 + c * cc1 + d * dd1 + e * ee1 == 3 && aa1 + bb1 + cc1 + dd1 + ee1 == 2) //????????????  ??
						   {
							   System.out.print(a);
							   System.out.print(" ");
							   System.out.print(b);
							   System.out.print(" ");
							   System.out.print(c);
							   System.out.print(" ");
							   System.out.print(d);
							   System.out.print(" ");
							   System.out.print(e);
							   System.out.print("\n");
						   }
					   }
				   }
			   }
		   }
	   }
		return 0;
	}
}
