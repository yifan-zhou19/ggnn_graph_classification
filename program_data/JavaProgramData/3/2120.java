package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int k;
	  int i = 0;
	  int j;
	  int x = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  int[] a = new int[n];
	  for (;i <= n - 1;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a + i = tempVar3;
		  }
	  for (j = 0;j <= i - 1;j++)
	  {
	  if (a[i] + a[j] == k)
	  {
		x = 1;
		break;
	  }
	  }
	  if (x == 1)
	  {
		  System.out.print("yes");
		  break;
	  }
	  }
	  if (x == 0)
	  {
		  System.out.print("no");
	  }
	}

}

