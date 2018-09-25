public class SHU
{
	public int bh;
	public String bz = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int l;
		int k;
		int p;
		int[] name = new int[200];
		int max;
		int[] shuhao = new int[1000];
		SHU[] shu = tangible.Arrays.initializeWithDefaultSHUInstances(1000);
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
				shu[i].bh = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shu[i].bz = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			l = String.valueOf(shu[i].bz).length();
			for (j = 0;j < l;j++)
			{
				name[shu[i].bz.charAt(j)]++;
			}
		}
		max = name[0];
		for (i = 0;i < 200;i++)
		{
			if (name[i] > max)
			{
				max = name[i];
				k = i;
			}
		}
		p = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (shu[i].bz.charAt(j) == k)
				{
					shuhao[p] = shu[i].bh;
					p++;
				}
			}
		}
		System.out.printf("%c\n",k);
		System.out.printf("%d\n",max);
		for (i = 0;i < p;i++)
		{
			System.out.printf("%d\n",shuhao[i]);
		}





		return 0;
	}

}

