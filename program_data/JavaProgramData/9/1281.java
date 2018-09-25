public class patient
{
	public String name = new String(new char[11]);
	public int age;
	public int order;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		patient[] peo = tangible.Arrays.initializeWithDefaultpatientInstances(NO);
		int n;
		int i;
		int count = 0;
		int COUNT;
		int j;
		int k;
		int e;
		int[] agedata = new int[NO];
		int a = 0;
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
				peo[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				peo[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (peo[i].age >= 60)
			{
				count++;
				agedata[a] = peo[i].age;
				a++;
			}
		} //count number of old people
		COUNT = count;
		for (i = 0;i < n;i++)
		{
			if (peo[i].age < 60)
			{
				peo[i].order = count;
				count++;
			}
		} // record order for young people
		for (k = 1;k < COUNT;k++)
		{
			for (j = 0;j < COUNT - k;j++)
			{
				if (agedata[j] < agedata[j + 1])
				{
					e = agedata[j + 1];
					agedata[j + 1] = agedata[j];
					agedata[j] = e;
				}
			}
		} //rearrage age of old people
		for (i = 0;i < COUNT;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (peo[j].age == agedata[i])
				{
					peo[j].order = i;
				}
			}
		} // record order for old people

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (peo[j].order == i)
				{
					System.out.printf("%s\n",peo[j].name);
				}
			}
		}
		return 0;
	}
}

