package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] a = new int[20000];
		  int[] b = new int[20000];
		  int i;
		  int j;
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
		  for (i = 0;i < n;i++)
		  {
			b[i] = 0;
		  }
		  System.out.printf("%d",a[0]);
		  for (i = 1;i < n;i++)
		  {
			for (j = 0;j < i;j++)
			{
			  if (a[i] == a[j])
			  {
				 b[i]++;
				 break;
			  }
			}
		  }
		  for (i = 1;i < n;i++)
		  {
			if (b[i] == 0)
			{
			  System.out.printf(" %d",a[i]);
			}
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

