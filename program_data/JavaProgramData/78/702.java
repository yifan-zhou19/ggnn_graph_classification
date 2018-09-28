package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int D;
		int a;
		int b;
		int c;
		int d;
		int[] e = new int[4];
		int i;
		int j;
		int k = 0;
		for (A = 10;A <= 50;A = A + 10)
		{
			for (B = 10;B <= 50;B = B + 10)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 10;C <= 50;C = C + 10)
				{
					if (A == C || B == C)
					{
						continue;
					}
					for (D = 10;D <= 50;D = D + 10)
					{
						if (A == D || B == D || C == D)
						{
							continue;
						}
					if ((A + B == C + D) && (A + D > B + C) && (A + C < B)) //??ABCD??
					{
			e[0] = A;
		 e[1] = B;
		 e[2] = C;
		 e[3] = D; //??????
		 a = A;
		 b = B;
		 c = C;
		 d = D; //??????
					}
					}
				}
			}
		}
		for (k = 1;k < 4;k++)
		{
		   for (i = 1;i < 4;i++)
		   {
			if (e[i] > e[i - 1])
			{
				j = e[i - 1];
				e[i - 1] = e[i];
				e[i] = j;
			}

		   } //??e??????
		}
		for (i = 0;i < 4;i++)
		{
			if (e[i] == a)
			{
				System.out.print("z ");
				System.out.print(e[i]);
				System.out.print("\n");
			}
			if (e[i] == b)
			{
				System.out.print("q ");
				System.out.print(e[i]);
				System.out.print("\n");
			}
			if (e[i] == c)
			{
				System.out.print("s ");
				System.out.print(e[i]);
				System.out.print("\n");
			}
			if (e[i] == d)
			{
				System.out.print("l ");
				System.out.print(e[i]);
				System.out.print("\n");
			}
		}

		return 0;
	}
}
