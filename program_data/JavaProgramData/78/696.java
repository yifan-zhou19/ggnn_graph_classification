package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a; //??????a,b,c,d
		 int b;
		 int c;
		 int d = 0;
		 for (a = 1;a <= 5;a++) //?a<=5??????????????a+1
		 {
			 for (b = 1;b <= 5;b++) //?b<=5?????????????b+1
			 {
				 for (c = 1;c <= 5;c++) //?c<=5?????????????c+1
				 {
					 for (d = 1;d <= 5;d++) //?d<=5?????????????d+1
					 {
						 if (a + b == c + d && a + d > b + c && a + c < b) //??????????????????
						 {
							 for (int i = 1;i <= 4;i++) //??????
							 {
								 int max = 0; //?????????max???0
								 int p = 0;
								 if (a > b)
								 {
									 max = a;
									 p = 1;
								 }
								 else
								 {
									 max = b;
									 p = 2;
								 }
								 if (c > max)
								 {
									 max = c;
									 p = 3;
								 }
								 if (d > max)
								 {
									 max = d;
									 p = 4;
								 } //?????????
								 switch (p)
								 {
								 case 1:
								 {
									 System.out.print("z ");
									 System.out.print(max * 10);
									 System.out.print("\n");
									 a = 0;
									 break;
								 }
								 case 2:
								 {
									 System.out.print("q ");
									 System.out.print(max * 10);
									 System.out.print("\n");
									 b = 0;
									 break;
								 }
								 case 3:
								 {
									 System.out.print("s ");
									 System.out.print(max * 10);
									 System.out.print("\n");
									 c = 0;
									 break;
								 }
								 case 4:
								 {
									 System.out.print("l ");
									 System.out.print(max * 10);
									 System.out.print("\n");
									 d = 0;
									 break;
								 }
								 }
							 }
							 return 0;
						 }
					 }
				 }
			 }
		 }
		return 0;
	}
}
