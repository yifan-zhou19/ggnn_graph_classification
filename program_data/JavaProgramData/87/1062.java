package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int d;
		  int e;
		  int f;
		  int sum;
		  int second;
		  int h;
		  int m;
		  int s;
		  sum = 1;

		  while (sum != 0)
		  {
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 a = Integer.parseInt(tempVar);
				 }
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 b = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 c = Integer.parseInt(tempVar3);
				 }
				 String tempVar4 = ConsoleInput.scanfRead();
				 if (tempVar4 != null)
				 {
					 d = Integer.parseInt(tempVar4);
				 }
				 String tempVar5 = ConsoleInput.scanfRead();
				 if (tempVar5 != null)
				 {
					 e = Integer.parseInt(tempVar5);
				 }
				 String tempVar6 = ConsoleInput.scanfRead();
				 if (tempVar6 != null)
				 {
					 f = Integer.parseInt(tempVar6);
				 }
				 sum = a + b + c + d + e + f;

				 if (f < c)
				 {
					 e = e-1;
					 s = f + 60 - c;
				 }
				 else
				 {
				 s = f - c;
				 }

				 if (e < b)
				 {
					 d = d - 1;
					 m = e+60 - b;
				 }
				 else
				 {
				 m = e - b;
				 }

				 h = d + 12 - a;

				 second = h * 3600 + m * 60 + s;

				 if (sum != 0)
				 {
				 System.out.printf("%d\n",second);
				 }
		  }

	}

}

