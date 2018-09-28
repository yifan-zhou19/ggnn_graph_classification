package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int n;
	  int x;
	  int p;
	  int q;
	  int j;
	  int[] a = new int[400];
	  String s = new String(new char[10000]);
	  s = new Scanner(System.in).nextLine();
	  x = s.length();
	  p = 1;
	  a[0] = -1;
	  for (i = 1;i <= x - 1;i++)
	  {
	   if (s.charAt(i) == 32)
	   {
		a[p] = i;
		p = p + 1;
	   }
	  }
	  for (i = 1;i <= p - 1;i++)
	  {
		  if ((a[i] - a[i - 1] - 1) != 0)
		  {
		System.out.printf("%d,",a[i] - a[i - 1] - 1);
		  }
	  }
	  System.out.printf("%d",x - a[p - 1] - 1);
	}
}
