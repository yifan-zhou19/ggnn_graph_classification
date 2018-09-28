public class patient
{
	public String id = new String(new char[11]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static int Main()
	{
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
				pat[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pat[i].age = Integer.parseInt(tempVar3);
			}
		}
		int temp = 0;
		patient e = new patient();
		for (i = 0;i < n;i++)
		{
			if (pat[i].age >= 60)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=pat[i];
				e.copyFrom(pat[i]);
				int j;
				for (j = i;j >= temp + 1;j--)
				{
					pat[j] = pat[j - 1];
				}
				pat[temp] = e;
				temp++;
			}
		}
		int k;
		for (k = 1;k <= temp;k++)
		{
			for (i = 0;i < temp - k;i++)
			{
				if (pat[i].age < pat[i + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=pat[i];
					e.copyFrom(pat[i]);
					pat[i] = pat[i + 1];
					pat[i + 1] = e;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",pat[i].id);
		}
		return 0;
	}

}

