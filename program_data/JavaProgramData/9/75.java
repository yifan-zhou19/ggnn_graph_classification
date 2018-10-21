package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] age = new int[100];
		int[] age1 = new int[100];
		int t1;
		int i;
		int j;
		int l1 = 0;
		int l2 = 0;
		char[][] id = new char[100][10];
		final String t2 = " ";
		String[] a = {" "};
		String[] b = {" "};
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
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
			if (age[i] >= 60)
			{
				a[l1] = id[i];
				age1[l1] = age[i];
				l1 += 1;
			}
			else
			{
				b[l2] = id[i];
				l2 += 1;
			}
		}
		for (i = 1;i < l1;i++)
		{
			for (j = 0;j < l1 - i;j++)
			{
				if (age1[j] < age1[j + 1])
				{
					t1 = age1[j];
					age1[j] = age1[j + 1];
					age1[j + 1] = t1;
					t2 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t2;
				}
			}
		}
		for (i = 0;i < l1;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
		for (j = 0;j < l2;j++)
		{
			System.out.printf("%s\n",b[j]);
		}
	}
}

