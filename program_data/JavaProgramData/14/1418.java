public class stu
{
		public int num;
		public int yuwen;
		public int shuxue;
		public int sum;
}

package <missing>;

public class GlobalMembers
{
		public static stu[] score = tangible.Arrays.initializeWithDefaultstuInstances(100000);
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int a1;
		int b1;
		int c1;
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
				score[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				score[i].shuxue = Integer.parseInt(tempVar4);
			}
			score[i].sum = score[i].shuxue + score[i].yuwen;
		}
		a = 0;
		b = 0;
		c = 0;
		a1 = 0;
		b1 = 0;
		c1 = 0;
		for (i = 0;i < n;i++)
		{
			if (score[i].sum > a)
			{
				c = b;
				b = a;
				a = score[i].sum;
				c1 = b1;
				b1 = a1;
				a1 = score[i].num;
			}
			else if (score[i].sum > b)
			{
				c = b;
				b = score[i].sum;
				c1 = b1;
				b1 = score[i].num;
			}
			else if (score[i].sum > c)
			{
				c = score[i].sum;
				c1 = score[i].num;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",a1,a,b1,b,c1,c);
		return 0;
	}
}

