public class stu
{
	public String name = new String(new char[20]);
 public int score1;
 public int score2;
 public char leader;
 public char west;
 public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int max = 0;
		int sum = 0;
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].score2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].score1 > 80 && stu[i].paper > 0)
			{
				a[i] += 8000;
			}
			if (stu[i].score1 > 85 && stu[i].score2 > 80)
			{
				a[i] += 4000;
			}
			if (stu[i].score1 > 90)
			{
				a[i] += 2000;
			}
			if (stu[i].score1 > 85 && stu[i].west == 'Y')
			{
				a[i] += 1000;
			}
			if (stu[i].score2 > 80 && stu[i].leader == 'Y')
			{
				a[i] += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
		  max = (max >= a[i])?max:a[i];
		  sum += a[i];
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == max)
			{
				System.out.printf("%s\n%d\n",stu[i].name,a[i]);
			  break;
			}
		}
		System.out.printf("%d",sum);
	}
}

