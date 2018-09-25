public class pati
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static pati[] p = tangible.Arrays.initializeWithDefaultpatiInstances(100);
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] p2 = new int[100];
		int[] p3 = new int[100];
		int t = 0;
		int r = 0;
		int tem;
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
			if (p[i].age >= 60)
			{
				p2[t] = p[i].age;
				t++;
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			for (j = 0;j < t - 1 - i;j++)
			{
				if (p2[j] < p2[j + 1])
				{
					tem = p2[j + 1];
					p2[j + 1] = p2[j];
					p2[j] = tem;
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			if (i > 0)
			{
				if (p2[i] != p2[i - 1])
				{
					p3[r] = p2[i];
					r++;
				}
			}
			else
			{
				p3[r] = p2[i];
				r++;
			}
		}
		t = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (p[j].age == p3[t])
				{
					System.out.printf("%s\n",p[j].ID);
				}
			}
		t++;
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].age < 60)
			{
				System.out.printf("%s\n",p[i].ID);
			}
		}
	}
}

