package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int cal = 0;
		int enter = 1;
		int num = 0;
		int[] a = new int[100001];
		int[] b = new int[100001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= num;j++)
			{
				if (a[i] == b[j])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto next;
					break;
				}
			}
			if (enter == 1)
			{
				System.out.printf("%d",a[i]);
				enter = 0;
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
			num++;
			b[num] = a[i];
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	next:
			b[0] = 0;
		}
		return 0;
	}
}

