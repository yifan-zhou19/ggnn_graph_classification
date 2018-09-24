public class books
{
	public String num = new String(new char[20]);
public String w = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int j;
		int i;
		int m;
	int[] b = new int[150];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	books[] a = tangible.Arrays.initializeWithDefaultbooksInstances(1000);
	for (i = 0;i < m;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i].num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i].w = tempVar3.charAt(0);
		}
	for (j = 0;a[i].w.charAt(j) != '\0';j++)
	{
	b[a[i].w.charAt(j)]++;
	}
	}
	int max = 0;
	for (i = 'A',j = 0;i <= 'Z';i++)
	{
			if (max < b[i])
			{
			max = b[i];
			j = i;
			}
	}
	 System.out.printf("%c\n",j);
	System.out.printf("%d\n",max);
	int n = 0;
	for (i = 0;i < m;i++)
	{
			n = 0;
			for (k = 0;a[i].w.charAt(k) != '\0';k++)
			{
				if (a[i].w.charAt(k) == j)
				{
					n = 1;
				}
			}
				if (n == 1)
				{
					System.out.printf("%s\n",a[i].num);
				}

	}
	}
}

