public class student
{
	public int id;
	public int chinese;
	public int math;
}

package <missing>;

public class GlobalMembers
{
	public static student[] student = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] sum = new int[100000];
		int h1 = 0;
		int h2 = 0;
		int h3 = 0;
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
				student[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[i].math = Integer.parseInt(tempVar4);
			}
		}
		int first = 0;
		int sec = 0;
		int thi = 0;
		for (j = 0;j < n;j++)
		{
			if (first < student[j].chinese + student[j].math)
			{
				thi = sec;
				h3 = h2;
				sec = first;
				h2 = h1;
				first = student[j].chinese + student[j].math;
				h1 = student[j].id;
			}
			else if ((first > student[j].chinese + student[j].math) && (sec < student[j].chinese + student[j].math))
			{
				thi = sec;
				h3 = h2;
				sec = student[j].chinese + student[j].math;
				h2 = student[j].id;
			}
			else if ((sec > student[j].chinese + student[j].math) && (thi < student[j].chinese + student[j].math))
			{
				thi = student[j].chinese + student[j].math;
				h3 = student[j].id;
			}
			else if ((first == student[j].chinese + student[j].math) && (sec < student[j].chinese + student[j].math))
			{
				thi = sec;
				h3 = h2;
				sec = student[j].chinese + student[j].math;
				h2 = student[j].id;
			}
			else if ((sec == student[j].chinese + student[j].math) && (thi < student[j].chinese + student[j].math))
			{
				thi = student[j].chinese + student[j].math;
				h3 = student[j].id;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",h1,first,h2,sec,h3,thi);
	}


}

