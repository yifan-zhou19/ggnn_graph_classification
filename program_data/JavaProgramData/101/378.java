package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int a;
	  int b;
	  int c;
	  int as;
	  int bs;
	  int cs;
	  for (a = 1;a < 4;a++)
	  {
	  for (b = 1;b < 4;b++)
	  {
	  for (c = 1;c < 4;c++)
	  {
		  as = (b > a) + (c == a);
		  bs = (a > b) + (a > c);
		  cs = (c > b) + (b > a);
		  if (!((a <= b) && (as <= bs) || (a <= c) && (as <= cs) || (b <= a) && (bs <= as) || (b <= c) && (bs <= cs) || (c <= a) && (cs <= as) || (c <= b) && (cs <= bs)))
		  {
		  for (i = 1;i < 4;i++)
		  {
			  if (a == i)
			  {
				  System.out.print("A");
			  }
			  if (b == i)
			  {
				  System.out.print("B");
			  }
			  if (c == i)
			  {
				  System.out.print("C");
			  }
		  }
		  }
	  }
	  }
	  }
	  return 0;
	}
}
