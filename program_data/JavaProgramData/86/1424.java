package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int time;
	int cs;
	int num;
	int[] a = new int[1000];
	int[][] b = new int[1000][60];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
		 for (int j = 0;j < a[i];j++)
		 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 b[i][j] = Integer.parseInt(tempVar3);
				 }
		 }
	}
	for (int k = 0;k < n;k++)
	{
		 time = 60;
		 cs = 0;
		 num = 0;
		 if (a[k] == 0)
		 {
				System.out.print("60\n");
				continue;
		 }
		 for (int m = 0;m <= a[k];m++)
		 {
			for (int t = 0;t < 60;t++)
			{
				if (cs == b[k][m])
				{
					 time -= 3;
					 break;
				}
				if (time <= 0)
				{
					 System.out.printf("%d\n",cs);
					  num = 1;
					 break;
				}
				time--;
				cs++;
			}
		 if (num == 1)
		 {
			break;
		 }
		 }
	}
	return 0;
	}
}

