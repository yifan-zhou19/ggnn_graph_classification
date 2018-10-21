package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int flag;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				System.out.printf("%d",a[0]);
			}
			for (j = 0;j < i;j++)
			{

				if (a[i] == a[j])
				{
					flag = 0;
					break;
				}
				else
				{
					flag = 1;
				}
			}
			if (flag == 1)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}


}

