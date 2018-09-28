package <missing>;

public class GlobalMembers
{
	public static int[] sign = new int[10];
	public static int a;
	public static int b;
	public static int c;
	public static int d;
	public static int e;
	public static void work()
	{
		 int t;
		 int flag = 0;
		 if (a == 2)
		 {
				 t = 1;
				 a = 1;
		 }
		 if (b == 2)
		 {
				 t = 2;
				 b = 1;
		 }
		 if (c == 2)
		 {
				 t = 3;
				 c = 1;
		 }
		 if (d == 2)
		 {
				 t = 4;
				 d = 1;
		 }
		 if (a == 1 && sign[1] != 0 && b == 1 && sign[2] != 0 && flag == 0)
		 {
			 flag = 1;
		 }
		 if (a == 1 && sign[1] != 0 && c == 1 && sign[3] != 0 && flag == 0)
		 {
			 flag = 1;
		 }
		 if (a == 1 && sign[1] != 0 && d == 1 && sign[4] != 0 && flag == 0)
		 {
			 flag = 1;
		 }

		 if (b == 1 && sign[2] != 0 && c == 1 && sign[3] != 0 && flag == 0)
		 {
			 flag = 1;
		 }
		 if (b == 1 && sign[2] != 0 && d == 1 && sign[4] != 0 && flag == 0)
		 {
			 flag = 1;
		 }

		 if (c == 1 && sign[3] != 0 && d == 1 && sign[4] != 0 && flag == 0)
		 {
			 flag = 1;
		 }
		 if (t == 1)
		 {
			 a = 2;
		 }
		 if (t == 2)
		 {
			 b = 2;
		 }
		 if (t == 3)
		 {
			 c = 2;
		 }
		 if (t == 4)
		 {
			 d = 2;
		 }
		 if (flag != 0)
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
						   System.out.print("\n");
		 }
	}




	public static int Main()
	{

		for (a = 1;a <= 5;a++)
		{
						 for (b = 1;b <= 5;b++)
						 {
						 if (a == b)
						 {
							 continue;
						 }
										for (c = 1;c <= 5;c++)
										{
														 if (a == c || b == c)
														 {
															 continue;
														 }
															for (d = 1;d <= 5;d++)
															{
																			 if (a == d || b == d || c == d)
																			 {
																				 continue;
																			 }
																			 for (e = 4;e <= 5;e++)
																			 {
																							  if (a == e || b == e || c == e || d == e)
																							  {
																								  continue;
																							  }
																							  sign[1] = sign[2] = sign[3] = sign[4] = sign[5] = 0;
																							  sign[1] = e == 1;
																							  sign[2] = b == 2;
																							  sign[3] = a == 5;
																							  sign[4] = c != 1;
																							  sign[5] = d == 1;
																							  if (sign[1] + sign[2] + sign[3] + sign[4] + sign[5] == 2)
																							  {
																							  work();
																							  /*cout<<a<<' '<<b<<' '<<c<<' '<<d<<' '<<e<<endl;*/
																							  }
																			 }
															}
										}
						 }
		}
		return 0;
	}

}
