package <missing>;

public class GlobalMembers
{
	//***********************************************************************
	//???????
	//??????? 
	//??????
	//***********************************************************************
	public static int Main() //???
	{
		double[] s = new double[45]; //??double????????
		double l;
												  //?????????????? 
		int n;
		int k = 0;
		int[][] m = new int[90][3];
		int l1;
		int l2;
		int l3;
		int l4;
		int l5;
		int l6;
		int[][] c = new int[10][3];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++) //for??????
		{
				for (int j = 0; j < 3; j++)
				{
						c[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		for (int i = 0; i < n - 1; i++) //for?????????
		{
				for (int j = i + 1; j < n; j++)
				{
						s[k] = Math.sqrt(Math.pow(c[i][0] - c[j][0],2.0) + Math.pow(c[i][1] - c[j][1],2.0) + Math.pow(c[i][2] - c[j][2],2.0));

						m[k][0] = c[i][0];
						m[k][1] = c[i][1];
						m[k][2] = c[i][2];
						m[k + n * (n - 1) / 2][0] = c[j][0];
						m[k + n * (n - 1) / 2][1] = c[j][1];
						m[k + n * (n - 1) / 2][2] = c[j][2];
						k++;
				}
		}
		for (int i = 1; i < k; i++) //for????
		{
				for (int j = 0; j < k - i; j++)
				{
						if (s[j] < s[j + 1])
						{
								l = s[j];
								l1 = m[j][0];
								l2 = m[j][1];
								l3 = m[j][2];
								l4 = m[j + n * (n - 1) / 2][0];
								l5 = m[j + n * (n - 1) / 2][1];
								l6 = m[j + n * (n - 1) / 2][2];
								s[j] = s[j + 1];
								m[j][0] = m[j + 1][0];
								m[j][1] = m[j + 1][1];
								m[j][2] = m[j + 1][2];
								m[j + n * (n - 1) / 2][0] = m[j + n * (n - 1) / 2 + 1][0];
								m[j + n * (n - 1) / 2][1] = m[j + n * (n - 1) / 2 + 1][1];
								m[j + n * (n - 1) / 2][2] = m[j + n * (n - 1) / 2 + 1][2];
								s[j + 1] = l;
								m[j + 1][0] = l1;
								m[j + 1][1] = l2;
								m[j + 1][2] = l3;
								m[j + n * (n - 1) / 2 + 1][0] = l4;
								m[j + n * (n - 1) / 2 + 1][1] = l5;
								m[j + n * (n - 1) / 2 + 1][2] = l6;
						}
				}
		}
		for (int i = 0; i < k; i++) //for????
		{
				System.out.print("(");
				System.out.print(m[i][0]);
				System.out.print(",");
				System.out.print(m[i][1]);
				System.out.print(",");
				System.out.print(m[i][2]);
				System.out.print(")-");
				System.out.print("(");
				System.out.print(m[i + n * (n - 1) / 2][0]);
				System.out.print(",");
				System.out.print(m[i + n * (n - 1) / 2][1]);
				System.out.print(",");
				System.out.print(m[i + n * (n - 1) / 2][2]);
				System.out.print(")=");
				System.out.printf("%.2f", s[i]);
				System.out.printf("%.2f", "\n");
		}

		return 0;
	}

}

