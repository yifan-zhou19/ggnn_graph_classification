public class patient
{
	public String id = new String(new char[20]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static int Main()
	{
		int i;
		int k;
		int n;
		int e;
		int[] ex = new int[100];
		int[] ex1 = new int[100];
		i = 0;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(pat[i].id) = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(pat[i].age) = Integer.parseInt(tempVar3);
			}
			ex[i] = pat[i].age;
			ex1[i] = i + 1;
		}
		for (k = n - 1;k >= 1;k--)
		{
			for (i = n - 1;i >= n - k;i--)
			{
				if (ex[i] > ex[i - 1] && ex[i] >= 60)
				{
					e = ex[i];
					ex[i] = ex[i - 1];
					ex[i - 1] = e;
					e = ex1[i];
					ex1[i] = ex1[i - 1];
					ex1[i - 1] = e;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (ex[i] >= 60)
			{
				System.out.printf("%s\n",pat[ex1[i] - 1].id);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (ex[i] < 60)
			{
				System.out.printf("%s\n",pat[ex1[i] - 1].id);
			}
		}
		return 0;
	}

}

