package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int i = 1;
		int j = 1;
		int ming;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int k = 0;k < n;k++)
		{
				a[k] = 0;
				b[k] = 0;
		}
		while (i != 0 || j != 0)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  i = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  j = Integer.parseInt(tempVar3);
			  }
			  a[i] = a[i] + 1;
			  b[j] = b[j] + 1;
		}
		for (int k = 0;k < n;k++)
		{
				if (b[k] == n - 1 && a[k] == 0)
				{
				System.out.printf("%d\n",k);
				}
				ming = ming + 1;
		}
		if (ming == 0)
		{
				   System.out.print("NOT FOUND");
		}
	}
}

