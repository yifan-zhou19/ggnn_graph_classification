public class patient
{
	public String name = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int l;
		patient[] b = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] c = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient t = new patient();
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
				pat[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pat[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age < 60)
			{
				  b[j] = pat[i];
				  j++;
			}
			else
			{
				c[k] = pat[i];
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (l = 0;l < k - 1 - i;l++)
			{
				if (c[l].age < c[l + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=c[l];
					t.copyFrom(c[l]);
					c[l] = c[l + 1];
					c[l + 1] = t;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",c[i].name);
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",b[i].name);
		}
	}
}

