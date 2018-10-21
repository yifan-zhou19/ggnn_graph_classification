package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char[][] a = new char[200][200];
	 char[][] b = new char[200][200];
	 int i;
	 int j;
	 int n;
	 int[] A = new int[200];
	 int[] B = new int[200];
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i] = tempVar3.charAt(0);
	  }
	  scanf("\n");
	 }
	for (i = 0;i < n;i++)
	{
	A[i] = String.valueOf(a[i]).length() - 1;
	B[i] = String.valueOf(b[i]).length() - 1;
	for (j = A[i],k = B[i];k > 0,k >= 0;j--,k--)
	{

	 a[i][j] = a[i][j] - b[i][k] + 48;

	 while (a[i][j] < '0')
	 {
		a[i][j] += 10;
	a[i][j - 1]--;
	 }
	}
	}
	for (i = 0;i < n;i++)
	{
		System.out.printf("%s\n",a[i]);
	}
	}

}

