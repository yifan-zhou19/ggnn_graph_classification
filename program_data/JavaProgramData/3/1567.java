package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1020];
		int i = 1;
		int j = 1;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
		}
		for (i = 1;i <= n;i++)
		{
		  for (j = i + 1;j <= n;j++)
		  {
			if (a[i] + a[j] == k)
			{
			  h = h + 1;
			}
		  }
		}

	  if (h >= 1)
	  {
		System.out.print("yes\n");
	  }
	  else
	  {
		 System.out.print("no\n");
	  }
		 System.in.read();
		 System.in.read();

		return 0;
	}

}

