public class j
{
	public int bianhao;
	public String zuozhe = new String(new char[100]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int l;
		int k;
		int z;
		int max = 0;
		int[] shumu = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		j[] a;
		a = tangible.Arrays.initializeWithDefaultjInstances(m);
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].bianhao = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].zuozhe = tempVar3.charAt(0);
			}
		}
		for (z = 0;z < 26;z++)
		{
			shumu[z] = 0;
		for (i = 0;i < m;i++)
		{
			String p;
			p = a[i].zuozhe;
			l = String.valueOf(a[i].zuozhe).length();
			for (k = 0;k < l;k++)
			{
				if (p.charAt(k) == 'A' + z)
				{
					shumu[z]++;
				}
			}
		}

		}
		 for (z = 0;z < 26;z++)
		 {
			if (shumu[z] > max)
			{
				max = shumu[z];
			}
		 }
		 for (z = 0;z < 26;z++)
		 {
			 if (shumu[z] == max)
			 {

				 System.out.printf("%c\n%d\n",z + 'A',max);
				 for (i = 0;i < m;i++)
				 {
			String p;
			p = a[i].zuozhe;
			l = String.valueOf(a[i].zuozhe).length();
			for (k = 0;k < l;k++)
			{
				if (p.charAt(k) == 'A' + z)
				{
					System.out.printf("%d\n",a[i].bianhao);
				}
			}
				 }
				 break;
			 }
		 }

	}


}

