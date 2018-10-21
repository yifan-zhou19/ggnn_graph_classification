package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x;
		  int y;
		  int t;
		  int s = 0;
		  int[] a = new int[11];
		  int[] b = new int[11];
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x = Integer.parseInt(tempVar);
		  }
		  a[0] = x;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  y = Integer.parseInt(tempVar2);
		  }
		  b[0] = y;
		  i = 0;
		  do
		  {
			  i += 1;
			  a[i] = a[i - 1] / 2;
			  b[i] = b[i - 1] / 2;
		  } while ((a[i] > 1) || (b[i] > 1));
		  for (i = 0;i < 11;i++)
		  {
			  for (j = 0;j < 11;j++)
			  {
				  if (b[j] == a[i])
				  {
					  t = b[j];
					  s = 1;
					  break;
				  }
			  }
			  if (s == 1)
			  {
				  break;
			  }
		  }
		  System.out.printf("%d",t);
	}
}

