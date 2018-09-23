public class book
{
	public int num;
	public String s = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] shu = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		int max;
		char name;
		int[] letter = new int[26];
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
				shu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shu[i].s = tempVar3.charAt(0);
			}
			l = String.valueOf(shu[i].s).length();
			for (j = 0;j < l;j++)
			{
				letter[(shu[i].s.charAt(j) - 65)]++;
			}
		}
		for (max = letter[0],name = 65,i = 1;i < 26;i++)
		{
			if (letter[i] > max)
			{
				max = letter[i];
				name = i + 65;
			}
		}
		System.out.printf("%c\n%d\n",name,max);
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(shu[i].s).length();
			for (j = 0;j < l;j++)
			{
				if (shu[i].s.charAt(j) == name)
				{
					System.out.printf("%d\n",shu[i].num);
				}
			}
		}
		return 0;
	}
}

