package <missing>;

public class GlobalMembers
{
	public static int fan(int x)
	{
		int a = 0;
		int b;
		int i;
		int[] f = new int[100];
		if (x == 0)
		{
		return (x);
		}
		else
		{
			for (i = 0;i < 100;i++)
			{
							  f[i] = x % 10;
							  x = x / 10;
							  a++;
							  if (x == 0)
							  {
							  break;
							  }
			}
		}
		for (i = 0;i < a;i++)
		{
						x = x * 10 + f[i];
		}
		return (x);
	}
	public static int Main()
	{
		 int c;
		 int d;
		 int j;
		 int[] g = new int[6];
		 for (j = 0;j < 6;j++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 g[j] = Integer.parseInt(tempVar);
			 }
		 }
		 for (j = 0;j < 6;j++)
		 {
			 c = g[j];
		 if (c < 0)
		 {
				 c = c * (-1);
				 d = fan(c);
				 System.out.printf("-%d\n",d);
		 }
		 else
		 {
			  d = fan(c);
			  System.out.printf("%d\n",d);
		 }
		 }
		 System.in.read();
		 System.in.read();
	}


}

