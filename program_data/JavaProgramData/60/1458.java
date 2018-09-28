package <missing>;

public class GlobalMembers
{
	public static int f(int i)
	{
		if (i < 3)
		{
		return 0;
		}
		if (i >= 3)
		{
			int j;
		for (j = 2;j < i;j++)
		{
						if (i % j == 0)
						{
							return 0;
						break;
						}
		}
		 if (j == i)
		 {
		 return 1;
		 }
		}
	}
			 public static int Main()
			 {
		  int n;
		  int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
		if (n >= 5)
		{
			for (k = 3;k < n - 1;k++)
			{
			   if (f(k) == 1 && f(k + 2) == 1)
			   {
		   System.out.printf("%d %d\n",k,k + 2);
			   }
			}
		}
		  return 0;

			 }

}

