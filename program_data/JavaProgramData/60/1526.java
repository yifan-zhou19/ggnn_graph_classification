package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int k;
		int i;
		int m;
		int n;
		int[] s = new int[30000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 2;i <= n;i++)
		{
			k = 0;
		for (j = 2;j < i;j++)
		{
		if (i % j == 0)
		{
				  k = 1;
				  break;
		}
		}
	  if (k == 0)
	  {
		  s[i] = 1;
	  }
		}
	  k = 0;
	 for (i = 1;i <= n;i++)
	 {
		 if ((s[i] == 1) && (s[i + 2] == 1))
		 {
		 k = 1;
		 System.out.printf("%d %d\n",i,i + 2);
		 }
	 }
		 if (k == 0)
		 {
			 System.out.print("empty");
		 }

	return 0;
	}

}

