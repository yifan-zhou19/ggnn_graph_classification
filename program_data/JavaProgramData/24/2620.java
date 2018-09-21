package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] word =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j;
		int n;
		int[] a = new int[201];
		int flag = 0;
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
				word + i = tempVar2;
			}
			a[i] = String.valueOf((word + i)).length();
		}
		for (i = 0;i < n;i++)
		{
			flag = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i] < a[j])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				continue;
			}
			else if (flag == 0)
			{
				System.out.printf("%s\n",*(word + i));
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			flag = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i] > a[j])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				continue;
			}
			else if (flag == 0)
			{
				System.out.printf("%s\n",*(word + i));
				break;
			}
		}
	}
}

