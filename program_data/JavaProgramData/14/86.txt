public class stu
{
	public int num;
 public int score1;
 public int score2;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100000);
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[100000];
		int max;
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
				stu[i].num = Integer.parseInt(tempVar2);
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
			a[i] = stu[i].score1 + stu[i].score2;
		}
		for (j = 0;j < 3;j++)
		{
		 max = 0;
		 for (i = 0;i < n;i++)
		 {
			 max = (max >= a[i])?max:a[i];
		 }
		 for (i = 0;i < n;i++)
		 {
			if (a[i] == max)
			{
				System.out.printf("%d %d\n",stu[i].num,a[i]);
			 a[i] = 0;
			   break;
			}
		 }
		}
	}
}

