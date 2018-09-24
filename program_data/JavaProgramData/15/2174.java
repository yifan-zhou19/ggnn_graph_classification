package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[][] Main_a = new int[1002][1002];
	public static int Main()
	{
	   int n;
	   int temp;
	   int x1;
	   int x2;
	   int y1;
	   int y2;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//   static int a[1002][1002];
	   int i;
	   int j;


	 //  for (i=1;i<=100;i++) 
	  //     for (j=1;j<=100;j++) printf("%d ",a[i][j]);   



	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
		   for (j = 1;j <= n;j++)
		   {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					temp = Integer.parseInt(tempVar2);
				}
				Main_a[i][j] = (temp == 0)? 1:0;
		   }
	   }
	   for (i = 1;i <= n;i++)
	   {
			for (j = 1;j <= n;j++)
			{
				if (Main_a[i][j] == 1)
				{
						if ((Main_a[i][j + 1] == 1) && (Main_a[i + 1][j] == 1))
						{
							x1 = i;
							y1 = j;
						}
						if ((Main_a[i][j - 1] == 1) && (Main_a[i - 1][j] == 1))
						{
							x2 = i;
							y2 = j;
						}
				}
			}
	   }
		System.out.printf("%d\n",(x2 - x1 - 1) * (y2 - y1 - 1));
	  //  scanf("%d",&n);
		return 0;

	}

}

