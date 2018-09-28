package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int a;
		String str = new String(new char[N]);
		int temp = 0;
		int[] num = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		for (i = 0;i < str.length() - n;i++)
		{
			for (j = i + 1;j < str.length() - n + 1;j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					for (k = 1;k < n;k++)
					{
						if (str.charAt(i + k) == str.charAt(j + k))
						{
						   temp++;
						}
					}
					if (temp == (n - 1))
					{
					  num[i]++;
					}
				}
				temp = 0;
			}
		}
		a = 0;
		for (m = 0;m < str.length() - n;m++)
		{
			if (num[m] > a)
			{
			  a = num[m];
			}
		}
		if (a == 0)
		{
		  System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",a + 1);
			for (j = 0;j < str.length() - n + 1;j++)
			{
				if (num[j] == a)
				{
					for (i = 0;i < n - 1;i++)
					{
						System.out.printf("%c",str.charAt(j + i));
					}
					System.out.printf("%c\n",str.charAt(j + n - 1));
				}
			}
		}
	}
}

