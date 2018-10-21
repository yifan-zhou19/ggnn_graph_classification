package <missing>;

public class GlobalMembers
{
	public static void sort(int[] str, int n)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (str[j] < str[k])
				{
					k = j;
				}
			}
				t = str[k];
				str[k] = str[i];
				str[i] = t;
		}

	}
	public static void gather(int[] str1, int[] str2)
	{
		int t = 0;
		int i;
		while (str1[t] != '\0')
		{
			t++;
		}
		for (i = t;str2[i - t] != '\0';i++)
		{
			str1[i] = str2[i - t];
		}
	}

	public static void Main()
	{
		int i;
		int n1;
		int n2;
		int[] str1 = new int[100];
		int[] str2 = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str1[i] = Integer.parseInt(tempVar3);
			}
		}
		scanf("\n");
		for (i = 0;i < n2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				str2[i] = Integer.parseInt(tempVar4);
			}
		}
		sort(str1, n1);
		sort(str2, n2);
		gather(str1, str2);
		for (i = 0;i < (n1 + n2 - 1);i++)
		{
			System.out.printf("%d ",str1[i]);
		}
		System.out.printf("%d",str1[n1 + n2 - 1]);

	}





}

