package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[101];
		  int n;
		  int i;
		  int now;
		  int sign;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  sign = 0;
		  for (i = 1;i <= n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  now = Integer.parseInt(tempVar2);
			  }
			  if (a[now] == 0)
			  {
				  a[now] = 1;
				  if (sign == 1)
				  {
					  System.out.print(" ");
				  }
				  else
				  {
					  sign = 1;
				  }
				  System.out.printf("%d",now);
			  }
		  }
		  System.out.print("\n");
		  return 0;
	}

}

