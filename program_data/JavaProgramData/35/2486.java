package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int ctu;
		 do
		 { //begin
			 int[][] a = new int[18][18]; //b?????c?????d????????
			 int i;
			 int j;
			 int b;
			 int c = 0;
			 int d;
			 int m;
			 int n;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 m = Integer.parseInt(tempVar);
			 }
			 String tempVar2 = ConsoleInput.scanfRead(",");
			 if (tempVar2 != null)
			 {
				 n = Integer.parseInt(tempVar2);
			 }
			for (i = 0;i < m;i++)
			{
				 for (j = 0;j < n;j++)
				 {
					 String tempVar3 = ConsoleInput.scanfRead();
					 if (tempVar3 != null)
					 {
						 a[i][j] = Integer.parseInt(tempVar3);
					 }
				 }
			}
			 for (i = 0;i < m;i++) //?????????
			 {
				 for (j = 0;j < n;j++) //?????????
				 {
					 b = 1; //?????????????b?1
					 for (d = 0;d < n;d++) //????????
					 {
						if (a[i][j] < a[i][d])
						{
							b = 0;
						}
					 }
					 if (b == 0)
					 {
						 continue;
					 }
					 for (d = 0;d < m;d++) //????????
					 {
						 if (a[i][j] > a[d][j])
						 {
							 b = 0;
						 }
					 }
					 if (b == 0)
					 {
						 continue;
					 }
					 c++;
					 System.out.printf("%d+%d\n",i,j);
				 }
			 }
			 if (c == 0)
			 {
				 System.out.print("No");
			 }

		 }while (ctu == 1);
		 return 0;
	}
}

