package <missing>;

public class GlobalMembers
{
	public static int cmpdouble(Object x, Object y)
	{
		return ((double)x > (double)y ? 1 : -1);
	}
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	double[] boy = new double[41];
	double[] girl = new double[41];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//	char gender[10];
	//double height;
	//}
	//student[41];
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		student[i].gender = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		student[i].height = tempVar3;
	}
	}
	i = 0;
	j = 0;
	k = 0;
	while (i <= n - 1)
	{
		if (student[i].gender[0] == 'm')
		{
			boy[j] = student[i].height;
		j++;
		}
		else
		{
			girl[k] = student[i].height;
		k++;
		}
		i++;
	}

	qsort(boy,j,(Double.SIZE / Byte.SIZE),cmpdouble);
	qsort(girl,k,(Double.SIZE / Byte.SIZE),cmpdouble);
	for (i = 0;i <= j - 1;i++)
	{
	System.out.printf("%.2f ",boy[i]);
	}
	for (i = k - 1;i > 0;i--)
	{
	System.out.printf("%.2f ",girl[i]);
	}
	System.out.printf("%.2f",girl[0]);
	}

}

