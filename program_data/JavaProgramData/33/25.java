package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		char[][] jianji = new char[1000][399];
	 int n;
	 int i;
	 int j;
	 char[][] jianji1 = new char[1000][399];
	 int[] m = new int[1000];
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
						  jianji[i] = tempVar2.charAt(0);
					  }
	 }
					  for (i = 0;i < n;i++)
					  {
									   m[i] = String.valueOf(jianji[i]).length();
									   for (j = 0;j < m[i];j++)
									   {
														if (jianji[i][j] == 'A')
														{
														jianji1[i][j] = 'T';
														}
														else if (jianji[i][j] == 'T')
														{
														jianji1[i][j] = 'A';
														}
														else if (jianji[i][j] == 'G')
														{
														jianji1[i][j] = 'C';
														}
														else if (jianji[i][j] == 'C')
														{
														jianji1[i][j] = 'G';
														}
									   }
					  }
					  for (i = 0;i < n;i++)
					  {
									   for (j = 0;j < m[i];j++)
									   {
										   System.out.printf("%c",jianji1[i][j]);
									   }
									   System.out.print("\n");
					  }

	}

}

