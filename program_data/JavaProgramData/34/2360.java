package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			do
			{
				if (n % 2 == 0)
				{
					a = n;
					n = a / 2;
					System.out.printf("%d/2=%d\n",a,n);
				}
				else
				{
					a = n;
					n = a * 3 + 1;
					   System.out.printf("%d*3+1=%d\n",a,n);


				}




			} while (n != 1);


			System.out.print("End");
		}
	}

}

