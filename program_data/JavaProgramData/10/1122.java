package <missing>;

public class GlobalMembers
{
	public static int[] H = new int[1000];
	public static int[] D = new int[1000];

	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int n;
	 int temp;
	 for (i = 0;i < 21;i++)
	 {
		 D[i] = 0;
	 }
	 i = 0;
	 while (scanf("%d",H[i]) != EOF)
	 {
		 i++;
	 }
	 D[i - 1] = 1;
	 for (j = i - 2;j >= 0;j--)
	 {
	   k = j + 1;
	   n = 0;
	   while (k < i)
	   {
		 if (H[j] >= H[k] != 0 && D[k] > n)
		 {
			 n = D[k];
		 }
		 k++;
	   }
	  D[j] = n + 1;
	 }
	 n = 0;
	 for (j = 0;j < i;j++)
	 {
	  if (D[j] > n)
	  {
		  n = D[j];
	  }
	 }
	 System.out.printf("%d",n);

	}
}
