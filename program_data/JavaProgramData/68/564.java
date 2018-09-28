package <missing>;

public class GlobalMembers
{
	public static int num(int n)
	{
		 int i;
		 int b;
		 int a;
		 for (i = 3;i <= Math.sqrt(n);i = i + 2)
		 {
			 b = n % i;
			 if (b == 0)
			 {
			   a = 0;
			   return (a);
			 }
		 }
		 a = 1;
		 return (a);
	}
	public static void Main()
	{
		int a;
		int i;
		int j;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= a;i = i + 2)
		{
			for (j = 3;j <= (i / 2);j = j + 2)
			{
				c = num(j);
				d = num(i - j);
				if ((c == 1) && (d == 1))
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
	}


}

