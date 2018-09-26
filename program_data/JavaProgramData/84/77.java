package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int j;
	  int n;
	  int t;
	  int[] a = new int[100];
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
	  for (i = 0;i < n - 1;i++)
	  {
		  for (j = i + 1;j < n;j++)
		  {
			  if (a[i] < a[j])
			  {
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			  }
		  }
	  }
	  System.out.printf("%d\n%d\n",a[0],a[1]);

	}

}

