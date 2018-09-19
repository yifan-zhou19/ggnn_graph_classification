package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i][j] = Integer.parseInt(tempVar2);
				 }
			}
		}
		int a1 = 0;
		int a2 = 0;
		int b1 = 0;
		int b2 = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			   if (a[i][j] == 0)
			   {
					a1 = i;
					b1 = j;
					break;
			   }
			}
			if (a[a1][b1] == 0)
			{
					break;
			}
		}
		for (i = a1;i < n;i++)
		{
			 if (a[i][b1] == 255)
			 {
				 a2 = i - 1;
				break;
			 }
		}
	   for (j = a2;j < n;j++)
	   {
			 if (a[a2][j] == 255)
			 {
				 b2 = j - 1;
				break;
			 }
	   }
		int s = 0;
		for (i = a1;i < a2;i++)
		{
			for (j = b1;j < b2;j++)
			{
				if (a[i][j] == 255)
				{
					 s++;
				}
			}
		}
		System.out.printf("%d\n",s);
	}

}

