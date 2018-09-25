package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int[] a = new int[20000];
		  int count = 0;
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
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  System.out.printf("%d",a[0]);
		  for (i = 1;i < n;i++)
		  {
						  int count = 0;
						  for (j = 0;j < i;j++)
						  {
						  if (a[i] == a[j])
						  {
						  count++;
						  }
						  }
						  if (count == 0)
						  {
						  System.out.printf(" %d",a[i]);
						  }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

