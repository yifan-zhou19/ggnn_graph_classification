package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int p;
		int q;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i = i + 2)
		{
			  for (p = 0,j = 2;j < i;j++)
			  {
			  if (i % j == 0)
			  {
			  break;
			  }
			  }
			  if (j == i)
			  {
			  p = 1;
			  }
			  for (q = 0,j = 2;j < i + 2;j++)
			  {
				 if ((i + 2) % j == 0)
				 {
				 break;
				 }
			  }
				 if (j == i + 2)
				 {
				 q = 1;
				 }
				 if (p == 1 && q == 1)
				 {
				 System.out.printf("%d %d\n",i,i + 2);
				 count++;
				 }
		}
						   if (count == 0)
						   {
						   System.out.print("empty");
						   }


						   return 0;
	}

}

