public class patient
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static void Main()
	{
		int n;
		int m = 0;
		int i;
		int j = 0;
		int k;
		int temp;
		int[] a = new int[40];
		int sum = 1;
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
				p[j++] = pat[i];
				m++;
			}
		}
		a[0] = p[0].age;
		for (j = 1;j < m;j++)
		{
			for (i = 0;a[i] != 0;i++)
			{
				if (a[i] == p[j].age)
				{
					break;
				}
			}
				if (a[i] == 0)
				{
					a[i] = p[j].age;
					sum++;
				}
		}
		for (j = 0;j < sum - 1;j++)
		{
			k = j;
			{
				for (i = j + 1;i < sum;i++)
				{
					if (a[i] > a[j])
					{
					k = i;
				temp = a[k];
				a[k] = a[j];
				a[j] = temp;
					}
				}
			}
		}
		for (k = 0;k < sum;k++)
		{
			for (j = 0;j < m;j++)
			{
				if (p[j].age == a[k])
				{
					System.out.printf("%s\n",p[j].id);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age < 60)
			{
				System.out.printf("%s\n",pat[i].id);
			}
		}
	}
}

