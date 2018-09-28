package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t1;
		int t2;
		int t3;
		int t4;
		int t5;
		int all;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct reward
	//	{
	//		char name[20];
	//	 int score;
	//	 int comment;
	//	 char boss[2];
	//	 char west[2];
	//	 int paper;
	//	 int sum;
	//	};
		reward[] a = tangible.Arrays.initializeWithDefaultrewardInstances(2);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0].name = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0].score = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[0].comment = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			a[0].boss = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			a[0].west = tempVar6;
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			a[0].paper = tempVar7;
		}
		if (a[0].score > 80 && a[0].paper > 0)
		{
			t1 = 1;
		}
		else
		{
			t1 = 0;
		}
		if (a[0].score > 85 && a[0].comment > 80)
		{
			t2 = 1;
		}
		else
		{
			t2 = 0;
		}
		if (a[0].score > 90)
		{
			t3 = 1;
		}
		else
		{
			t3 = 0;
		}
		if (a[0].score > 85 && strcmp(a[0].west,"Y") == 0)
		{
			t4 = 1;
		}
		else
		{
			t4 = 0;
		}
		if (a[0].comment > 80 && strcmp(a[0].boss,"Y") == 0)
		{
			t5 = 1;
		}
		else
		{
			t5 = 0;
		}
		a[0].sum = 8000 * t1 + 4000 * t2 + 2000 * t3 + 1000 * t4 + 850 * t5;
		for (i = 1,all = a[0].sum;i < n;i++)
		{
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				a[1].name = tempVar8;
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				a[1].score = tempVar9;
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				a[1].comment = tempVar10;
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				a[1].boss = tempVar11;
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				a[1].west = tempVar12;
			}
			String tempVar13 = ConsoleInput.scanfRead();
			if (tempVar13 != null)
			{
				a[1].paper = tempVar13;
			}
			if (a[1].score > 80 && a[1].paper > 0)
			{
				t1 = 1;
			}
			else
			{
				t1 = 0;
			}
			if (a[1].score > 85 && a[1].comment > 80)
			{
				t2 = 1;
			}
			 else
			 {
				 t2 = 0;
			 }
			if (a[1].score > 90)
			{
				t3 = 1;
			}
			else
			{
				t3 = 0;
			}
			if (a[1].score > 85 && strcmp(a[1].west,"Y") == 0)
			{
				t4 = 1;
			}
			else
			{
				t4 = 0;
			}
			if (a[1].comment > 80 && strcmp(a[1].boss,"Y") == 0)
			{
				t5 = 1;
			}
			 else
			 {
				 t5 = 0;
			 }
			a[1].sum = 8000 * t1 + 4000 * t2 + 2000 * t3 + 1000 * t4 + 850 * t5;
			all = all + a[1].sum;
			if (a[1].sum > a[0].sum)
			{
				a[0].name = a[1].name;
				a[0].sum = a[1].sum;
			}
		}
		System.out.printf("%s\n%d\n%d",a[0].name,a[0].sum,all);
	}
}

