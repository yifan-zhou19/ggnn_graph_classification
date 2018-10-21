package <missing>;

public class GlobalMembers
{
	public static int min(int x,int y)
	{
		int z;
		if (x < y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
		return (z);
	}


	public static void Main()
	{
		 int h;
		 int i;
		 int j;
		 int k;
		 int l;
		 int a;
		 int b;
		 int temp;
		 int flag1;
		 int flag2;
		 int[][] f = new int[100][100];


		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b = Integer.parseInt(tempVar2);
		 }

		 for (i = 0;i < a;i++)
		 {
			 for (j = 0;j < b;j++)
			 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 f[i][j] = Integer.parseInt(tempVar3);
				 }
			 }
		 }

		 temp = min(a, b);

		 for (i = 0;((a - 2 * i) > 0 && (b - 2 * i) > 0);i++)
		 {
			 flag1 = 0;
			 flag2 = 0;
			 if ((a - 2 * i) == 1)
			 {
				 flag1 = 1;
			 }
			 if ((b - 2 * i) == 1)
			 {
				 flag2 = 1;
			 }

			 /*first heng*/
			 for (j = i;j < b - i;j++)
			 {

				 System.out.printf("%d\n",f[i][j]);
			 }

			 /*first shu*/
			 for (j = i + 1;j < a - i - 1;j++)
			 {

				 System.out.printf("%d\n",f[j][b - 1 - i]);
			 }

			 /*second heng*/
			 for (j = b - 1 - i;j > i - 1;j--)
			 {
				 if (flag1 == 1)
				 {
					 break;
				 }
				 System.out.printf("%d\n",f[a - 1 - i][j]);
			 }


			 /*second shu*/
			 for (j = a - 2 - i;j > i;j--)
			 {
				 if (flag2 == 1)
				 {
					 break;
				 }
				 System.out.printf("%d\n",f[j][i]);
			 }
		 }
	}



}

