public class patient
{
	public String id = new String(new char[11]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pa = tangible.Arrays.initializeWithDefaultpatientInstances(101);
	public static patient[] que = tangible.Arrays.initializeWithDefaultpatientInstances(101);
	public static patient tran = new patient();

	public static void Main(String[] args)
	{
		int i;
		int n;
		int j;
		int old = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 1;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pa[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pa[i].age = Integer.parseInt(tempVar3);
			}
			if (pa[i].age >= 60)
			{
				que[j] = pa[i];
				old += 1;
				j++;
			}
		}
		for (i = 1;i <= old - 1;i++)
		{
			for (j = 1;j <= old - i;j++)
			{
				if (que[j].age < que[j + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tran=que[j];
					tran.copyFrom(que[j]);
					que[j] = que[j + 1];
					que[j + 1] = tran;
				}
			}

		}
		j = old + 1;
		for (i = 1;i <= n;i++)
		{
			if (pa[i].age < 60)
			{
				que[j] = pa[i];
				j++;
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%s\n",que[i].id);
		}
	}



}

