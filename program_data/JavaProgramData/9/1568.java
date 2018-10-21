public class person
{
	public String ID = new String(new char[20]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		person[] a = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
		person[] b = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
		person t = new person();
		int n;
		int i;
		int j;
		int k = 0;
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
				a[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].age = Integer.parseInt(tempVar3);
			}
			if (a[i].age >= 60)
			{
				b[k] = a[i];
				k++;
			}

		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (b[j].age < b[j + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=b[j];
					t.copyFrom(b[j]);
					b[j] = b[j + 1];
					b[j + 1] = t;

				}
			}
		}
			for (i = 0;i < k;i++)
			{
				System.out.println(b[i].ID);
				System.out.print("\n");
			}
			for (i = 0;i < n;i++)
			{
				if (a[i].age < 60)
				{
					System.out.println(a[i].ID);
					System.out.print("\n");
				}
			}
			return 0;
	}
}

