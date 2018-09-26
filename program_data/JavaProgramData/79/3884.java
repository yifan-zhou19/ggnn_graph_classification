package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
	 while (true)
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 b = Integer.parseInt(tempVar2);
		 }
		 if (a == 0 && b == 0)
		 {
			 break;
		 }

		 int[] f = new int[301];
		 int n;

		 n = a;

		 for (j = 1;j <= n;j++)

		 {
			 f[j] = (f[j - 1] + b) % j;
		 if (f[j] == 0)
		 {
		  f[j] = j;
		 }
		 }
	 System.out.printf("%d\n",f[n]);
	 }
	}
}

