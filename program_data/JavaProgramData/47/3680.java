package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int j;
		int i;
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
		  for (j = n - 1;j >= 1;j--)
		  {
			  System.out.printf("%d ",a[j]);

		  }

		System.out.printf("%d\n",a[0]);


	}


}

