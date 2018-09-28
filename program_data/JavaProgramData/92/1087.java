package <missing>;

public class GlobalMembers
{
	public static int Greedy(int[] Tj, int[] Kg, int n)
	{
		int count = 0; //???????
		int Tj_fa = n - 1; // ??????????
		int Tj_lo = 0;
		int Kg_fa = n - 1;
		int Kg_lo = 0;
		while (Tj_lo <= Tj_fa)
		{
			if (Tj[Tj_fa] > Kg[Kg_fa]) // ??????????????
			{
						  count++;
						  Tj_fa--;
						  Kg_fa--;
			}
			else if (Tj[Tj_lo] > Kg[Kg_lo]) // ??????????????
			{
						  count++;
						  Tj_lo++;
						  Kg_lo++;
			}
			else //???????????????
			{
						  if (Tj[Tj_lo] < Kg[Kg_fa])
						  {
							  count--;
						  }
							 Tj_lo++;
					Kg_fa--;
			}
		}
		return count;
	}
	public static int Main()
	{
	   int[] T = new int[1002];
	   int[] K = new int[1002];
	   int n;
	  while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	  {
		   int i;
		   for (i = 0;i < n;i++)
		   {
			   T[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		   for (i = 0;i < n;i++)
		   {
			   K[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		   sort(T,T + n);
		   sort(K,K + n);
		   System.out.print(Greedy(T, K, n) * 200);
		   System.out.print("\n");
	  }
	   return 0;

	}


}

