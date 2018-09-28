package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 fflush(stdin);

		 int i;
		 int j;
		 int k;
		 int m;
		 int lie;
		 int h;
		 int sum1 = 0;
		 int sum2 = 0;
		 int sum3 = 0;
		 int sum4 = 0;
		 int sum = 0;
		 //int matrix[100][100];



		 for (i = 0;i < n;i++)
		 {
			sum1 = 0,sum2 = 0,sum3 = 0,sum4 = 0,sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				lie = Integer.parseInt(tempVar3);
			}
			int[][] matrix = new int[h][lie];
			//printf("%d %d",h,lie);



			for (j = 0;j < h;j++)
			{
			for (k = 0;k < lie;k++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					matrix[j][k] = Integer.parseInt(tempVar4);
				}
			}
			}
			fflush(stdin);

			if (h == 1 && lie == 1)
			{
				System.out.printf("%d\n",matrix[0][0]);
				return 0;
			}


			for (m = 0;m < lie;m++)
			{
				sum1 += matrix[0][m];
				sum2 += matrix[h - 1][m];
			}

			for (m = 0;m < h;m++)
			{
				sum1 += matrix[m][0];
				sum2 += matrix[m][lie-1];
			}

			sum = sum1 + sum2 + sum3 + sum4 - (matrix[0][0] + matrix[0][lie-1] + matrix[h - 1][0] + matrix[h - 1][lie-1]);

			System.out.printf("%d\n",sum);


		 }
				return 0;
	}










}

