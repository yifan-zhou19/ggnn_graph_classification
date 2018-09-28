public class patient
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static int Main()
	{
		patient t = new patient();
		patient[] num = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		int n;
		int i;
		int j;
		int a = 1;
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
			pat[i].ID = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			pat[i].age = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age >= 60)
			{
			   num[a - 1] = pat[i];
			 a++;
			}
		}
		for (i = 0;i < a - 2;i++)
		{
			for (j = 0;j < a - 2 - i;j++)
			{
		if (num[j].age < num[j + 1].age)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=num[j];
			  t.copyFrom(num[j]);
			num[j] = num[j + 1];
			num[j + 1] = t;
		}
			}
		}
		for (i = 0;i < a - 1;i++)
		{
		System.out.printf("%s\n",num[i].ID);
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age < 60)
			{
		  System.out.printf("%s\n",pat[i].ID);
			}
		}

	  return 0;
	}
}

