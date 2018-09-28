public class student
{
	public String name = new String(new char[20]);
public int score1;
public int score2;
public char ganbu;
public char xibu;
public int num;
}

package <missing>;

public class GlobalMembers
{
	public static student[] student = tangible.Arrays.initializeWithDefaultstudentInstances(100);

	public static int Main()
	{

	int[] a = new int[100];
	int n;
	int i;
	int s;
	int sum = 0;
	int total = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}


	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		student[i].name = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		student[i].score1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		student[i].score2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		student[i].ganbu = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		student[i].xibu = tempVar6.charAt(0);
	}
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		student[i].num = Integer.parseInt(tempVar7);
	}
	}

	for (i = 1;i <= n;i++)
	{
		sum = 0;
	if (student[i].score1 > 80 && student[i].num > 0)
	{
	sum = sum + 8000;
	}
	if (student[i].score1 > 85 && student[i].score2 > 80)
	{
	sum = sum + 4000;
	}
	if (student[i].score1 > 90)
	{
	sum = sum + 2000;
	}
	if (student[i].score1 > 85 && student[i].xibu == 'Y')
	{
	sum = sum + 1000;
	}
	if (student[i].score2 > 80 && student[i].ganbu == 'Y')
	{
	sum = sum + 850;
	}
	a[i] = sum;
	total = total + a[i];
	}
	sum = a[1];
	s = 1;
	for (i = 2;i <= n;i++)
	{
	if (sum < a[i])
	{
		s = i;
	sum = a[i];
	}
	}

	System.out.printf("\n%s\n",student[s].name);
	System.out.printf("%d\n",a[s]);
	System.out.printf("%d\n",total);
	}
}

