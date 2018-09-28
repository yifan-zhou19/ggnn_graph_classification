package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????? **
	//*??????  1200062706**
	//*???2012.11.11  **
	//********************************

	public static int Main()
	{
		int a;
		int b;
		int j;
		int k;
		float[][] x = new float[100][100];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < a; j++)
		{
			for (k = 0; k < b; k++)
			{
				float e;
				e = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				x[j][k] = e; //????x???
			}
		}
		int a1;
		int b1;
		float[][] y = new float[100][100];
		a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < a1; j++)
		{
			for (k = 0; k < b1; k++)
			{
				float e1;
				e1 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				y[j][k] = e1; //????y???
			}
		}
		int i;
		int a2;
		int[][] c = new int[100][100];
		for (j = 0; j < a; j++)
		{
			for (k = 0; k < b1; k++)
			{
				a2 = 0;
				for (i = 0; i < b; i++)
				{
					a2 = a2 + x[j][i] * y[i][k];
									  //??????c[J][K]??
				}
				c[j][k] = a2;
			}
		}
		if (b1 == 1)
		{
			for (i = 0; i < a; i++)
			{
				System.out.print(c[i][0]);
				System.out.print("\n");
			}
		}
		else
		{
			for (j = 0; j < a; j++)
			{
				for (k = 0; k < b1; k++)
				{
					if (k == 0)
					{
						System.out.print(c[j][k]);
					}
					else if (k == b1 - 1)
					{
						System.out.print(" ");
						System.out.print(c[j][k]);
						System.out.print("\n");
					}
					else
					{
						System.out.print(" ");
						System.out.print(c[j][k]);
					}
				}
			}
		}

		return 0;
	}

}

