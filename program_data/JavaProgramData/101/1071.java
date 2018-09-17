package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int A;
		 int B;
		 int C;
		 int[] shu = new int[3];
		 int m;
		 char[] fan = {'A', 'B', 'C'};
		 char n;
		 int a;
		 int b;
		 int c;

		 for (A = 1; A < 4; A++)
		 {
			  for (B = 1; B < 4; B++)
			  {
				   for (C = 1; C < 4; C++)
				   {
					   shu[0] = (A < B) + (A == C);
					   shu[1] = (B < A) + (A > C);
					   shu[2] = (C > B) + (B > A);

					  if ((A - B) * (shu[0] - shu[1]) < 0 && (A - C) * (shu[0] - shu[2]) < 0 && (B - C) * (shu[1] - shu[2]) < 0)
					  {
									for (int i = 0; i < 2; i++)
									{
										   for (int k = 0; k < 2 - i; k++)
										   {
											   if (shu[k] < shu[k + 1])
											   {
												 m = shu[k];
												 shu[k] = shu[k + 1];
												 shu[k + 1] = m;

												 n = fan[k];
												 fan[k] = fan[k + 1];
												 fan[k + 1] = n;

											   }

										   }

									}

									  System.out.print(fan[0]);
									  System.out.print(fan[1]);
									  System.out.print(fan[2]);
									  System.out.print("\n");

					  }


				   }

			  }

		 }


		 return 0;

	}
}
