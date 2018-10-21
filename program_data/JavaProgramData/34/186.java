package <missing>;

public class GlobalMembers
{
	public static void gj(int k)
	{
	  int i;
	  int j;
	  int m;
	  if (k == 1)
	  {
	   System.out.print("End\n");
	   return;
	  }
	  if (k % 2 == 1)
	  {
		System.out.printf("%d*3+1=%d\n",k,3 * k + 1);
		gj(3 * k + 1);
	  }
	  else
	  {
		System.out.printf("%d/2=%d\n",k,k / 2);
		gj(k / 2);
	  }
	}

	public static int Main()
	{
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  gj(k);
	  return 0;
	}
}

