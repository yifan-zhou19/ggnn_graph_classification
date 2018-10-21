public class student
{
	public int ID;
	public int ch;
	public int ma;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student[] re = tangible.Arrays.initializeWithDefaultstudentInstances(N);
		int n;
		int i = 0;
		int j = 0;
		int rec;
		int[] total = new int[N];
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
				re[i].ID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				re[i].ch = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				re[i].ma = Integer.parseInt(tempVar4);
			}
			total[i] = re[i].ch + re[i].ma;
		}

		int max = total[0];

		for (i = 0;i < n;i++)
		{
			if (max < total[i])
			{
				max = total[i];
				rec = i;
			}
			if (i == n - 1)
			{
				System.out.printf("%d %d\n",re[rec].ID,total[rec]);
				total[rec] = 0;
				i = 0;
				max = total[0];
				j++;
			}

			if (j == 3)
			{
				break;
			}
		}

	}

}

