package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int z;
		int n;
		int[] s = new int[100];
		int[] k = new int[100];
		int m;
		int e;
		int a;
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
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		z = 0;
		for (i = 0;i < n;i++)
		{
			if (s[i] % 2 == 1)
			{
				k[z] = s[i];
				z++;
			}
		}
	for (a = 1;a <= z;a++)
	{
		m = 0;
		for (i = 0;i <= z - a;i++)
		{
			if (k[i] > k[m])
			{
				m = i;
			}
			if (m != z - a)
			{
				e = k[m];
				k[m] = k[z - a];
				k[z - a] = e;
			}
		}
	}
		if (z == 1)
		{
			System.out.printf("%d",k[0]);
		}
		else
		{
			System.out.printf("%d",k[0]);
			for (i = 1;i < z;i++)
			{

					System.out.printf(",%d",k[i]);
			}
		}
	return 0;
	}
}

