package <missing>;

public class GlobalMembers
{
	/*
	 * ???012.cpp
	 * Created on: 2012-10-14
	 * ???:???
	 * ??????
	 */
	public static int Main()
	{ //???
	  int z = 1; //??z q s l???
	  int q = 1;
	  int s = 1;
	  int l = 1;
	  for (z = 1;z <= 5;z++)
	  { //??z??
		  for (q = 1;q <= 5;q++)
		  { //??q??
				  if (z != q)
				  { //??z q???
					  for (s = 1;s <= 5;s++)
					  { //??s??
						  if (s != z && s != q)
						  { //???????
							 for (l = 1;l <= 5;l++)
							 { //??l??
								 if (l != z && l != q && l != s)
								 { //??????
								 if (z == s + l - q && z > s + q - l && z < q - s)
								 { //??????
								 int[] a = {z, q, s, l}; //???????i j t???
								 int i;
								 int j;
								 int t;
								 char[] m = {'z', 'q', 's', 'l'}; //?????????x????
								 char x;
								 for (j = 0;j < 3;j++)
								 { //??3???
									 for (i = 0;i < 3 - j;i++)
									 { //??????3-j???
										 if (a[i] < a[i + 1])
										 { //???????????
											 t = a[i];
											 a[i] = a[i + 1];
											 a[i + 1] = t; //?????
											 x = m[i];
											 m[i] = m[i + 1];
											 m[i + 1] = x;
										 } //????????
									 }
								 }
								 System.out.print(m[0]);
								 System.out.print(" ");
								 System.out.print(a[0] * 10);
								 System.out.print("\n");
								 System.out.print(m[1]);
								 System.out.print(" ");
								 System.out.print(a[1] * 10);
								 System.out.print("\n");
								 System.out.print(m[2]);
								 System.out.print(" ");
								 System.out.print(a[2] * 10);
								 System.out.print("\n");
								 System.out.print(m[3]);
								 System.out.print(" ");
								 System.out.print(a[3] * 10);
								 System.out.print("\n");

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
