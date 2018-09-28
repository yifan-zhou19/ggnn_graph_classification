package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int tn;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m = new int[n];
		for (i = 0;i < n;i++)
		{ //?????n???
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		tn = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int I; //N??????tn?????????
		int N = n;
		for (I = n - 1;I >= 1;--I)
		{ //???????tn
			if (m[I] == tn)
			{
				N = N - 1;
			}
			else
			{
				break; //??????tn,?????
			}
		}

		k = N; //k???????????????
		for (i = 0;i < N;i++)
		{
			if (m[i] == tn)
			{
				k = k - 1;
				for (j = i;j < k;j++)
				{
					m[j] = m[j + 1]; //???????????,k??
				}
				i = i - 1;
			}
		}


		for (i = 0;i < k - 1;i++)
		{
			System.out.print(m[i]);
			System.out.print(" ");
		}
		System.out.print(m[k - 1]);
		System.out.print("\n");
		return 0;
	}
}

