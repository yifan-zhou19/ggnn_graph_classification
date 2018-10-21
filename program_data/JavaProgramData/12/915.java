package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[16];
		int n;
		int i;
		int j;
		int sum = 0;

		a[0] = 1;
		while (true)
		{
			for (i = 1;a[i - 1] != 0;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[1] == -1)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
			n = i - 1;
			for (i = 1;i < n;i++)
			{
				for (j = 1;j < n;j++)
				{
				if (i == j)
				{
					continue;
				}
				if (a[i] == 2 * a[j])
				{
					sum++;
				}
				}
			}
			System.out.printf("%d\n",sum);
			for (i = 1;i < 16;i++)
			{
			a[i] = 0;
			}
			sum = 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
	}
}

