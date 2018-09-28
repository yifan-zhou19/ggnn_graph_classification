package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[][] stu = new int[2000][3];
		int[] t = new int[3];
		int hao;
		char[][] ID = new char[20000][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ID[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i][0] = Integer.parseInt(ID[i]);
			stu[i][2] = i;
		}



		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (stu[j][1] <= stu[i][1])
				{
					t[0] = stu[i][0];
					stu[i][0] = stu[j][0];
					stu[j][0] = t[0];
					t[1] = stu[i][1];
					stu[i][1] = stu[j][1];
					stu[j][1] = t[1];
					t[2] = stu[i][2];
					stu[i][2] = stu[j][2];
					stu[j][2] = t[2];
				}
			}
		}
			for (i = n - 1;i >= 0;i--)
			{
				if (stu[i][1] >= 60)
				{

					hao = stu[i][2];


					System.out.printf("%s\n",ID[hao]);

					n--;
				}
				else
				{
					break;
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (stu[i][2] > stu[j][2])
					{
						t[0] = stu[i][0];
					stu[i][0] = stu[j][0];
					stu[j][0] = t[0];
					t[1] = stu[i][1];
					stu[i][1] = stu[j][1];
					stu[j][1] = t[1];
					t[2] = stu[i][2];
					stu[i][2] = stu[j][2];
					stu[j][2] = t[2];
					}
				}
			}
				for (i = 0;i < n;i++)
				{
					hao = stu[i][2];


					System.out.printf("%s\n",ID[hao]);
				}
	}


}

