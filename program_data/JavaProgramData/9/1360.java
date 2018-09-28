public class patient
{
	public String A = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int max;
		int count;
		patient inter = new patient();
		patient p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		patient[] sick = tangible.Arrays.initializeWithDefaultpatientInstances(n); //??
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		patient waitlist = (patient)malloc(sizeof(patient) * n); //??
		count = 0; //????
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sick[i].A = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sick[i].age = Integer.parseInt(tempVar3);
			}
		} //??
		p = waitlist;
		for (i = 0;i < n;i++)
		{
			if (sick[i].age >= 60)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *p=sick[i];
				p.copyFrom(sick[i]);
				p++;
				count++;
			}
		} //????
		for (i = 0;i < n;i++)
		{
			if (sick[i].age < 60)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *p=sick[i];
				p.copyFrom(sick[i]);
				p++;
			}
		} //?????
		for (i = 1;i < count;i++)
		{
			for (k = 0;k < count - i;k++)
			{
				if (waitlist[k].age < waitlist[k + 1].age)
				{
					inter = waitlist[k + 1];
					waitlist[k + 1] = waitlist[k];
					waitlist[k] = inter;
				}
			}
		} //????
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",waitlist[i].A);
		}
		return 0;
	}
}

