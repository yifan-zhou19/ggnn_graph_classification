public class patient
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient[] old = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient temp = new patient();
	public static void Main()
	{
		int i;
		int j;
		int n;
		int count = 0;
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
				p[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
			if (p[i].age >= 60)
			{
			   old[count] = p[i];
			   count++;
			}
		}
		for (i = 0;i < count;i++)
		{
			for (j = 0;j < count - i;j++)
			{
				if (old[j + 1].age > old[j].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=old[j];
					temp.copyFrom(old[j]);
					old[j] = old[j + 1];
					old[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < count;i++)
		{
			System.out.printf("%s\n",old[i].id);
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].age < 60)
			{
				System.out.printf("%s\n",p[i].id);
			}
		}
	}
}

