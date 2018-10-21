public class patient
{
	public String id = new String(new char[20]);
	public int age;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String id1 = new String(new char[20]);
		int age1;
		int u;
		patient temp = new patient();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		patient * p = new patient();
		patient[] a = tangible.Arrays.initializeWithDefaultpatientInstances(500);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=a;
		p.copyFrom(a);
		u = 0;
		for (;p < a + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age1 = Integer.parseInt(tempVar3);
			}
			p.id = id1;
			p.age = age1;
			p.num = u;
			u++;
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=a;
		p.copyFrom(a);
		for (i = n - 2;i >= 0;i--)
		{
			for (j = 0;j <= i;j++)
			{
				if ((*(p + j)).age >= 60 || (*(p + j + 1)).age >= 60)
				{
					if ((*(p + j)).age < (*(p + j + 1)).age)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=*(p+j);
						temp.copyFrom((p + j));
						*(p + j) = *(p + j + 1);
						*(p + j + 1) = temp;
					}
				}
				else
				{
					continue;
				}
			}

		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=a;
		p.copyFrom(a);
		for (;p < a + n;p++)
		{

				System.out.printf("%s\n",p.id);
		}

		return 0;
	}
}

