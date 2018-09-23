package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int hanshu = new int(int k,int min);
	  int n;
	  int i;
	  int a;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  System.out.printf("%d\n",hanshu(a, 2));
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  n = Integer.parseInt(tempVar3);
	  }
	  return 0;
	}
	  public static int hanshu(int k,int min)
	  {
		  int j;
		  int[] a = new int[k];
		  int b = 1;
		  if (k < min)
		  {
			  return 0;
		  }
		  for (j = min;j <= k / j;j++)
		  {
			 if (k % j == 0)
			 {
			   b += hanshu(k / j, j);
			 }
		  }
		  return (b);
	  }

}

