public class patient
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void bubble(patient[] a, int n)
	{
		int i;
		int j;
		patient t;
		for (i = 0;i <= n - 2;i++)
		{
			for (j = 0;j <= n - i - 2;j++)
			{
				if (a[j].age < a[j + 1].age)
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}

	public static void Main()
	{
		int n;
		int i;
		int s = 0;
		patient[] p =
		{
			new patient("0", 0),
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null
		};
		patient[] pt = tangible.Arrays.initializeWithDefaultpatientInstances(100);
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
				p[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
			pt[i] = p[i];
		}

		bubble(pt, n);

		for (i = 0;i < n;i++)
		{
			if (pt[i].age >= 60)
			{
				System.out.printf("%s\n",pt[i].ID);
				s++;
			}
		}


		for (i = 0;i < n;i++)
		{

			if (p[i].age < 60)
			{
				System.out.printf("%s\n",p[i].ID);

			}

		}

	}

	public static void sort2(patient[] a, int n)
	{
		int i;
		int j;
		int k;
		patient t;
		for (i = 0;i < n - 1;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (a[j].age > a[k].age)
				{
					k = j;
				}
			}
			t = a[k];
			a[k] = a[i];
			a[i] = t;
		}
	}
}

