public class ILL
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		ILL[] ill = tangible.Arrays.initializeWithDefaultILLInstances(100);
		int n;
		int i;
		int k;
		int j = 0;
		int[] Age = new int[100];
		int x;
		char[][] a = new char[100][10];
		String b = new String(new char[10]);
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
				ill[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ill[i].age = Integer.parseInt(tempVar3);
			}
			if (ill[i].age >= 60)
			{
				a[j] = ill[i].id;
			  Age[j] = ill[i].age;
			  j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			for (k = 0;k < j - i - 1;k++)
			{
				if (Age[k] < Age[k + 1])
				{
					b = a[k + 1];
					a[k + 1] = a[k];
					a[k] = b;
					x = Age[k];
					Age[k] = Age[k + 1];
					Age[k + 1] = x;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.println(a[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (ill[i].age < 60)
			{
				System.out.printf("%s\n",ill[i].id);
			}
		}
		return 0;
	}

}

