package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int[] m = new int[6];
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int n;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

		   m[0] = (n - n % 100) / 100;
		   a = n - m[0] * 100;
		   m[1] = (a - a % 50) / 50;
		   b = a - m[1] * 50;
		   m[2] = (b - b % 20) / 20;
		   c = b - m[2] * 20;
		   m[3] = (c - c % 10) / 10;
		   d = c - m[3] * 10;
		   m[4] = (d - d % 5) / 5;
		   e = d - m[4] * 5;
		   m[5] = e;
		   for (i = 0;i < 5;i++)
		   {
		   System.out.printf("%d\n",m[i]);
		   }
		   System.out.printf("%d",m[5]);
	}

}

