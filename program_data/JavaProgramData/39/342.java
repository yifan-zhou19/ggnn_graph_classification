package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 char[][] a = new char[n][30];
	 int[][] b = new int[n][3];
	 char[][] c = new char[n][2];
	 for (i = 0;i < n;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   b[i][0] = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   b[i][1] = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar5 != null)
	   {
		   c[i][0] = tempVar5.charAt(0);
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar6 != null)
	   {
		   c[i][1] = tempVar6.charAt(0);
	   }
	   String tempVar7 = ConsoleInput.scanfRead(" ");
	   if (tempVar7 != null)
	   {
		   b[i][2] = Integer.parseInt(tempVar7);
	   }
	 }
	 int[] sum = new int[n];
	 for (i = 0;i < n;i++)
	 {
		sum[i] = 0;
		if (b[i][0] > 80 && b[i][2] > 0)
		{
			sum[i] = sum[i] + 8000;
		}
		if (b[i][0] > 85 && b[i][1] > 80)
		{
			sum[i] = sum[i] + 4000;
		}
		if (b[i][0] > 90)
		{
			sum[i] = sum[i] + 2000;
		}
		if (b[i][0] > 85 && c[i][1] == 'Y')
		{
			sum[i] = sum[i] + 1000;
		}
		if (b[i][1] > 80 && c[i][0] == 'Y')
		{
			sum[i] = sum[i] + 850;
		}
	 }
	   int max = sum[0];
	   int t;
	   int total = 0;
	   String name = new String(new char[10]);
	   for (i = 0;i < n;i++)
	   {
			if (max < sum[i])
			{
				max = sum[i];
				t = i;
			}
	   }
		  for (i = 0;i < n;i++)
		  {
		   total = total + sum[i];
		  }
		  System.out.printf("%s\n%d\n%d",a[t],max,total);
	}
}

