package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[150];
		int m;
		int n;
		int i;
		int j;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		}
		for (i = n;i > 0;i--)
		{
		  for (j = 1;j < i;j++)
		  {
			  m = i;
			  if (a[j] < a[i])
			  {
				  m = j;
			  }
			  temp = a[i];
			  a[i] = a[m];
			  a[m] = temp;
		  }
		}
		System.out.printf("%d\n",a[1]);
		System.out.printf("%d",a[2]);
		return 0;
	}
}

