package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int i;
	int j;
	int[][] z = new int[100][100];
	int[] hmax = new int[100];
	int[] smin = new int[100];
	hmax[0] = 0;
	smin[0] = 0;
	int p = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < a;i++)
	{
	 String tempVar3 = ConsoleInput.scanfRead("\n");
	 if (tempVar3 != null)
	 {
		 z[i][0] = Integer.parseInt(tempVar3);
	 }
	 for (j = 1;j < b;j++)
	 {
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  z[i][j] = Integer.parseInt(tempVar4);
	  }
	 }
	}
	for (i = 0;i < a;i++)
	{
	 hmax[i] = 0;
	 for (j = 0;j < b;j++)
	 {
	  if (z[i][j] > z[i][hmax[i]])
	  {
	   hmax[i] = j;
	  }
	 }
	}
	for (i = 0;i < b;i++)
	{
	 smin[i] = 0;
	 for (j = 0;j < a;j++)
	 {
	  if (z[j][i] < z[smin[i]][i])
	  {
	   smin[i] = j;
	  }
	 }
	}
	for (i = 0;i < a;i++)
	{
	 if (smin[(hmax[i])] == i)
	 {
	   System.out.printf("%d+%d\n",i,hmax[i]);
	   p++;
	 }
	}
	if (p == 0)
	{
	System.out.print("No\n");
	}
	return 0;
	}
}

