public class bingren
{
	public String id = new String(new char[1000]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static bingren[] bin = tangible.Arrays.initializeWithDefaultbingrenInstances(101);

	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k = 0;
		int l = 0;
		int e;
		int[] a = new int[100];
			char[][] xiao = new char[101][1000];
			char[][] da = new char[101][1000];
			String c = new String(new char[1000]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bin[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bin[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (bin[i].age < 60)
			{
				xiao[k] = bin[i].id;
				k++;
			}
			else
			{
				da[l] = bin[i].id;
				a[l] = bin[i].age;
				l++;
			}
		}
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < l - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					c = da[j + 1];
					da[j + 1] = da[j];
					da[j] = c;
					e = a[j + 1];
					a[j + 1] = a[j];
					a[j] = e;
				}
			}

		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%s\n",da[i]);
		}
		for (i = 0;i < k;i++)
		{
				System.out.printf("%s\n",xiao[i]);
		}

	}

}

