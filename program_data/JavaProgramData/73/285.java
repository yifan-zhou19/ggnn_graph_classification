package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int[][] a = new int[5][5]; //??????
		int i = 0;
		int j = 0;
		int[] m = new int[5];
		int[] n = new int[5];
		for (i = 0;i < 5;i++) //????
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++) //???????
		{
			m[i] = a[i][0];
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > m[i])
				{
					m[i] = a[i][j];
				}
			}
		}
		for (j = 0;j < 5;j++) //???????
		{
			n[j] = a[0][j];
			for (i = 1;i < 5;i++)
			{
				if (a[i][j] < n[j])
				{
					n[j] = a[i][j];
				}
			}
		}
		for (i = 0;i < 5;i++) //????
		{
			for (j = 0;j < 5;j++)
			{
				if (m[i] == n[j])
				{
					System.out.print(i + 1);
					System.out.print(' ');
					System.out.print(j + 1);
					System.out.print(' ');
					System.out.print(m[i]);
					//break;

					return 0;
				}
				//else if(i==4 && j==4)
				//{
				//	cout<<"not found";
				//	break;
				//}
			}
			//if(m[i]==n[j])//???????????
			//	break;
		}
		System.out.print("not found");

		return 0; //?????
	}
}

