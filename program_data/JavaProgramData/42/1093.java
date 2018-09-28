package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int[] a = new int[100000];
	 int i;
	 int j;
	 int l;
	 int m;
	 int s = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (l = 0;l < n;l++)
	 {
	   if (a[l] == k)
	   {
		s++;
		for (j = l;j < n;j++)
		{
		 a[j] = a[j + 1];
		}
	   l--;
	   n--;
	   }
	 }
	 for (m = 0;m < n - 1;m++)
	 {
	  System.out.print(a[m]);
	  System.out.print(" ");
	 }
	 System.out.print(a[n - 1]);
	 System.out.print("\n");
		return 0;
	}
}

