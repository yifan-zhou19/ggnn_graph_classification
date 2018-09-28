public class node
{
public String s = new String(new char[100]);
public int age;
public int no;
}

package <missing>;

public class GlobalMembers
{
	public static node[] a = tangible.Arrays.initializeWithDefaultnodeInstances(1000);
	public static node b = new node();
	public static int check(int x,int y)
	{
	if (a[y].age < 60 && a[x].age >= 60)
	{
		return 0;
	}
	if (a[y].age >= 60 && a[x].age < 60)
	{
		return 1;
	}
	if (a[x].age < 60 && a[y].age < 60 && a[x].no> a[y].no)
	{
		return 1;
	}
	if (a[x].age < 60 && a[y].age < 60 && a[x].no < a[y].no)
	{
		return 0;
	}
	if (a[x].age > a[y].age)
	{
		return 0;
	}
	if (a[x].age < a[y].age)
	{
		return 1;
	}
	if (a[x].no < a[y].no)
	{
		return 0;
	}
	if (a[x].no > a[y].no)
	{
		return 1;
	}
	return 0;
	}
	public static int Main()
	{
	int i;
	int j;
	int n;
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
		a[i].s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i].age = Integer.parseInt(tempVar3);
	}
	a[i].no = i;
	}
	for (i = 1;i < n;i++)
	{
	 for (j = i + 1;j <= n;j++)
	 {
	  if (check(i, j) == 1)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: b=a[i];
		b.copyFrom(a[i]);
		a[i] = a[j];
		a[j] = b;
	  }
	 }
	}
	for (i = 1;i <= n;i++)
	{
	System.out.printf("%s\n",a[i].s);
	}
	return 0;
	}
}

