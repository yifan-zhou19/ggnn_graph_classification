package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[100][16];
	 int[] z = new int[100];
	 int i;
	 int j;
	 int s;
	 int m = 0;
	 for (i = 0;;i++)
	 {
		 for (j = 0;;j++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar);
			 }
			 if (a[i][j] == 0)
			 {
				break;
			 }
			 if (a[i][j] == -1)
			 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 goto loop;
			 }
		 }
	 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (i = 0;a[i][0] != -1;i++)
	{
		 for (j = 0;a[i][j] != 0;j++)
		 {
			 for (s = j + 1;a[i][s] != 0;s++)
			 {
				 if (a[i][j] == 2 * a[i][s])
				 {
				   z[i]++;
				 }
				 if (a[i][j] * 2 == a[i][s])
				 {
					 z[i]++;
				 }
			 }
		 }
		 System.out.printf("%d\n",z[i]);
	}
	}


}

