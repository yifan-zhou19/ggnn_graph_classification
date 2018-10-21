package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int[] b = new int[3];
		int[] a = new int[3];
	 for (A = 0;A < 3;A++)
	 {
		  for (B = 0;B < 3;B++)
		  {
			if (A != B)
			{
		 C = 3 - A - B;
			a[0] = (((B < A) + (C == A)) == A);
			a[1] = (((A < B) + (A < C)) == B);
			a[2] = (((C < B) + (C < A)) == C);
			if ((a[0] + a[1] + a[2]) == 3)
			{
				b[A] = 'A';
			b[B] = 'B';
			b[C] = 'C';
			System.out.print((char)(b[2]));
			System.out.print((char)(b[1]));
			System.out.print((char)(b[0]));
			break;
			}
			}
	 else
	 {
	 continue;
	 }
		  }
	 }
	return 0;
	}

}
