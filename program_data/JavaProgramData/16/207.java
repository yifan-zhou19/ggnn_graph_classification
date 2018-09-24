package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int c;
		int j;
		int k;
		int t;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 i = n;
	 c = 0;
	 j = 0;
	 while (i > 0)
	 {
			j++;
			m = i % 10;
			i /= 10;
			c = m + c * 10;
	 }
	  i = c;
	  k = 0;
	  while (i > 0)
	  {
		  k++;
		  i = i / 10;
	  }
	  for (t = 1;t <= (j - k);t++)
	  {
	  System.out.print("0");
	  }
	 System.out.printf("%d",c);
	}
}

