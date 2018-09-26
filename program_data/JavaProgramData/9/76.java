public class people
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t;
		people[] peo = tangible.Arrays.initializeWithDefaultpeopleInstances(100);
		people[] old = tangible.Arrays.initializeWithDefaultpeopleInstances(100);
		void bubble(struct people a[100], int n);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				peo[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				peo[i].age = Integer.parseInt(tempVar3);
			}
		}

		t = 0;
		for (i = 0; i < n; i++)
		{
			if (peo[i].age >= 60)
			{
				old[t].ID = peo[i].ID;
				old[t].age = peo[i].age;
				t++;
			}
			else
			{
				continue;
			}
		}
		bubble(old, t);
		for (i = 0; i < t; i++)
		{
			System.out.printf("%s\n", old[i].ID);
		}

		for (i = 0; i < n; i++)
		{
			if (peo[i].age < 60)
			{
				System.out.printf("%s\n", peo[i].ID);
			}
		}

	}

	public static void bubble(people[] a, int n)
	{
		int i;
		int j;
		people t = new people();
		for (i = 1; i < n; i++)
		{
			for (j = 0; j < n - i; j++)
			{
				if (a[j].age < a[j + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t = a[j];
					t.copyFrom(a[j]);
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
}

