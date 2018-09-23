package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }

		int[] a = new int[30000];

		 for (i = 0;i <= n - 1;i++)
		 {
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}

		 }
	System.out.printf("%d",a[0]);
	for (i = 0;i <= n - 1;i++)

	{
	  for (j = 0;j <= n - 1;j++)
	  {
	if (a[i] == a[j])
	{
		break;
	}


	if (j == i - 1)
	{

		System.out.print(" ");
		System.out.printf("%d",a[i]);


	}
	  }

	}

	return 0;
	}

}

