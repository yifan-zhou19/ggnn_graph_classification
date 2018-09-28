package <missing>;

public class GlobalMembers
{
	public static int mustput(int m,int n)
	{
		int put = new int(int m,int n);
		int c;
		int d = m - n;
		if (n == 1)
		{
				c = 1;
		}
		else
		{
			c = put(d, n);
		}
		return c;
	}
	public static int min(int m,int n)
	{
		if (m >= n)
		{
			return n;
		}
		else
		{
			return m;
		}
	}
	public static int put(int m,int n)
	{

		int c = 0;
		int i;
		if (m == 0)
		{
			c = 1;
		}
		for (i = 1;i <= min(m, n);i++)
		{
			c = c + mustput(m, i);
		}
		return c;
	}
	public static int Main()
	{
		 int m;
		 int n;
		 int l;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 l = Integer.parseInt(tempVar);
		 }
		 for (int i = 1;i <= l;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 m = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 n = Integer.parseInt(tempVar3);
			 }
			 System.out.printf("%d\n",put(m, n));
		 }

	}
}

