package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[22];
	//		int qm;
	//		int bj;
	//		char gb;
	//		char xb;
	//		int lw;
	//		int jxj;
	//	};
		stu[] s = tangible.Arrays.initializeWithDefaultstuInstances(100);
		int i;
		int n;
		int max;
		int total;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(s,0,sizeof(s));
		max = 0;
		total = 0;
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
				(s + i).name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(s + i).qm = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(s + i).bj = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				(s + i).gb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				(s + i).xb = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				(s + i).lw = tempVar7;
			}
			if ((s + i).qm > 80 && (s + i).lw)
			{
				(s + i).jxj += 8000;
			}
			if ((s + i).qm > 85 && (s + i).bj > 80)
			{
				(s + i).jxj += 4000;
			}
			if ((s + i).qm > 90)
			{
				(s + i).jxj += 2000;
			}
			if ((s + i).qm > 85 && (s + i).xb == 'Y')
			{
				(s + i).jxj += 1000;
			}
			if ((s + i).bj > 80 && (s + i).gb == 'Y')
			{
				(s + i).jxj += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max < (s + i).jxj)
			{
				max = (s + i).jxj;
			}
			total += (s + i).jxj;
		}
		for (i = 0;i < n;i++)
		{
			if (max == (s + i).jxj)
			{
				System.out.printf("%s\n",(s + i).name);
				break;
			}
		}
		System.out.printf("%d\n%d\n",max,total);
	}

}

