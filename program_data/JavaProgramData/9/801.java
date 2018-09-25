package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] b = new int[100];
		int[] pos = new int[100];
		int t;
		int m;
		char[][] a = new char[100][11];
		String temp = new String(new char[11]);
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
			b[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
		pos[i] = i;
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n - 1 - i;j++)
		{
			if (b[j] < b[j + 1])
			{
				t = b[j];
				b[j] = b[j + 1];
				b[j + 1] = t;
				m = pos[j];
				pos[j] = pos[j + 1];
				pos[j + 1] = m;
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
		}
		j = 0;
		while (b[j] >= 60)
		{
			System.out.printf("%s\n",a[j++]);
		}
		k = j;
		for (i = k;i < n;i++)
		{
		for (j = k;j < n - 1;j++)
		{
			if (pos[j] > pos[j + 1])
			{
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
				m = pos[j];
				pos[j] = pos[j + 1];
				pos[j + 1] = m;
			}
		}
		}
		for (j = k;j < n;j++)
		{
		System.out.printf("%s\n",a[j]);
		}
		return 0;
	}

}

