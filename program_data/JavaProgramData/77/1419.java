package <missing>;

public class GlobalMembers
{
	public static int i = 0;
	public static int j = 0;
	public static int[] a = new int[200];
	public static char c;
	public static char d;
	public static int solve()
	{

	 String tempVar = ConsoleInput.scanfRead(null, 1);
	 if (tempVar != null)
	 {
		 c = tempVar.charAt(0);
	 }
	 if (c == d)
	 {
				a[i] = j;
				j++;
				i++;
				solve();
				return 0;
	 }
	   if (c != d)
	   {
				System.out.printf("%d %d\n",a[i - 1],j);
				i--;
				j++;
				if (i == 0)
				{
					return 0;
				}
				solve();
	   }
	}
	public static int Main()
	{
	String tempVar = ConsoleInput.scanfRead(null, 1);
	if (tempVar != null)
	{
		c = tempVar.charAt(0);
	}
	  d = c;
	  a[i] = j;
	  j++;
	  i++;
	  solve();

	}
}

