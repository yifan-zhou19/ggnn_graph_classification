public class stu
{
	public int num;
	public String id = new String(new char[26]);
}

public class aut
{
	public char wri;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(999);
	public static aut[] b = tangible.Arrays.initializeWithDefaultautInstances(26);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int m = 0;
		for (i = 0;i < 26;i++)
		{
			b[i].wri = 'A' + i;
			b[i].sum = 0;
		}
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
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].id = tempVar3.charAt(0);
			}
		}

		for (j = 0;j < 26;j++)
		{
			for (i = 0;i < n;i++)
			{
				for (k = 0;k < 26;k++)
				{
					if (b[j].wri == a[i].id.charAt(k))
					{
						b[j].sum++;
					}
				}
			}
		}
		int max = b[0].sum;
		for (j = 0;j < 26;j++)
		{
			if (max < b[j].sum)
			{
				max = b[j].sum;
				m = j;
			}
		}
		System.out.printf("%c\n%d\n",b[m].wri,max);
		for (i = 0;i < n;i++)
		{
			 for (k = 0;k < 26;k++)
			 {
				 if (a[i].id.charAt(k) == b[m].wri)
				 {
					 System.out.printf("%d\n",a[i].num);
				 }
			 }
		}


		return 0;
	}
}

