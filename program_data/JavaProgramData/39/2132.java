public class student
{
	public String name = new String(new char[20]);
 public int final_score;
 public int discussed_score;
 public char leader;
 public char west;
 public int article;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		int i;
		int n;
		int m;
		int t;
		int p;
		int[] a = new int[100];
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
				stu[i].final_score = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].discussed_score = Integer.parseInt(tempVar4);
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
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].article = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0,m = 0;i < n;i++)
		{
			t = 0;
			if (stu[i].final_score > 80 && stu[i].article >= 1)
			{
				t = 8000;
			}
			if (stu[i].final_score > 85 && stu[i].discussed_score > 80)
			{
				t = t + 4000;
			}
			if (stu[i].final_score > 90)
			{
				t = t + 2000;
			}
			if (stu[i].final_score > 85 && stu[i].west == 'Y')
			{
				t = t + 1000;
			}
			if (stu[i].discussed_score > 80 && stu[i].leader == 'Y')
			{
				t = t + 850;
			}
			a[i] = t;
			m = m + t;
		}
	  t = a[0];
	  p = 0;
	  for (i = 0;i < n;i++)
	  {
		  if (t < a[i])
		  {
			  t = a[i];
			  p = i;
		  }
	  }
	  System.out.printf("%s\n%d\n%d\n",stu[p].name,t,m);
	}




}

