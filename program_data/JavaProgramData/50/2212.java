package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int m;
		int n;
		int a;
		int b;
		int c = 0;
		int w;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 w = Integer.parseInt(tempVar);
	 }
	 int[] tian = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 int[] jg = new int[12];
	 for (i = 0;i < 12;i++)
	 {
		  c = c + tian[i];
	   m = (c + 12) % 7;
	   if ((w + m) <= 7)
	   {
		  n = w + m;
	   }
	   else
	   {
		   n = m - (7 - w);
	   }
	  if (n == 5)
	  {
		  jg[k] = i + 1;
		  k++;
	  }
	 }
	 for (j = 0;j < k;j++)
	 {
	   System.out.printf("%d\n",jg[j]);
	 }


	}
}

