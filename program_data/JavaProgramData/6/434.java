package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n;
		int[][] num = new int[100][2];
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		int sum = 0;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			num[k][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[k][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			for (i = 0;i < num[k][0];i++)
			{
				for (j = 0;j < num[k][1];j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (m = 0;m < num[k][0];m++) //????????
			{
				if (m == 0 || m == num[k][0] - 1) //??????????
				{
				for (p = a[m];p < a[m] + num[k][1];p++)
				{
					sum = sum + *p;
				}
				} //???????????sum
			else
			{
				sum = sum + a[m][0] + a[m][num[k][1] - 1]; //???????????????????
			}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	} //?????
}

