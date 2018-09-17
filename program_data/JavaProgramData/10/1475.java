package <missing>;

public class GlobalMembers
{
	public static int[] h = new int[25];
	public static int n;
	public static int hack(int i,int w)
	{
	 if (i == n - 1)
	 {
	  if (h[i] <= w)
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
	 }
	 int b = hack(i + 1, w);
	 int c = 0;
	 if (h[i] <= w)
	 {
	   c = 1 + hack(i + 1, h[i]);
	 }
	 if (b > c)
	 {
		 return b;
	 }
	 else
	 {
		 return c;
	 }
	}
	public static int Main()
	{
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int i;
	 int max = 0;
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  h[i] = Integer.parseInt(tempVar2);
	  }
	  if (h[i] > max)
	  {
	   max = h[i];
	  }
	 }
	 System.out.printf("%d",hack(0, max));
	 return 0;
	}
}

