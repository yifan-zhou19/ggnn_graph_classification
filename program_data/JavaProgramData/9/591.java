package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int m;
		  int l;
		  int[] age = new int[10000];
		  char[][] ID = new char[10000][10];
		  char[][] order = new char[10000][10];
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
							  age[i] = Integer.parseInt(tempVar3);
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  m = 0;
						  for (j = 1;j < n - i;j++)
						  {
											if (age[j] >= 60 && age[j] > age[m])
											{
											m = j;
											}
						  }
						  for (j = 0;j < 10;j++)
						  {
										   order[i][j] = ID[m][j];
						  }
						  for (j = m;j < n;j++)
						  {
											for (k = 0;k < 10;k++)
											{
															 ID[j][k] = ID[j + 1][k];
											}
											age[j] = age[j + 1];
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  System.out.println(order[i]);
		  }
	}
}

