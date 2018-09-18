package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int m = 0;
		int nn = n;
		for (int i = 1;i < 5;i++)
		{
		   n = n / 10;
		   if (n == 0)
		   {
			 m = i;
			 break;
		   }
		}
		int a;
		for (int i = 0;i < m;i++)
		{
		   a = nn % 10;
		   System.out.printf("%d",a);
		   nn = nn / 10;
		}
		System.in.read();
		System.in.read();
	}

}

