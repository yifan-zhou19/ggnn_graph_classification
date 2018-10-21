package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int xx;
		 int yy;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 xx = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 yy = Integer.parseInt(tempVar2);
		 }
		 int[] x = new int[10];
		 int[] y = new int[10];
		 x[0] = xx;
		 y[0] = yy;
		 int i;
		 int j;
		 for (i = 1;x[i - 1] != 1;i++)
		 {
			 int q = x[i - 1] / 2;
			 x[i] = q;
		 }
		 i--;
		 for (j = 1;y[j - 1] != 1;j++)
		 {
			 int p = y[j - 1] / 2;
			  y[j] = p;
		 }
		 j--;
		 int bl = 0;
		 //for(int a=0;a<=i;a++) printf("%d\n",x[a]);
		 //for(int b=0;b<=i;b++) printf("%d\n",y[b]);
		 for (int a = 0;a <= i;a++)
		 {
				if (bl == 1)
				{
					break;
				}
				for (int b = 0;b <= j;b++)
				{
				if (x[a] == y[b])
				{
				   System.out.printf("%d",x[a]);
				   bl = 1;
				   break;
				}
				}
		 }
		 System.in.read();
		 System.in.read();


	}

}

