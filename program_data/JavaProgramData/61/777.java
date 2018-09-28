package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int j;
		int[] c = new int[22];
		int[] b = new int[22];
		 c[1] = 1;
		c[2] = 1;
		for (i = 3;i < 22;i++)
		{
		  c[i] = c[i - 1] + c[i - 2];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  b[j] = Integer.parseInt(tempVar2);
			  }
			  System.out.printf("%d\n",c[b[j]]);
		}

	}


}

