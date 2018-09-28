package <missing>;

public class GlobalMembers
{
	//********************************
	//*???1.cpp   **
	//*?????? 1200012768 **
	//*???2012.10.24  **
	//*???????????  **
	//********************************
	public static int Main()
	{
		 int m;
		 int i;
		 int j;
		 int k;
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 3; i <= m / 2; i += 2)
		 {
			   int root1 = Math.sqrt(i);
			   for (j = 3; j <= root1; j += 2) //???????i?????
			   {
				   if (i % j == 0)
				   {
					 break;
				   }
			   }
			 if (j <= root1) //??i????
			 {
				 continue; //?????????????
			 }
			 int root2 = Math.sqrt(m - i);
			 for (k = 3; k <= root2; k += 2) //??????? m - i ?????
			 {
				   if ((m - i) % k == 0)
				   {
					 break;
				   }
			 }
			 if (k > root2) //m - i ????
			 {
				 System.out.print(i);
				 System.out.print(" ");
				 System.out.print(m - i);
				 System.out.print("\n");
			 }
		 }
		 return 0;
	}
}

