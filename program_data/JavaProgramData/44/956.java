package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = int x;
		int[] m = new int[6];
		int i;
		int out;
		for (i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m[i] = Integer.parseInt(tempVar);
		}
		out = f(m[i]);
		System.out.printf("%d\n",out);
		}
	}
	public static int f(int x)
	{
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int z;
	   a = x / 10000;
	   b = (x - 10000 * a) / 1000;
	   c = (x - 10000 * a - 1000 * b) / 100;
	   d = (x - 10000 * a - 1000 * b - 100 * c) / 10;
	   e = x - 10000 * a - 1000 * b - 100 * c - 10 * d;
	   if (a != 0)
	   {
	   z = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
	   }
	   else if (a == 0 && b != 0)
	   {
	   z = e * 1000 + d * 100 + c * 10 + b;
	   }
	   else if (a == 0 && b == 0 && c != 0)
	   {
	   z = e * 100 + d * 10 + c;
	   }
	   else if (a == 0 && b == 0 && c == 0 && d != 0)
	   {
	   z = e * 10 + d;
	   }
	   else if (a == 0 && b == 0 && c == 0 && d == 0)
	   {
	   z = e;
	   }
	   return (z);
	}


}

