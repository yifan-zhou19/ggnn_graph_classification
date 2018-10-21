package <missing>;

public class GlobalMembers
{
	//************************//
	//*?????????    *//
	//*?????            *//
	//*???2010.11.26      *//
	//************************//
	public static void h(int n, int[] a, int i)
	{
	   i++;
	   if (n == 1)
	   {
		   a[i] = n;
	   }
	   else
	   {
		   if (n % 2 == 0)
		   {
			   a[i] = n;
			   h(n / 2, a, i);
		   }
		   else
		   {
			   a[i] = n;
			   h((n - 1) / 2, a, i);
		   }
	   }
	}
	public static void m(int n, int[] b, int k)
	{
	   k++;
	   if (n == 1)
	   {
		   b[k] = n;
	   }
	   else
	   {
		   if (n % 2 == 0)
		   {
			   b[k] = n;
			   m(n / 2, b, k);
		   }
		   else
		   {
			   b[k] = n;
			   m((n - 1) / 2, b, k);
		   }
	   }
	}
	public static int Main()
	{
	 int x;
	 int y;
	 int j;
	 int t;
	 int flag = 1;
	 int[] a = new int[100];
	 int[] b = new int[100];
	 for (j = 0;j < 100;j++)
	 {
	   a[j] = 0;
	   b[j] = 0;
	 }
	 x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 h(x, a, -1);
	 m(y, b, -1);
	 for (j = 0;a[j] != 0;j++)
	 {
	   for (t = 0;b[t] != 0;t++)
	   {
		 if (a[j] == b[t])
		 {
		   System.out.print(a[j]);
		   System.out.print("\n");
		   flag = 0;
		   break;
		 }
	   }
	   if (flag == 0)
	   {
		   break;
	   }
	 }
	 return 0;
	}
}

