package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int[] a = new int[100];
		int[] b = new int[100];
		char[][] id = new char[100][20];
		String temp = new String(new char[20]);
		char[][] s = new char[100][20];

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
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0,j = 0;i < n;i++)
		{
			if (a[i] >= 60)
			{
				b[j] = a[i];
				s[j] = id[i];
				j = j + 1;
			}
		}


		for (i = 0;i < j;i++)
		{
			for (k = 0;k < j - i;k++)
			{
				if (b[k] < b[k + 1])
				{
					t = b[k];
					b[k] = b[k + 1];
					b[k + 1] = t;
					temp = s[k];
					s[k] = s[k + 1];
					s[k + 1] = temp;
				}
			}
		}
		for (k = 0;k < j;k++)
		{
			System.out.printf("%s\n",s[k]);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < 60)
			{
				System.out.printf("%s\n",id[i]);
			}
		}

	}
}

