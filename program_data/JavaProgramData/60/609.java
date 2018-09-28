package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i = i + 2)
		{
		 for (j = 2;j <= (int)Math.sqrt(i);j++)
		 {
		  if (i % j == 0)
		  {
			  break;
		  }
		 }
		 if (j == ((int)Math.sqrt(i) + 1))
		 {
			 b = 1;
		 }
		 if ((b == 1) && (c == 1))
		 {
			System.out.printf("%d %d\n",i - 2,i);
			k++;
		 }
		  c = b;
		  b = 0;
		}
		if (k == 0)
		{
			System.out.print("empty");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

