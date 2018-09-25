public class patient
{
	public String id = new String(new char[11]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		patient[] pt = tangible.Arrays.initializeWithDefaultpatientInstances(100);

		int n;
		int i;
		int j;
		int a = 0;
		int b = 0;
		int tem;
		int[] age_r = new int[100];
		int[] time_range = new int[100];
		String temid = new String(new char[11]);
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
				pt[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pt[i].age = Integer.parseInt(tempVar3);
			}
			if (pt[i].age >= 60)
			{
				age_r[a] = i;
				a++;
			}
			else
			{
				time_range[b] = i;
				b++;
			}
		}
		for (i = 1;i < a - 1;i++)
		{
			for (j = 0;j < a - i;j++)
			{
				if (pt[age_r[j]].age < pt[age_r[j + 1]].age)
				{ //?????????????? ???debug?????????
					temid = pt[age_r[j]].id;
					pt[age_r[j]].id = pt[age_r[j + 1]].id;
					pt[age_r[j + 1]].id = temid;
					tem = pt[age_r[j]].age;
					pt[age_r[j]].age = pt[age_r[j + 1]].age;
					pt[age_r[j + 1]].age = tem;

				}
			}

		}
		for (i = 0;i < a;i++)
		{
			System.out.printf("%s\n",pt[age_r[i]].id);
		}
		for (i = 0;i < b;i++)
		{
			System.out.printf("%s\n",pt[time_range[i]].id);
		}

		return 0;
	}

}

