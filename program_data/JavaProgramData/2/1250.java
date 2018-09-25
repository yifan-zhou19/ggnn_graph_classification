public class book
{
	public int name;
	public String writer = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		book[] data = tangible.Arrays.initializeWithDefaultbookInstances(999);
		int m;
		int i;
		int j;
		int max = 0;
		int b = 0;
		int[] a = new int[26];
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
				data[i].name = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				data[i].writer = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(data[i].writer).length();j++)
			{
				a[data[i].writer.charAt(j) - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			b = i;
			}
		}
		System.out.printf("%c\n%d\n",('A' + b),max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(data[i].writer).length();j++)
			{
				if (data[i].writer.charAt(j) == ('A' + b))
				{
			System.out.printf("%d\n",data[i].name);
				break;
				}
			}
		}
	}
}

