package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		 int i;
		 int a;
		 int b;
		 int c;
		 int d;
		 int e;
		 for (i = 0;n - 100 >= 0;i++)
		 {
			 n = n - 100;
		 }

		 for (a = 0;n - 50 >= 0;a++)
		 {
			 n = n - 50;
		 }

		 for (b = 0;n - 20 >= 0;b++)
		 {
			 n = n - 20;
		 }
		 for (c = 0;n - 10 >= 0;c++)
		 {
			 n = n - 10;
		 }
		 for (d = 0;n - 5 >= 0;d++)
		 {
			 n = n - 5;
		 }
		 for (e = 0;n - 1 >= 00;e++)
		 {
			 n = n - 1;
		 }
		 System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",i,a,b,c,d,e);
		 return 0;
	}

}

