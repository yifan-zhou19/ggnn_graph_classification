package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String s = new String(new char[10000]);
	   int i;
	   int h;
	   int t = 0;
	   int x = 0;
	   int[] a = new int[300];
	   int[] b = new int[300];
	   int[] c = new int[30];
	   a[0] = 0;
		   s = new Scanner(System.in).nextLine();
		   h = s.length();
	   for (i = 1;i < h;i++)
	   {
		   if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ')
		   {
			   b[i - t - 1] = i;
		   }
			   else
			   {
				   t = t + 1;
			   }
		   if (s.charAt(i - 1) == ' ' && s.charAt(i) != ' ')
		   {
			   a[i - x] = i;
		   }
		   else
		   {
			   x = x + 1;
		   }
	   }
	   b[h - t - 1] = h;


	for (i = 0;i < h - x;i++)
	{
	c[i] = b[i] - a[i];
	}
	System.out.printf("%d",c[0]);
	for (i = 1;i < h - x;i++)
	{
	System.out.printf(",%d",c[i]);
	}
	}
}
