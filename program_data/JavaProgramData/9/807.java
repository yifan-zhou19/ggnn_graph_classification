public class man
{
 public String num = new String(new char[10]);
 public int age;
 public int nu;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static man[] stu = tangible.Arrays.initializeWithDefaultmanInstances(100);
	public static int f(tangible.RefObject<String> a, int b, int n1, tangible.RefObject<String> c, int d, int n2)
	{
		int sum;
	 if (b >= 60 && d >= 60)
	 {
		 if (b > d)
		 {
	 sum = 1;
		 }
	 else if (b < d)
	 {
	  sum = -1;
	 }
	 else
	 {
	  sum = n2 - n1;
	 }
	 }
	 else if (b >= 60 && d < 60)
	 {
	  sum = 1;
	 }
		else if (b < 60 && d >= 60)
		{
			sum = -1;
		}
	 else
	 {
			sum = n2 - n1;
	 }
	 return (sum);
	}
	public static void Main()
	{
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
		stu[i].num = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		stu[i].age = Integer.parseInt(tempVar3);
	}
	stu[i].nu = i + 1;
	}
	int j;
	int k;
	man t = new man();
	for (i = 0;i < n - 1;i++)
	{
		k = i;
	for (j = i + 1;j < n;j++)
	{
	if (f(stu[i].num, stu[i].age, stu[i].nu, stu[j].num, stu[j].age, stu[j].nu) < 0)
	{
		k = j;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=stu[i];
	t.copyFrom(stu[i]);
	stu[i] = stu[k];
	stu[k] = t;
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%s\n",stu[i].num);
	}
	}
}

