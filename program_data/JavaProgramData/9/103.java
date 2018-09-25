package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j = 0;
	int p = 0;
	int q;
	int w;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct patient
	//{
	//int age;
	//char b[10];
	//};
	patient[] c = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	patient[] d = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	patient[] e = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	patient[] f = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	patient g = new patient();
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
		c[i].b = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c[i].age = tempVar3;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (c[i].age >= 60)
	{
	d[j] = c[i];
	j = j + 1;
	}
	else
	{
	e[p] = c[i];
	p = p + 1;
	}
	}
	w = j - 1;

	for (j = 1;j <= w;j++)
	{
		q = w;
	for (;q >= j;q--)
	{
	if (d[q].age > d[q - 1].age)
	{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: g=d[q];
	g.copyFrom(d[q]);
	d[q] = d[q - 1];
	d[q - 1] = g;
	}
	}
	}
	for (j = 0;j < w + 1;j++)
	{
	System.out.printf("%s\n",d[j].b);
	}
	for (j = 0;j < p;j++)
	{
	System.out.printf("%s\n",e[j].b);
	}

	}

}

