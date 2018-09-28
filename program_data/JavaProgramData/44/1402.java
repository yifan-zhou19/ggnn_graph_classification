package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int bianxu = int x;
		 int x;
		 int t = 6;
		 int i = 0;
	for (i;i < t;i++)
	{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 x = Integer.parseInt(tempVar);
		 }
		 if (x > 0)
		 {
		 System.out.printf("%d\n",bianxu(x));
		 }
		 if (x < 0)
		 {
		 System.out.printf("-%d\n",bianxu((-x)));
		 }
		 if (x == 0)
		 {
		 System.out.print("0\n");
		 }
	}
	}
	public static int bianxu(int x)
	{
		int i;
		int r = 0;
		int m;
	char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	for (i = 0;x != 0;i++)
	{
		 a[i] = x % 10;
		 x = x / 10;
		 r++;
	}
	for (i = 0;i < r / 2;i++)
	{
			 m = a[i];
		 a[i] = a[r - 1 - i];
		 a[r - 1 - i] = m;
	}
		 m = 0;
		 for (i = r - 1;a[i] == 0;i--)
		 {
		 m++;
		 }

			  for (i = r - m - 1;i >= 0;i--)
			  {
			  x *= 10;
			  x += a[i];
			  }
			  return x;
	}

}

