package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int t1;
	  int t2;
	  int n;
	  int num;
	  int max1;
	  int max2;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	max1 = max2 = 0;
		t1 = t2 = 0;
		for (i = 1;i <= n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  num = Integer.parseInt(tempVar2);
		  }
		  if (num > max1)
		  {
			t2 = t1;
			t1 = i;
			max2 = max1;
			max1 = num;
		  }
		  else if (num > max2 && num < max1)
		  {
			max2 = num;
			t2 = i;
		  }
		}
	   System.out.printf("%d\n%d\n", max1, max2);
	}
}

