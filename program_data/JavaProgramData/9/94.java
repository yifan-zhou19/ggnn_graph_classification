package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		char[][] str =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] str1 =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] str2 =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int temp;
		char[] t = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int[] a = new int[100];
		int[] a1 = new int[100];
		int[] a2 = new int[100];
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
				str[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			str1[i] = str[i];
			a1[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 60)
			{
				str2[k] = str[i];
				a2[k] = a[i];
				k = k + 1;
			}
		}
			for (j = 1;j < k;j++)
			{
				for (i = 0;i < k - j;i++)
				{
					if (a2[i] < a2[i + 1])
					{
						temp = a2[i];
						a2[i] = a2[i + 1];
						a2[i + 1] = temp;
						t = str2[i];
						str2[i] = str2[i + 1];
						str2[i + 1] = t;

					}
				}
			}
					for (i = 0;i < k;i++)
					{
						System.out.printf("%s\n",str2[i]);
					}
					for (i = 0;i < n;i++)
					{
						if (a1[i] < 60)
						{
							System.out.printf("%s\n",str1[i]);
						}
					}


	}
}

