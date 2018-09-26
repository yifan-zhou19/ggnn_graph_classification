public class patient
{
		public String num = new String(new char[20]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		patient[] a = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] b = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] c = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient temp = new patient();
	int n;
	int i;
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
			a[i].num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i].age = Integer.parseInt(tempVar3);
		}
	}

	int j = 0;
	int k = 0;
	int m;
	for (i = 0;i < n;i++)
	{
		if (a[i].age >= 60)
		{
			b[j] = a[i];
			j++;
		}
	else
	{
		c[k] = a[i];
		k++;
	}
	}

	for (i = 0;i < j;i++)
	{
		for (m = 0;m < j - i;m++)

		{
		if (b[m].age < b[m + 1].age)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=b[m];
		temp.copyFrom(b[m]);
		b[m] = b[m + 1];
		b[m + 1] = temp;
		}
		}
	}

	for (i = 0;i < j;i++)
	{
		System.out.printf("%s\n",b[i].num);
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf("%s\n",c[i].num);
	}



	}

}

