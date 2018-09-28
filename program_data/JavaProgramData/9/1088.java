package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int t;
		int[] old = new int[100];
		int[] age = new int[100];
		char[][] a = new char[100][20];
		char[][] a1 = new char[100][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a1[i] = tempVar3.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			age[i] = Integer.parseInt(a1[i]);
			if (age[i] >= 60)
			{
				old[j] = i;
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (k = 0;k < j - i - 1;k++)
			{
				if (age[old[k]] < age[old[k + 1]])
				{
					t = old[k];
					old[k] = old[k + 1];
					old[k + 1] = t;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",a[old[i]]);
		}
		for (i = 1;i <= n;i++)
		{
			if (age[i] >= 60)
			{
				continue;
			}
			System.out.printf("%s\n",a[i]);
		}
	}










}

