public class patient
{
public String id = new String(new char[10]);
public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pa = tangible.Arrays.initializeWithDefaultpatientInstances(100);

	public static void Main()
	{
	int n;
	int i;
	int j;
	int max = 59;
	int m;
	int t = 0;
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
		pa[i].id = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		pa[i].age = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (pa[i].age > 59)
	{
		t++;
	}
	}
	for (j = 0;j < t;j++)
	{
	for (i = 0;i < n;i++)
	{
	if (pa[i].age > max)
	{
	max = pa[i].age;
	m = i;
	}
	}
	System.out.printf("%s\n",pa[m].id);
	pa[m].age = 0;
	max = 59;
	}

	for (i = 0;i < n;i++)
	{
	if (pa[i].age <= 59 && pa[i].age != 0)
	{
	System.out.printf("%s\n",pa[i].id);
	}
	}
	}

}

