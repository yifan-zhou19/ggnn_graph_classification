package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int[][] a = new int[100][100];
	int i;
	int j;
	int k;
	int l;
	int y = 0;
	int z = 0;
	int hang;
	int lie;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		hang = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		lie = Integer.parseInt(tempVar2);
	}
		 for (i = 0;i < hang;i++)
		 {
						   for (j = 0;j < lie;j++)
						   {
										   String tempVar3 = ConsoleInput.scanfRead();
										   if (tempVar3 != null)
										   {
											   a[i][j] = Integer.parseInt(tempVar3);
										   }
						   }
		 }

		 for (i = 0;i < hang;i++)
		 {
							  z = 0;
							  x = a[i][0];
							  k = 0;
							   for (j = 0;j < lie;j++)
							   {
												if (a[i][j] > x)
												{
												x = a[i][j];
											  k = j;
												}
							   }

												for (l = 0;l < hang;l++)
												{

																 if (x <= a[l][k])
																 {
																z = z + 1;
																 }
												}
																 if (z == hang)
																 {

																 y++;
																 System.out.printf("%d+%d",i,k);
																 }
		 }
																 if (y == 0)
																 {
																 System.out.print("No");
																 }
	return 0;
	}
}

