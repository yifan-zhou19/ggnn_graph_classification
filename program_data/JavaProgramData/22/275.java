package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int[] a = new int[999];
		 int n = 0;
		 int i;
		 int d;
		 int z;
		 int e;
		 while (scanf("%d,", a[n]) != EOF)
		 {
			 n++;
		 }
		 d = a[0];
		 e = 0;
		 z = 0;
		 for (i = 0;i < n;i++)
		 {
			 if (d < a[i])
			 {
				 d = a[i];
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 if (e < a[i] && a[i] < d)
			 {
				 z = 1;
				 e = a[i];
			 }
		 }
		 if (z == 0)
		 {
			 System.out.print("No");
		 }
		 else
		 {
			 System.out.printf("%d",e);
		 }
	}

}
