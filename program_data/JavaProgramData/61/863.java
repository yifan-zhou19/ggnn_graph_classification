package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int n;
		int n;
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int s;

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			s = f(a);
			System.out.printf("%d\n",s);
		}
		 System.in.read();
		 System.in.read();
	}
	public static int f(int n)
	{
		int z;
		if (n == 1 || n == 2)
		{
		  z = 1;
		}
		 else
		 {
		 z = f(n - 1) + f(n - 2);
		 }
		 return (z);
	}

}

