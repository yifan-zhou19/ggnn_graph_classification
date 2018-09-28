public class patient
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient[] order = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient[] buffer = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient swap = new patient();

	public static int Main()
	{

		int i;
		int j = 0;
		int m = 0;
		int n;
		int k;
		int p;
		int q;
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
				order[j] = pat[i];
				j++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age < 60)
			{
				buffer[m] = pat[i];
				m++;
			}
		}

		for (p = 1;p < j;p++)
		{
			for (q = 0;q < j - p;q++)
			{
						if (order[q].age < order[q + 1].age)
						{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: swap=order[q+1];
							swap.copyFrom(order[q + 1]);
							order[q + 1] = order[q];
							order[q] = swap;
						}
			}
		}
				for (q = 0;q < j;q++)
				{
				System.out.printf("%s",order[q].id);
				System.out.print("\n");
				}
				for (i = 0;i < m;i++)
				{
				System.out.printf("%s",buffer[i].id);
				 System.out.print("\n");
				}

	}


}

