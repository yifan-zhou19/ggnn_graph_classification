public class patient
{
	public int age;
	public String id = new String(new char[12]);
}

package <missing>;

public class GlobalMembers
{
	public static void swap(patient a, patient b)
	{
		patient tmp = new patient();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmp = *a;
		tmp.copyFrom(a);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *a = *b;
		a.copyFrom(b);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *b = tmp;
		b.copyFrom(tmp);
	}
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		patient tmp = new patient();
		patient[] young = tangible.Arrays.initializeWithDefaultpatientInstances(120);
		patient[] old = tangible.Arrays.initializeWithDefaultpatientInstances(120);
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tmp.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				tmp.age = Integer.parseInt(tempVar3);
			}
			if (tmp.age >= 60)
			{
				old[j++] = tmp;
			}
			else
			{
				young[k++] = tmp;
			}
		}
		for (i = 0; i < j; i++)
		{
			for (l = 0; l < j - i - 1; l++)
			{
				if (old[l].age < old[l + 1].age)
				{
					swap(old[l], old[l + 1]);
				}
			}
		}
		for (i = 0; i < j; i++)
		{
			System.out.printf("%s\n",old[i].id);
		}
		for (i = 0; i < k; i++)
		{
			System.out.printf("%s\n",young[i].id);
		}
		return 0;
	}

}

