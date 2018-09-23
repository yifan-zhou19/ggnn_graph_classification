public class info
{
	public int num;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static info[] a = tangible.Arrays.initializeWithDefaultinfoInstances(1000);

	public static int Main()
	{
		int i;
		int m;
		int j;
		int[] b = new int[26];
		char out;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i].num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i].author = tempVar3.charAt(0);
		}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				b[a[i].author.charAt(j) - 'A']++;
			}
		}
		int max = b[0];
		for (i = 0;i < 26;i++)
		{
			max = max > b[i] != 0?max:b[i];
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] == max)
			{
				out = 'A' + i;
				System.out.printf("%c\n",'A' + i);
				System.out.printf("%d\n",b[i]);
				break;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (a[i].author.charAt(j) == out)
				{
					System.out.printf("%d\n",a[i].num);
					break;
				}
			}
		}
	}
}

