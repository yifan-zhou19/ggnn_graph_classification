public class info
{
	   public String name = new String(new char[20]);
	   public int qm;
	   public int py;
	   public char gb;
	   public char xb;
	   public int lw;
	   public int money;
}

package <missing>;

public class GlobalMembers
{
	public static info[] student = tangible.Arrays.initializeWithDefaultinfoInstances(120);

	public static int ysj(int a)
	{
		if (student[a].qm > 80 && student[a].lw >= 1)
		{
		   return 8000;
		}
		else
		{
		   return 0;
		}
	}
	public static int wsj(int a)
	{
		if (student[a].qm > 85 && student[a].py > 80)
		{
			return 4000;
		}
		else
		{
			return 0;
		}
	}
	public static int cjj(int a)
	{
		if (student[a].qm > 90)
		{
			return 2000;
		}
		else
		{
			return 0;
		}
	}
	public static int xbj(int a)
	{
		if (student[a].qm > 85 && student[a].xb == 'Y')
		{
			return 1000;
		}
		else
		{
			return 0;
		}
	}
	public static int bjj(int a)
	{
		if (student[a].py > 80 && student[a].gb == 'Y')
		{
			return 850;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int k;
		int max = 0;
		int sum = 0;
		char ch1;
		char ch2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 0)
		{
		for (int i = 0; i < n; i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar2 != null)
			 {
				 ch1 = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 student[i].name = tempVar3.charAt(0);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 student[i].qm = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead();
			 if (tempVar5 != null)
			 {
				 student[i].py = Integer.parseInt(tempVar5);
			 }
			 String tempVar6 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar6 != null)
			 {
				 ch1 = tempVar6.charAt(0);
			 }
			 String tempVar7 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar7 != null)
			 {
				 student[i].gb = tempVar7.charAt(0);
			 }
			 String tempVar8 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar8 != null)
			 {
				 ch2 = tempVar8.charAt(0);
			 }
			 String tempVar9 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar9 != null)
			 {
				 student[i].xb = tempVar9.charAt(0);
			 }
			 String tempVar10 = ConsoleInput.scanfRead();
			 if (tempVar10 != null)
			 {
				 student[i].lw = Integer.parseInt(tempVar10);
			 }
			 student[i].money = ysj(i) + wsj(i) + cjj(i) + xbj(i) + bjj(i);
			 sum += student[i].money;
			 if (student[i].money > max)
			 {
				 max = student[i].money;
				 k = i;
			 }

		}
		}
		System.out.printf("%s\n%d\n%d\n",student[k].name,max,sum);
		return 0;
	}
}

