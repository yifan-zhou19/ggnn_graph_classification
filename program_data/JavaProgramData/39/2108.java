public class student
{
  public String name = new String(new char[20]);
  public int qimo;
  public int banji;
  public char ganbu;
  public char xisheng;
  public int lunwen;
}

package <missing>;

public class GlobalMembers
{
	 public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(300);
	public static int Main()
	{
	int n;
	int m;
	int i;
	int sum = 0;
	int[] money = new int[300];
	String a = new String(new char[20]);
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
		  stu[i].qimo = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  stu[i].banji = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar5 != null)
	  {
		  stu[i].ganbu = tempVar5.charAt(0);
	  }
	  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar6 != null)
	  {
		  stu[i].xisheng = tempVar6.charAt(0);
	  }
	  String tempVar7 = ConsoleInput.scanfRead(" ");
	  if (tempVar7 != null)
	  {
		  stu[i].lunwen = Integer.parseInt(tempVar7);
	  }
	}
	for (i = 0;i < n;i++)
	{
			money[i] = 0;
		if (stu[i].qimo > 80 && stu[i].lunwen > 0)
		{
			money[i] = money[i] + 8000;
		}
		if (stu[i].qimo > 85 && stu[i].banji > 80)
		{
			money[i] = money[i] + 4000;
		}
		if (stu[i].qimo > 90)
		{
			money[i] = money[i] + 2000;
		}
		if (stu[i].qimo > 85 && stu[i].xisheng == 'Y')
		{
			money[i] = money[i] + 1000;
		}
		if (stu[i].banji > 80 && stu[i].ganbu == 'Y')
		{
			money[i] = money[i] + 850;
		}
			sum = sum + money[i];
	}

	a = stu[0].name;
	m = money[0];
	for (i = 1;i < n;i++)
	{
		if (money[i] > m)
		{
			m = money[i];
			a = stu[i].name;
		}
	}
	System.out.printf("%s\n%d\n%d\n",a,m,sum);

	return 0;
	}


}

