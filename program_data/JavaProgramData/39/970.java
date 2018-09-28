public class student
{
		public String name = new String(new char[100]);
		public int qm;
		public int py;
		public char gb;
		public char xb;
		public int lw;
		public int jxj;
}

package <missing>;

public class GlobalMembers
{
	public static student[] cl = tangible.Arrays.initializeWithDefaultstudentInstances(200);
	public static int sum;
	public static int n;
	public static void wsj(int k)
	{
		 if (cl[k].qm > 85 && cl[k].py > 80)
		 {
		 cl[k].jxj += 4000;
		 sum += 4000;
		 }
		 yxj(k);
	}
	public static void yxj(int k)
	{
		 if (cl[k].qm > 90)
		 {
		 cl[k].jxj += 2000;
		 sum += 2000;
		 }
		 xbj(k);
	}
	public static void xbj(int k)
	{
		 if (cl[k].qm > 85 && cl[k].xb == 'Y')
		 {
		 cl[k].jxj += 1000;
		 sum += 1000;
		 }
		 gxj(k);
	}
	public static void gxj(int k)
	{
		 if (cl[k].py > 80 && cl[k].gb == 'Y')
		 {
		 cl[k].jxj += 850;
		 sum += 850;
		 }
	}
	public static void ysj(int k)
	{
		 if (cl[k].qm > 80 && cl[k].lw > 0)
		 {
		 cl[k].jxj += 8000;
		 sum += 8000;
		 }
		 wsj(k);
	}
	public static int Main()
	{
		int i;
		int max = 0;
		int maxn;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 cl[i].name = tempVar2.charAt(0);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 cl[i].qm = Integer.parseInt(tempVar3);
						 }
						 String tempVar4 = ConsoleInput.scanfRead(" ");
						 if (tempVar4 != null)
						 {
							 cl[i].py = Integer.parseInt(tempVar4);
						 }
						 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
						 if (tempVar5 != null)
						 {
							 cl[i].gb = tempVar5.charAt(0);
						 }
						 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
						 if (tempVar6 != null)
						 {
							 cl[i].xb = tempVar6.charAt(0);
						 }
						 String tempVar7 = ConsoleInput.scanfRead(" ");
						 if (tempVar7 != null)
						 {
							 cl[i].lw = Integer.parseInt(tempVar7);
						 }
			ysj(i);
			if (cl[i].jxj > max)
			{
							 max = cl[i].jxj;
							 maxn = i;
			}
		}
		System.out.printf("%s\n%d\n%d",cl[maxn].name,cl[maxn].jxj,sum);

		return 0;
	}

}

