package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] age = new int[100];
		int[] a = new int[100];
		int j = 0;
		int k;
		int l;
		int temp;
		int[] ord = new int[100];
		int[] o = new int[100];
		char[][] num = new char[100][10];
		char[][] old = new char[100][10];
		String t = new String(new char[10]);
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
				num[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			ord[i] = i;
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] >= 60)
			{
				a[j] = age[i];
				o[j] = ord[j];
				old[j] = num[i];
				j++;
			}
		}
		for (k = 0;k < j;k++)
		{
			for (l = k + 1;l < j;l++)
			{
				if (a[k] < a[l])
				{
					temp = a[k];
					a[k] = a[l];
					a[l] = temp;
					temp = o[k];
					o[k] = o[l];
					o[l] = temp;
					t = old[k];
					old[k] = old[l];
					old[l] = t;
				}
			}
		}
		for (k = 0;k < j;k++)
		{
			for (l = k + 1;l < j;l++)
			{
				if (a[k] == a[l])
				{
					if (o[k] > o[l])
					{
						temp = a[k];
						a[k] = a[l];
						a[l] = temp;
						temp = o[k];
						o[k] = o[l];
						o[l] = temp;
						t = old[k];
						old[k] = old[l];
						old[l] = t;
					}
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",old[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] < 60)
			{
				System.out.printf("%s\n",num[i]);
			}
		}
	}

}

