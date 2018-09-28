public class Patient
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static Patient[] a = tangible.Arrays.initializeWithDefaultPatientInstances(100);
	public static Patient e = new Patient();
	public static Patient[] b = tangible.Arrays.initializeWithDefaultPatientInstances(100);

	public static int Main()
	{
		int n;
		int J;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j].id > a[j + 1].id)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=a[j];
					e.copyFrom(a[j]);
					a[j] = a[j + 1];
					a[j + 1] = e;
				}
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i].age >= 60)
			{
				b[j] = a[i];
				j++;
			}
		}
		J = j;
		for (j = 0;j < J;j++)
		{
			for (i = 0;i < J - j;i++)
			{
				if (b[i].age < b[i + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=b[i];
					e.copyFrom(b[i]);
					b[i] = b[i + 1];
					b[i + 1] = e;
				}
			}
		}
		for (j = 0;j < J;j++)
		{
			System.out.printf("%s\n",b[j].id);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].age < 60)
			{
				System.out.printf("%s\n",a[i].id);
			}
		}
		return 0;
	}
}

