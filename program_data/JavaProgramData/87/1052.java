package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[1000];
	 int[] b = new int[1000];
	 int[] c = new int[1000];
	 int[] d = new int[1000];
	 int[] e = new int[1000];
	 int[] f = new int[1000];
	 int[] h = new int[1000];
	 int i;
	 int m;
	 for (i = 0;i < 1000;i++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[i] = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b[i] = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 c[i] = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 d[i] = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 e[i] = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead();
	 if (tempVar6 != null)
	 {
		 f[i] = Integer.parseInt(tempVar6);
	 }
	 h[i] = (12 + d[i] - a[i]) * 60 * 60 + (e[i] - b[i]) * 60 + f[i] - c[i];
	 if (a[i] + b[i] + c[i] + d[i] + e[i] + f[i] == 0)
	 {
		 break;
	 }
	 }
	 for (m = 0;m < i;m++)
	 {
	 System.out.printf("%d\n",h[m]);
	 }
	 return 0;
	}

}

