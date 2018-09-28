package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int k;
		int l;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 2;
		k = 2;
		if (n >= 5)
		{
		   for (l = 3;l <= n;l++)
		   {
			  for (i = 2;i < l;i++)
			  {
				 if (l % i == 0)
				 {
				   break;
				 }
			  }
			  if (i == l)
			  {
				 j = k;
				 k = l;
				 if (k - j == 2)
				 {
					System.out.printf("%d %d\n",j,k);
				 }
			  }
		   }
		}
		else
		{
		System.out.print("empty");
		}
		return 0;
	}

}

