package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		 int[][] a = new int[MAX][MAX];

		 int n;
		 int i;
		 int j;
		 int i1;
		 int j1;
		 int i2;
		 int j2;
		 int flag = 1;

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }

		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;j < n;j++)
			 {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (flag == 1 && a[i][j] == 0)
				{
					 i1 = i;
					 j1 = j;
					 flag = 0;

				}

			 }


		 }

		 flag = 0;
		 for (i = n - 1;i >= 0;i--)
		 {
			 for (j = n - 1;j >= 0;j--)
			 {


				   if (a[i][j] == 0)
				   {
					 i2 = i;
					 j2 = j;
					 flag = 1;
					 break;

				   }




			 }

			 if (flag == 1)
			 {
				  break;
			 }

		 }
		// printf("%d***%d***%d***%d\n",i1,j1,i2,j2);

		if ((i2 == i1 + 2) && (j2 == j1 + 2))
		{
			 System.out.printf("%d",1);
		}
		else
		{
			System.out.printf("%d",(i2 - i1 - 1) * (j2 - j1 - 1));
		}




	 return 0;
	}
}

