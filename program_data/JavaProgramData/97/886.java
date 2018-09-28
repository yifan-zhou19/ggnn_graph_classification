package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 int n;
	 int a;
	 int b;
	 int c;
	 int d;
	 int e;
	 int i;
	 int zong;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i <= 1000;i++)
	 {
		if (100 * i <= n != 0 && 100 * (i + 1)> n)
		{
		a = i;
		}
	 }
	 for (i = 0;i <= 1000;i++)
	 {
		if (50 * i <= (n - 100 * a) && 50 * (i + 1)>(n - 100 * a))
		{
			 b = i;
		 zong = n - 100 * a - 50 * b;
		}
	 }
	 for (i = 0;i <= 1000;i++)
	 {
		 if (20 * i <= zong != 0 && 20 * (i + 1)> zong)
		 {
			  c = i;
		   zong = n - 100 * a - 50 * b - 20 * c;
		 }
	 }
	  for (i = 0;i <= 1000;i++)
	  {
		 if (10 * i <= zong != 0 && 10 * (i + 1)> zong)
		 {
			 d = i;
		   zong = n - 100 * a - 50 * b - 20 * c - 10 * d;
		 }
	  }
		for (i = 0;i <= 1000;i++)
		{
		 if (5 * i <= zong != 0 && 5 * (i + 1)> zong)
		 {
			 e = i;
		   zong = n - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e;
		 }
		}
	 System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,zong);
	 return 0;
	 }




}

