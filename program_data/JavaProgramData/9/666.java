public class people
{
	public String id = new String(new char[10]);
public int age;
}

package <missing>;

public class GlobalMembers
{
	public static people[] p = tangible.Arrays.initializeWithDefaultpeopleInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int j;
		int k;
		int m = 0;
		String str = new String(new char[10]);
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
				p[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0,j = 0,k = 0;i < n;i++)
		{
			if (p[i].age >= 60)
			{
				a[j++] = i;
				m++;
			}
			else
			{
				b[k++] = i;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (p[a[j]].age < p[a[j + 1]].age)
				{
					int t = p[a[j]].age;
					p[a[j]].age = p[a[j + 1]].age;
					p[a[j + 1]].age = t;
					str = p[a[j]].id;
					p[a[j]].id = p[a[j + 1]].id;
					p[a[j + 1]].id = str;
				}
			}
		}
		if (m != 0)
		{
			System.out.printf("%s",p[a[0]].id);
			for (i = 1;i < m;i++)
			{
				System.out.printf("\n%s",p[a[i]].id);
			}
			for (i = 0;i < n - m;i++)
			{
				System.out.printf("\n%s",p[b[i]].id);
			}
		}
		else
		{
			System.out.printf("%s",p[b[0]].id);
			for (i = 1;i < n;i++)
			{
				System.out.printf("\n%s",p[b[i]].id);
			}
		}
	}

}

