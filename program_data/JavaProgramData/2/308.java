public class shu
{
	public int bianhao;
	public String name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static shu[] shu = tangible.Arrays.initializeWithDefaultshuInstances(999);

	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int[] jishu = new int[26];
		int[] beiyong = new int[26];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shu[i].bianhao = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shu[i].name = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (shu[j].name.charAt(k) == i + 'A')
					{
						jishu[i]++;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			beiyong[i] = jishu[i];
		}
		int max = 0;
		for (i = 0;i < 26;i++)
		{
			if (beiyong[i] > max)
			{
				max = beiyong[i];
			}
		}
		int t;
		for (i = 0;i < 26;i++)
		{
			if (jishu[i] == max)
			{
				t = i;
			}
		}
		System.out.printf("%c\n",t + 'A');
		System.out.printf("%d\n",max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (shu[i].name.charAt(j) == t + 'A')
				{
					System.out.printf("%d\n",shu[i].bianhao);
				}
			}
		}
	}
}

