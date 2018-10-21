package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int d = 1;
		int n;
		int j;
		int i;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[65535];
		for (j = 3;j <= n;j++)
		{
		 for (i = 1,c = 0;i <= j;i++)
		 {
			if (j % i == 0)
			{
			c = c + 1;
			}
		 }
		 if (c == 2)
		 {
			a[d] = j;
			d = d + 1;
		 }
		}
		if (n <= 4)
		{
		System.out.print("empty");
		}
		else
		{
			 for (i = 1;i <= n;i++)
			 {
			   if (a[i + 1] - a[i] == 2)
			   {
			   System.out.printf("%d %d\n",a[i],a[i + 1]);
			   }
			 }
		}
		 System.in.read();
		 System.in.read();
	}

}

