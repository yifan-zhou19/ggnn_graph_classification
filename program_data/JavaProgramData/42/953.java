package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n = 0; //??????????
	 int k = 0;
	 int i = 0;
	 int j = 0;
	 int l = 0;
	 int m = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[] a = new int[100000]; //?????100001??????
	 for (i = 0;i <= n - 1;i++) //???????
	 {
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 while (j < n)
	 { //????n??
	  while (a[j] == k && j <= n - 1)
	  { //????????k??????????????
	   for (l = j; l <= n - 2; l++)
	   {
		a[l] = a[l + 1];
	   }
	   n--;
	  }
	  j++;
	 }
	 for (m = 0;m <= n - 2;m++) //????
	 {
	  System.out.print(a[m]);
	  System.out.print(' ');
	 }
	 System.out.print(a[m]);
	 return 0;
	}
}

