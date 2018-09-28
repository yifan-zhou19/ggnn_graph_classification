package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100001];
	 int i;
	 int n;
	 int k;
	 int num = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i <= n;i++)
	 {
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i <= n - num;i++)
	 {
		 int j;
	 if (a[i] == k)
	 {
		 j = i;
		 while (j < n - num)
		 {
		  a[j] = a[j + 1];
		  j++;
		 }
		 num++;
		 i--; //??????????
	 }
	 }
	 i = 1;
	 while (i <= n - num) //????????a?1???????????????????
	 {
		 if (i == 1)
		 {
			 System.out.print(a[1]);
		 }
		 else
		 {
	  System.out.print(" ");
	  System.out.print(a[i]);
		 }
		 i++;
	 }
	 return 0;
	}
}

