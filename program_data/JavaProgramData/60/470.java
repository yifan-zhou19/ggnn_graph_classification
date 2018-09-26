package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int n;
		int n;
		int i;
		int[] a = new int[100000];
		int count = 0;
		int c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   if (n == 1 || n == 2 || n == 3 || n == 4)
	   {
		   System.out.print("empty");
	   }
		else
		{
			for (i = 3;i <= n;i++)
			{
			c = f(i);
		if (c != 0)
		{
			a[count] = i;
		count++;
		}
			}
		}
		for (i = 0;i < count;i++)
		{
			if (a[i + 1] - a[i] == 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
			}
		}
			return 0;
	}
	   public static int f(int n)
	   {
		   int i;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				return 0;
				break;
			}
		}
		 if (i >= n)
		 {
			 return 1;
		 }
	   }
}

