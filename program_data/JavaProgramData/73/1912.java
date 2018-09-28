package <missing>;

public class GlobalMembers
{
	//???2010?11?5?
	//???1000010586_???
	//???????

	public static int Main()
	{
		int i; //????
		int j;
		int k;
		int m;
		int p;
		int q;
		int num;
		int ans = 0;
		int[][] a = new int[5][5]; //??3???
		int[] max = new int[5];
		int[] s = new int[5];
		for (p = 0 ; p <= 4 ; p++)
		{
			for (q = 0 ; q <= 4 ; q++) //????
			{
				a[p][q] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0 ; i <= 4 ; i++) //????????
		{
			max[i] = a[i][0];
			s[i] = 0;
			for (j = 1 ; j <= 4 ; j++)
			{
				 if (a[i][j] >= max[i])
				 {
					max[i] = a[i][j];
					s[i] = j; //????
				 }
			}
			j = 0;
		}
		for (k = 0 ; k <= 4 ; k++) //???????
		{
			num = 0;
			for (m = 0 ; m <= 4 ; m++)
			{
				if (max[k] > a[m][s[k]])
				{
				num = 1;
				}
			}
				if (num == 0)
				{
					System.out.print(k + 1);
					System.out.print(" ");
					System.out.print(s[k] + 1);
					System.out.print(" ");
					System.out.print(max[k]);
					System.out.print("\n");
				ans++;
				}

		}
		if (ans == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

