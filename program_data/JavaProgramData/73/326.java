package <missing>;

public class GlobalMembers
{
	///#include<cstring>
	public static int Main()
	{
		int[][] a = new int[6][6]; //????5*5??
		int i; //??i?j??????????
		int j;
		int[] hang = new int[6]; //??hang[],lie[]???????????????
		int[] lie = new int[6];
		//memset(lie,1000000,sizeof(lie));??????????????????????????cstring????
		int flag = 0;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				if (a[i][j] > hang[i])
				{
					hang[i] = a[i][j]; //????????
				}
			}
		}
		for (j = 1;j <= 5;j++)
		{
				lie[j] = a[1][j];
			for (i = 1;i <= 5;i++)
			{
				if (a[i][j] < lie[j])
				{
					lie[j] = a[i][j];
				}
			}
		} //????????
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
					if (hang[i] == lie[j] && lie[j] == a[i][j]) //??????????????????????????
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print(" ");
						System.out.print(hang[i]);
						System.out.print("\n");
					 flag = 1;
					} //??flag??1
			}
		}
			if (flag == 0)
			{
				System.out.print("not found");
				System.out.print("\n");
			}
		return 0;
	}
}

