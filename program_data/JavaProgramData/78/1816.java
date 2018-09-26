package <missing>;

public class GlobalMembers
{
	/*
	 * chengtizhong.cpp
	 *
	 *  Created on: 2012-10-18
	 *      Author: ??
	 *      description????????????????????????????????????????????
	 *      ?????????????10???????????????50?????????????????????????????;
	 *      ?????????????????????????????????????????????????????????????
	 *      ???????????????????????????????
	 */
	public static int Main() //???
	{
		 int z;
		 int q;
		 int s;
		 int l;
		 for (z = 1;z <= 5;z++)
		 {
			 for (q = 1;q <= 5;q++)
			 {
				 for (s = 1;s <= 5;s++)
				 {
					 for (l = 1;l <= 5;l++) //???????
					 {
						 if ((z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l))
						 {
							 if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q)) //???????????
							 {
								 if (z == 5)
								 {
									 System.out.print("z 50");
									 System.out.print("\n");
								 }
								 if (q == 5)
								 {
									 System.out.print("q 50");
									 System.out.print("\n");
								 }
								 if (s == 5)
								 {
									 System.out.print("s 50");
									 System.out.print("\n");
								 }
								 if (l == 5)
								 {
									 System.out.print("l 50");
									 System.out.print("\n");
								 }
								 if (z == 4)
								 {
									 System.out.print("z 40");
									 System.out.print("\n");
								 }
								 if (q == 4)
								 {
									 System.out.print("q 40");
									 System.out.print("\n");
								 }
								 if (s == 4)
								 {
									 System.out.print("s 40");
									 System.out.print("\n");
								 }
								 if (l == 4)
								 {
									 System.out.print("l 40");
									 System.out.print("\n");
								 }
								 if (z == 3)
								 {
									 System.out.print("z 30");
									 System.out.print("\n");
								 }
								 if (q == 3)
								 {
									 System.out.print("q 30");
									 System.out.print("\n");
								 }
								 if (s == 3)
								 {
									 System.out.print("s 30");
									 System.out.print("\n");
								 }
								 if (l == 3)
								 {
									 System.out.print("l 30");
									 System.out.print("\n");
								 }
								 if (z == 2)
								 {
									 System.out.print("z 20");
									 System.out.print("\n");
								 }
								 if (q == 2)
								 {
									 System.out.print("q 20");
									 System.out.print("\n");
								 }
								 if (s == 2)
								 {
									 System.out.print("s 20");
									 System.out.print("\n");
								 }
								 if (l == 2)
								 {
									 System.out.print("l 20");
									 System.out.print("\n");
								 }
								 if (z == 1)
								 {
									 System.out.print("z 10");
									 System.out.print("\n");
								 }
								 if (q == 1)
								 {
									 System.out.print("q 10");
									 System.out.print("\n");
								 }
								 if (s == 1)
								 {
									 System.out.print("s 10");
									 System.out.print("\n");
								 }
								 if (l == 1)
								 {
									 System.out.print("l 10");
									 System.out.print("\n");
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
