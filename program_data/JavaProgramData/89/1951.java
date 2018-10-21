package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int a;
	 int b;
	 int n;
	 int flag = 0;
	 int[] c = new int[10100];
	 int[] d = new int[10100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 while (scanf("%d%d", a, b) == 2)
	 {
	   if (a == 0 && b == 0)
	   {
		 break;
	   }
	   c[b]++;
	   d[a]++;
	 }
	 for (i = 0;i <= n - 1;i++)
	 {
	 if (c[i] == n - 1 && d[i] == 0)
	 {
		System.out.printf("%d",i);
		flag = 1;
	 }
	 }
	 if (flag == 0)
	 {
	   System.out.print("NOT FOUND\n");
	 }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   return 0;
	}
}

