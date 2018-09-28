package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1300012861 **
	//*???2013.11.01  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[7][7];
		int i;
		int j;
		int max;
		int l;
		int k;
		int count;
		int s;
		int t;
		count = 0;
		for (i = 0; i < 5; i++) //??????????
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			max = a[i][0]; //???????????
			k = 0;
			for (j = 1; j < 5; j++) //????
			{
				if (a[i][j] > max) //????????
				{
					max = a[i][j]; //?????
					k = j; //????????
				}
			}
			for (l = 0; l < 5; l++) //?????????
			{
				if (a[i][k] > a[l][k]) //????????
				{
					break; //????
				}
			}
			if (l == 5) //???????
			{
				count++; //??????
				s = i + 1; //????
				t = k + 1; //????
			}
		}
		if (count != 0) //?????
		{
			System.out.print(s);
			System.out.print(" ");
			System.out.print(t);
			System.out.print(" ");
			System.out.print(a[s - 1][t - 1]);
			System.out.print("\n");
		}
		else
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}


}

