package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[26];
		int i;
		int j;
		int z;
		int[] l = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = n;i > 0;i--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (z = j = 0;j < i;j++)
			{
			if (a[i] >= a[j] != 0 && z <= l[j])
			{
				z = l[j] + 1;
			}
			}
		 l[i] = z;
		}
		for (z = i = 0;i <= n;i++)
		{
			if (l[i] > z)
			{
				z = l[i];
			}
		}
		System.out.printf("%d\n",z - 1);
	}
}

