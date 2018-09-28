public class stu
{
	public String name = new String(new char[20]);
	public int final;
	public int assess;
	public char leader;
	public char west;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
		int[] total = new int[100];
		int tota = 0;
		int max = 0;
	stu[] ppl = tangible.Arrays.initializeWithDefaultstuInstances(100);
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
			ppl[i].name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			ppl[i].final = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			ppl[i].assess = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			ppl[i].leader = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			ppl[i].west = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			ppl[i].paper = Integer.parseInt(tempVar7);
		}
	}

	for (i = 0;i < n;i++)
	{
		total[i] = 8000 * (ppl[i].final > 80 && ppl[i].paper >= 1) + 4000 * (ppl[i].final > 85 && ppl[i].assess > 80) + 2000 * (ppl[i].final > 90) + 1000 * (ppl[i].final > 85 && ppl[i].west == 'Y') + 850 * (ppl[i].assess > 80 && ppl[i].leader == 'Y');

	tota = tota + total[i];

	if (total[i] > max)
	{
		max = total[i];
		k = i;
	}
	}

	System.out.printf("%s\n%d\n%d\n",ppl[k].name,max,tota);

	}


}

