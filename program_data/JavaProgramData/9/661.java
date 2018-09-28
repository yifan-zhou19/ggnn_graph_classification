public class patient
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int max;
		int t = 1;
		int n;
		int i;
		patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(101);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (;t != 0;)
		{
		max = 59;
		t = 0;
		for (i = 1;i <= n;i++)
		{
			if (p[i].age > max)
			{
				max = p[i].age;
				t = i;
			}
		}
		if (t != 0)
		{
			System.out.printf("%s\n",p[t].id);
		}
		p[t].age = 0;
		}
		for (i = 1;i <= n;i++)
		{
			if (p[i].age != 0)
			{
				System.out.printf("%s\n",p[i].id);
			}
		}
	}
}

