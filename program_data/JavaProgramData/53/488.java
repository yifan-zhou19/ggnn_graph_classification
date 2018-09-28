package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[300][3];
		int n;
		int i;
		int j;
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
		}


		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (strcmp(a[i],a[j]) == 0)
				{
					a[j] = " ";
				}
			}
		}
		System.out.printf("%s",a[0]);
		for (i = 1;i < n;i++)
		{
			if (strcmp((a[i])," ") != 0)
			{
				System.out.printf(",%s",a[i]);
			}
		}
	}
}

