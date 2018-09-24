package <missing>;

public class GlobalMembers
{
	public static String a1 = new String(new char[252]);
	public static String b1 = new String(new char[252]);
	public static int[] a = new int[252];
	public static int[] b = new int[252];
	public static int la;
	public static int lb;
	public static int l;

	public static int Main()
	{
	   a1 = new Scanner(System.in).nextLine();
	   b1 = new Scanner(System.in).nextLine();
	   la = a1.length(), lb = b1.length(), l = la > lb != 0 ? la : lb;
	   int i;
	   for (i = 0 ; i < la ; i++)
	   {
		a[la - i - 1] = a1.charAt(i) - '0';
	   }
	   for (i = 0 ; i < lb ; i++)
	   {
		b[lb - i - 1] = b1.charAt(i) - '0';
	   }
	   for (i = 0 ; i < l ; i++)
	   {
		a[i] += b[i], a[i + 1] += a[i] / 10, a[i] %= 10;
	   }
	   for (; a[l] == 0 && l >= 0 ; l--)
	   {
		   ;
	   }
	   l++;
	   if (l <= 0)
	   {
		   l = 1;
	   }
	   for (i = l - 1 ; i >= 0 ; i--)
	   {
		System.out.printf("%d", a[i]);
	   }
	  // getchar (); getchar ();
	   return 0;
	}

}
