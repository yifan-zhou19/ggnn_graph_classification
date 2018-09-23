package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[100000];
		int j;
		int[] grade1 = new int[100000];
		int[] grade2 = new int[100000];
		int[] grade = new int[100000];
		int t1;
		int t2;
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
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				grade1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				grade2[i] = Integer.parseInt(tempVar4);
			}
			grade[i] = grade1[i] + grade2[i];
		}
		for (j = 1;j < 4;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (grade[i] >= grade[i + 1])
				{
					t1 = grade[i];
					grade[i] = grade[i + 1];
					grade[i + 1] = t1;
					t2 = num[i];
					num[i] = num[i + 1];
					num[i + 1] = t2;
				}
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",num[n - 1],grade[n - 1],num[n - 2],grade[n - 2],num[n - 3],grade[n - 3]);
	}
}

