public class scholarship
{
	public String name = new String(new char[21]);
	public int test;
	public int judge;
	public char job;
	public char west;
	public int paper;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int k = 0;
		int n = 0;
		int total = 0;
		scholarship[] data = tangible.Arrays.initializeWithDefaultscholarshipInstances(100);
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
				data[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				data[i].test = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				data[i].judge = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				data[i].job = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				data[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				data[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			data[i].sum = 0;
			if ((data[i].test > 80) && (data[i].paper >= 1))
			{
				data[i].sum = data[i].sum + 8000;
				total = total + 8000;
			}
			if ((data[i].test > 85) && (data[i].judge > 80))
			{
				data[i].sum = data[i].sum + 4000;
				total = total + 4000;
			}
			if (data[i].test > 90)
			{
				data[i].sum = data[i].sum + 2000;
				total = total + 2000;
			}
			if ((data[i].test > 85) && (data[i].west == 'Y'))
			{
				data[i].sum = data[i].sum + 1000;
				total = total + 1000;
			}
			if ((data[i].judge > 80) && (data[i].job == 'Y'))
			{
				data[i].sum = data[i].sum + 850;
				total = total + 850;
			}
		}
		for (i = 1,k = 0;i < n;i++)
		{
			if (data[k].sum < data[i].sum)
			{
				k = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",data[k].name,data[k].sum,total);
		return 0;
	}

}

