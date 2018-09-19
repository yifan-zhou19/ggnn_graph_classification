public class stu
{
	public String name = new String(new char[20]);
	public int[] sbu = new int[3];
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		int i;
		int j = 0;
		int j2 = 0;
		int j3 = 0;
		int min = 0;
		stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100000);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].sbu[0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].sbu[1] = Integer.parseInt(tempVar4);
			}
			stu[i].sbu[2] = stu[i].sbu[0] + stu[i].sbu[1];
		}

		for (i = 0;i < n;i++)
		{
			if (stu[i].sbu[2] > min)
			{
				min = stu[i].sbu[2];
			j = i;
			}
		}
			System.out.printf("%s %d\n",stu[j].name,min);
	min = 0;
	for (i = 0;i < n;i++)
	{
			if (stu[i].sbu[2] <= stu[j].sbu[2] != 0 && stu[i].sbu[2]> min && i != j)
			{
				min = stu[i].sbu[2];
			j2 = i;
			}
	}
			System.out.printf("%s %d\n",stu[j2].name,min);
	min = 0;
	for (i = 0;i < n;i++)
	{
			if (stu[i].sbu[2] <= stu[j2].sbu[2] != 0 && stu[i].sbu[2]> min && i != j & i != j2)
			{
				min = stu[i].sbu[2];
			j3 = i;
			}
	}
			System.out.printf("%s %d\n",stu[j3].name,min);
	}
}

