public class peo
{
	public String id = new String(new char[11]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		peo[] people = tangible.Arrays.initializeWithDefaultpeoInstances(100);
		peo[] sixty = tangible.Arrays.initializeWithDefaultpeoInstances(100);

		int n;
		int b = 0;
		int i;
		int j;
		int k;
		int e;
		String a = new String(new char[11]);

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
				people[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				people[i].age = Integer.parseInt(tempVar3);
			}
			if (people[i].age >= 60)
			{
				sixty[i].age = people[i].age;
				sixty[i].id = people[i].id;
				b += 1;
			}
			else
			{
				sixty[i].id = "0000";
				sixty[i].age = 0;
			}
		}

		for (k = 0;k < n - 1;k++)
		{
			for (i = n - 1;i > k;i--)
			{
				if (sixty[i - 1].age < sixty[i].age)
				{
					e = sixty[i - 1].age;
					sixty[i - 1].age = sixty[i].age;
					sixty[i].age = e;
					a = sixty[i - 1].id;
					sixty[i - 1].id = sixty[i].id;
					sixty[i].id = a;
				}
			}
		}
		for (i = 0;i < b;i++)
		{
			System.out.printf("%s\n",sixty[i].id);

		}
		for (i = 0;i < n;i++)
		{
			if (people[i].age < 60)
			{
				System.out.printf("%s\n",people[i].id);
			}
		}


		return 0;

	}

}

