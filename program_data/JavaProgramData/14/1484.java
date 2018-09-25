public class Student
{
	public int num;
	public int chinese;
	public int math;
}

package <missing>;

public class GlobalMembers
{
	public static Student[] sdu = tangible.Arrays.initializeWithDefaultStudentInstances(99999);

	public static int Main()
	{
		int N;
		int i;
		int j;
		int s;
		int t;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sdu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sdu[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sdu[i].math = Integer.parseInt(tempVar4);
			}
		}

		for (j = 0;j < 3;j++)
		{
			for (i = 0;i < N - j - 1;i++)
			{
				if ((sdu[i].chinese + sdu[i].math) >= (sdu[i + 1].chinese + sdu[i + 1].math))
				{
					s = sdu[i].num;
					t = sdu[i].chinese;
					m = sdu[i].math;
					sdu[i].num = sdu[i + 1].num;
					sdu[i].chinese = sdu[i + 1].chinese;
					sdu[i].math = sdu[i + 1].math;
					sdu[i + 1].num = s;
					sdu[i + 1].chinese = t;
					sdu[i + 1].math = m;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%d %d\n",sdu[N - 1 - i].num,sdu[N - 1 - i].chinese + sdu[N - 1 - i].math);
		}
	}
}

