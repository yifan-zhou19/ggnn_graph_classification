package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] age = new int[100];
		int i;
		int j;
		int k;
		int p = 0;
		int n;
		char[][] a = new char[100][10];
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
			if (age[i] >= 60)
			{
				p++;
			}
		}
		for (j = 1;j <= p;j++)
		{
			k = 0;
			for (i = 0;i < n;i++)
			{
				if (age[i] > age[k])
				{
					k = i;
				}

			}
			System.out.printf("%s\n",a[k]);
			age[k] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] != 0)
			{
				System.out.printf("%s\n",a[i]);
			}
		}

	}
}

