public class people
{
	   public String name = new String(new char[30]);
	   public int qimo;
	   public int pingyi;
	   public char gan;
	   public char xi;
	   public int lunwen;
	   public int jiang;
}

package <missing>;

public class GlobalMembers
{
	public static people[] line = tangible.Arrays.initializeWithDefaultpeopleInstances(100);
	public static people temp = new people();
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int sum = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				line[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				line[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				line[i].pingyi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				line[i].gan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				line[i].xi = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				line[i].lunwen = Integer.parseInt(tempVar7);
			}
			line[i].jiang = 0;
			if (line[i].qimo > 80 && line[i].lunwen != 0)
			{
				line[i].jiang += 8000;
			}
			if (line[i].qimo > 85 && line[i].pingyi > 80)
			{
				line[i].jiang += 4000;
			}
			if (line[i].qimo > 90)
			{
				line[i].jiang += 2000;
			}
			if (line[i].qimo > 85 && (int)line[i].xi == (int)'Y')
			{
				line[i].jiang += 1000;
			}
			if (line[i].pingyi > 80 && (int)line[i].gan == (int)'Y')
			{
				line[i].jiang += 850;
			}
			sum += line[i].jiang;
		}
		for (i = 1;i < n;i++)
		{
			for (j = 1;j <= n - i;j++)
			{
				if (line[j].jiang < line[j + 1].jiang)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=line[j];
					temp.copyFrom(line[j]);
					line[j] = line[j + 1];
					line[j + 1] = temp;
				}
			}
		}
		System.out.printf("%s\n%d\n%d", line[1].name, line[1].jiang, sum);
		return 0;
	}

}

