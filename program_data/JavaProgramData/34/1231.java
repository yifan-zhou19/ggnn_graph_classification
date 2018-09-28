package <missing>;

public class GlobalMembers
{
	/*
	Name:???
	ID:1200012842
	Email:443972553@qq.com
	*/
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 1)
		{
			  if (n % 2 != 0)
			  {
				 System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
				 n = n * 3 + 1;
			  }
			  else
			  {
				  System.out.printf("%d/2=%d\n",n,n / 2);
				  n = n / 2;
			  }
		}
		System.out.print("End");
		return 0;
	}

}

