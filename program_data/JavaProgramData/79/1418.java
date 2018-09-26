package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[20];
		int[] m = new int[20];
		int[] z = new int[201];
		int i;
		int j;
		int k;
		int l;
		int t;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
		}

		for (i = 0;n[i] != 0 || m[i] != 0;i++)
		{
			int[] z = new int[201];
			int t;
			for (j = 0;j < n[i];j++)
			{
				z[j] = j + 1;
			}
			t = n[i];
			k = 0;
			for (j = 1;j <= t - 1;j++,n[i]--) //????j<=n[i]-1?n[i]???!!
			{
				k = (m[i] + k - 1) % n[i];
				for (l = k;z[l] != 0;l++) //??????    ????'0' !!!!
				{
					z[l] = z[l + 1];
				}
			}
			System.out.printf("%d\n",z[0]);
		}
	}

}

