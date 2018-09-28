public class patient
{
	public String ID = new String(new char[11]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(1000);

	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int l;
		int a = 0;
		int b = 0;
		int e;
		int[] sz1 = new int[1000];
		int[] sz2 = new int[1000];
		char[][] zfc1 = new char[1000][11];
		char[][] zfc2 = new char[1000][11];
		String f = new String(new char[11]);
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
		}
		for (i = 0,j = 0,l = 0;i < n;i++)
		{
			if (p[i].age >= 60)
			{
				a++;
				sz1[j] = p[i].age;
				zfc1[j] = p[i].ID;
				j++;
			}
			else
			{
				b++;
				sz2[l] = p[i].age;
				zfc2[l] = p[i].ID;
				l++;
			}
		}
		for (k = 0;k < n;k++)
		{
			for (j = n - 1;j >= k;j--)
			{
				if (sz1[j + 1] > sz1[j])
				{
					e = sz1[j];
					sz1[j] = sz1[j + 1];
					sz1[j + 1] = e;
					f = zfc1[j];
					zfc1[j] = zfc1[j + 1];
					zfc1[j + 1] = f;
				}
			}
		}
		for (j = 0;j < a;j++)
		{
			System.out.printf("%s\n",zfc1[j]);
		}
		for (l = 0;l < b;l++)
		{
			System.out.printf("%s\n",zfc2[l]);
		}
		return 0;
	}
}

