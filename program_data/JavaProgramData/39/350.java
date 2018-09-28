public class student
{
	public String name = new String(new char[20]);
public int test;
public int judge;
public char leader;
public char west;
public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

	public static void Main()
	{
		int m = 0;
		int n;
		int i;
	int sum;
	int t = 0;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			stu[i].test = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			stu[i].judge = Integer.parseInt(tempVar4);
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
	for (sum = 0,i = 0;i < n;i++)
	{
		 if (stu[i].test > 80 && stu[i].paper > 0)
		 {
			 a[i] = a[i] + 8000;
		 }
	  if (stu[i].test > 85 && stu[i].judge > 80)
	  {
		  a[i] = a[i] + 4000;
	  }
	  if (stu[i].test > 90)
	  {
		  a[i] = a[i] + 2000;
	  }
	  if (stu[i].test > 85 && (stu[i].west == 'Y'))
	  {
		  a[i] = a[i] + 1000;
	  }
	  if (stu[i].judge > 80 && (stu[i].leader == 'Y'))
	  {
		  a[i] = a[i] + 850;
	  }
	 sum = sum + a[i];
	 if (a[i] > t)
	 {
		 t = a[i];
		 m = i;
	 }
	}
	System.out.printf("%s\n",stu[m].name);
	System.out.printf("%ld\n",t);
	System.out.printf("%ld\n",sum);
	}
}

