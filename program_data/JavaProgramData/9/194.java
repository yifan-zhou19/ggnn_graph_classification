package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int n;
		int n1 = -1;
		int n2 = -1;
		int old = 0;
		char[][] xiao = new char[100][10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct bingren
	//	{
	//		char id[10];
	//		int age;
	//	};
		bingren[] a = tangible.Arrays.initializeWithDefaultbingrenInstances(100);
		bingren[] b = tangible.Arrays.initializeWithDefaultbingrenInstances(100);
		bingren t = new bingren();
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
				a[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].age >= 60)
			{
			   b[j] = a[i];

			   n1++;

			   j++;
			}
			else
			{
				xiao[k] = a[i].id;
				k++;
				n2++;
			}
		}
		for (i = 0;i < n1;i++)
		{
			for (j = 0;j < n1 - i;j++)
			{
			   if (b[j].age < b[j + 1].age)
			   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=b[j];
				   t.copyFrom(b[j]);
				   b[j] = b[j + 1];
				   b[j + 1] = t;
			   }
			}

		}

		for (i = 0;i <= n1;i++)
		{
			System.out.printf("%s\n",b[i].id);
		}
		for (i = 0;i <= n2;i++)
		{
			System.out.printf("%s\n",xiao[i]);
		}
	}



}

