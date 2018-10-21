package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int A;
		 int B;
		 int C;
		 int i;
		 int ans;
		 int bns;
		 int cns;
		 int Ans;
		 int Bns;
		 int Cns;
		 for (A = 1;A < 4;A++)
		 {
			   for (B = 1;B < 4;B++)
			   {
					 if (B == A)
					 {
					 continue;
					 }
				  C = 6 - B - A;
				   ans = (B > A) + (C == A);
				  bns = (A > B) + (A > C);
				  cns = (C > B) + (B > A);
				  if ((B + bns == 3) && (A + ans == 3) && (C + cns == 3))
				  {
					  Ans = A;
				  Bns = B;
				  Cns = C;
				  }
			   }
		 }


			  for (i = 1;i < 4;i++)
			  {
				  if (i == Ans)
				  {
					  System.out.print("A");
				  }
				  else if (i == Bns)
				  {
					  System.out.print("B");
				  }
				  else
				  {
					  System.out.print("C");
				  }
			  }
			  return 0;
	}
}
