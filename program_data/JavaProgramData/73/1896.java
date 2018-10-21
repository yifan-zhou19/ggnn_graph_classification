package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ? ?                           *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 11 ? 3 ?                    * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{
		int[][] a = new int[5][5]; //b[i]???i??????c[i]???i????????flag??????
		int[] b = new int[5];
		int[] c = new int[5];
		int flag = 0;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] > b[i]) //?????????????????????
				{
					b[i] = a[i][j];
					c[i] = j;
				}
			}
		}
		for (int i = 0; i < 5; i++) //??????????????????
		{
			int j;
			for (j = 0; j < 5; j++)
			{
				if (a[i][c[i]] > a[j][c[i]])
				{
					break;
				}
			}
			if (j == 5) //?j=5??break?????????
			{
				System.out.print(i + 1);
				System.out.print(' ');
				System.out.print(c[i] + 1);
				System.out.print(' ');
				System.out.print(a[i][c[i]]);
				System.out.print("\n");
				flag = 1; //?????????????1
			}
		}
		if (flag == 0) //??????0???????
		{
			System.out.print("not found");
		}
		return 0;
	}
}

