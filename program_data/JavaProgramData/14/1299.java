public class student
{
	public String id = new String(new char[10]);
	public int ch;
	public int ma;
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int max;
		int sec;
		int min;
		int[] total = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].ch = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].ma = Integer.parseInt(tempVar4);
			}
			total[i] = stu[i].ch + stu[i].ma;
		}

		max = 0;

		for (i = 0;i < n;i++)
		{
			if (total[i] > total[max])
			{
				max = i;
			}
		}

		System.out.printf("%s %d\n",stu[max].id, total[max]);

		for (i = 0;i < n;i++)
		{
			if (total[i] == total[max])
			{
				total[i] = 0;
				break;
			}
		}

		sec = 0;
		for (i = 0;i < n;i++)
		{
			if (total[i] > total[sec])
			{
				sec = i;
			}
		}

		System.out.printf("%s %d\n", stu[sec].id, total[sec]);

		for (i = 0;i < n;i++)
		{
			if (total[i] == total[sec])
			{
				total[i] = 0;
				break;
			}
		}


		min = 0;
		for (i = 0;i < n;i++)
		{
			if (total[i] > total[min])
			{
				min = i;
			}
		}

		System.out.printf("%s %d\n", stu[min].id, total[min]);
	}


}

