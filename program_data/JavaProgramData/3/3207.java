package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[2000];
	public static double[] s = new double[1000];
	public static double si;

	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int m;
	 int s = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < m;i++)
	 {

			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t[i] = Integer.parseInt(tempVar3);
			}
	 }

			 //for(i=0;i<=n+1;i++)
			//{for(j=0;j<=n+1;j++)printf("%d ",a[i][j]);printf("\n");}
			for (i = 0;i < m - 1;i++)
			{
			for (j = i;j < m;j++)
			{

			if (t[i] + t[j] == n)
			{
			s = 1;
			}
			}
			}


			s != 0?System.out.print("yes"):printf("no");
			return 0;
	}


}

