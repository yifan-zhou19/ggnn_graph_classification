package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[100000];
		  int[] b = new int[100000];
		  int n;
		  int i;
		  int l;
		  int rs = 1;
		  int br = 0;
		  int shml;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  shml = n - 1;
		  for (i = 0;;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  b[i] = Integer.parseInt(tempVar3);
				  }
				  if (a[i] == b[i])
				  {
				  break;
				  }
		  }
		  l = i + 1;
		  if (a[0] != 0)
		  {
		  shml = 0;
		  }
		  for (i = 1;i < l;i++)
		  {
						  if (a[i] != a[i - 1])
						  {
										  rs++;
										  if (a[i] == a[i - 1] + 2)
										  {
										  shml = a[i - 1] + 1;
										  }
						  }
		  }
		  System.out.printf("%d",shml);
	}
}

