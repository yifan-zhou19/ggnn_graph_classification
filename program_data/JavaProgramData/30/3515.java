package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int k = 0;
		  int sum = 0;
		  int c;
		  int b;
		  int[] a = new int[100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
			  b = i / 10;
			  c = i - 10 * b;
			  if (i % 7 != 0 && c != 7 && b != 7)
			  {
					a[k] = i;
					k++;
			  }
		  }
		  for (k = 0;a[k] != 0;k++)
		  {
		  sum = sum + a[k] * a[k];
		  }
		  System.out.printf("%d",sum);
	}

}

