package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
	  int x;
	  int y = 0;
	  if (n >= 0)
	  {
				while (n != 0)
				{
				  x = n % 10; //?????
				  y = y * 10 + x; //??
				  n = n / 10;
				}
			   return y;
	  }
		 else
		 {
			 n = -n;
			 while (n != 0)
			 {
				 x = n % 10; //?????
				 y = y * 10 + x; //??
				 n = n / 10;
			 }
			 return -y;
		 }

	}
	  public static int Main()
	  {
		int[] a = new int[6];
		for (int i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (int i = 0;i < 6;i++)
		{
		System.out.printf("%d\n",f(a[i]));
		}

		System.in.read();
		System.in.read();
	  }
}

