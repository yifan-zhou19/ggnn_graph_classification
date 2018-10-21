package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int i;
		int n;
		int j;
		int flag;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			for (j = i - 1;j >= 0;j--)
			{
			if (a[i] == a[j])
			{
			flag = 1;
		break;
			}
		else
		{
			flag = 0;
		continue;
		}
			}
		if (flag == 0)
		{
			System.out.printf(" %d",a[i]);
		}
		}
		return 0;
	}
}

