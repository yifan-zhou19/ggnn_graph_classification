package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int xg = int x;
	 int i;
	 int k;
	 int j = 0;
	 int n;
	 int p;
	 int q;
	 int s = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[100];
	 for (i = 1;i <= n;i++)
	 {
	   if (xg(i) == 0)
	   {
		a[j] = i;
		j++;
	   }
	 }
	 for (i = 0;i < j;i++)
	 {
	   s = s + a[i] * a[i];
	 }
	 System.out.printf("%d",s);

	}


	public static int xg(int x)
	{
		int m;
		m = x / 10;
	 if ((x % 7 == 0) || (m == 7) || ((x - m * 10) == 7))
	 {
		 return (1);
	 }
	 else
	 {
		 return (0);
	 }
	}

}

