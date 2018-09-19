public class people
{
	public int a;
	public String name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		people[] pl = tangible.Arrays.initializeWithDefaultpeopleInstances(1000);
		int i;
		int j;
		int k;
		int l = 0;
		int n;
		int s;
		int m;
		int max;
		int[] x = new int[26];
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
				pl[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pl[i].name = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(pl[i].name).length();
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (k == pl[i].name.charAt(j) - 'A')
					{
						x[k]++;
						break;
					}
				}
			}
		}
		max = x[0];
		for (i = 0;i < 26;i++)
		{
			if (x[i] > max)
			{
				max = x[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (x[i] == max)
			{
				System.out.printf("%c\n",'A' + i);
				s = i;
				System.out.printf("%d\n",x[i]);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (pl[i].name.charAt(j) == 'A' + s)
				{
					System.out.printf("%d\n",pl[i].a);
					break;
				}
			}
		}
	}







}

