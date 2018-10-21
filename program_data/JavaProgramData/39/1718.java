public class fuckme
{
	public String name = new String(new char[20]);
	public int final;
	public int judge;
	public char leader;
	public char west;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static fuckme[] student = tangible.Arrays.initializeWithDefaultfuckmeInstances(101);

	public static int Main()
	{
		int max = new int(int total[101], int n);
		int n;
		int k;
		int N = 0;
		int i;
		int[] yuanshi = new int[101];
		int[] wusi = new int[101];
		int[] youxiu = new int[101];
		int[] xibu = new int[101];
		int[] gongxian = new int[101];
		int[] total = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[i].final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[i].judge = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				student[i].leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				student[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				student[i].paper = Integer.parseInt(tempVar7);
			}
			if (student[i].final > 80 && student[i].paper > 0)
			{
				yuanshi[i] = 8000;
			}
			if (student[i].final > 85 && student[i].judge > 80)
			{
				wusi[i] = 4000;
			}
			if (student[i].final > 90)
			{
				youxiu[i] = 2000;
			}
			if (student[i].final > 85 && student[i].west == 'Y')
			{
				xibu[i] = 1000;
			}
			if (student[i].judge > 80 && student[i].leader == 'Y')
			{
				gongxian[i] = 850;
			}
			total[i] = yuanshi[i] + wusi[i] + youxiu[i] + xibu[i] + gongxian[i];
			N += total[i];
		}
		k = max(total, n);
		System.out.printf("%s\n%d\n%d\n",student[k].name,total[k],N);
		return 0;
	}

	public static int max(int[] total, int n)
	{
		int a = 0;
		int j = 0;
		int k = 0;
		for (j = 0;j < n;j++)
		{
			if (total[j] > a)
			{
				a = total[j];
				k = j;
			}
		}
		return k;
	}

}

