package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty\n");
		}
		else
		{
		  for (i = 3;i < n - 1;i++)
		  {
			 a = (int)Math.sqrt(i);
			 for (j = 2;j <= a;j++)
			 {
				if (i % j == 0)
				{
					break;
				}
			 }
			 if (j == a + 1)
			 {
					  a = (int)Math.sqrt(i + 2);
					   for (j = 2;j <= a;j++)
					   {
						  if ((i + 2) % j == 0)
						  {
							  break;
						  }
					   }
						if (j == a + 1)
						{
							System.out.printf("%d %d\n",i,i + 2);
						}

			 }

		  }
		}
		 // getchar();
		 // getchar();
		  return 0;
	}

}

