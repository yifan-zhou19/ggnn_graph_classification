package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
			if (n == 1)
			{
				System.out.print("End\n");
				break;
			}
			else
			{
			   if (n % 2 == 0)
			   {
				   System.out.printf("%d/2=%d\n",n,n / 2);
				   n = n / 2;
			   }
			   else
			   {
				   System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
				   n = n * 3 + 1;
			   }
			}
		}



	}
}

