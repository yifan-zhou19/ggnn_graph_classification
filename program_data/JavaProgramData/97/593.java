package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int num;
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int f;
	   int[] sz = {100, 50, 20, 10, 5, 1};

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   num = Integer.parseInt(tempVar);
	   }
	   a = num / sz[0];
	   num = num - a * 100;
		   b = num / sz[1];
		   num = num - b * 50;
		   c = num / sz[2];
		   num = num - c * 20;
		   d = num / sz[3];
		   num = num - d * 10;
		   e = num / sz[4];
		   num = num - e * 5;
		   f = num;
		   System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
		return 0;
	}
}

