package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //?????? ????????????
		int B;
		int C;
		int D;
		int E;
		int[] ans = {-1, 1, 1, 0, 0, 0};
	 for (A = 1;A < 6;A++)
	 {
		 for (B = 1;B < 6;B++)
		 {
			 for (C = 1;C < 6;C++)
			 {
				 for (D = 1;D < 6;D++)
				 {
					 for (E = 1;E < 6;E++) //??????
					 {
	  if (A != B && A != C && A != D && A != E && B != C && B != D && B != E && C != D && C != E && D != E && E != 2 && E != 3) //?? ?????? ? E??2?3? ???
	  {
	   if ((E == 1) == ans[A] && (B == 2) == ans[B] && (A == 5) == ans[C] && (C != 1) == ans[D] && (D == 1) == ans[E]) //??5??????????????
	   {
		System.out.print(A);
		System.out.print(' ');
		System.out.print(B);
		System.out.print(' ');
		System.out.print(C);
		System.out.print(' ');
		System.out.print(D);
		System.out.print(' ');
		System.out.print(E);
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
