public class pa
{
		public String id = new String(new char[11]);
		public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		pa[] p = tangible.Arrays.initializeWithDefaultpaInstances(200);
		int n;
		int i;
		int[] t = new int[200];
		int j;
		int m;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
		}
		i = 0;
		t[0] = 0;
		while (i < n)
		{
			if (p[i].age >= 60)
			{
				for (j = 0;j < i && p[t[j]].age >= p[i].age;j++)
				{
					;
				}
				for (m = i;m > j;m--)
				{
					t[m] = t[m - 1];
				}
				t[j] = i;
				i++;
			}
			else
			{
				t[i] = i;
				i++;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p[t[i]].id);
		}
	}
}

