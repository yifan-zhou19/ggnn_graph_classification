package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[PI];
		int i;
		int j;
		int num;
		int n;
		n = 0;
		for (i = 0;i < 15;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			n++;
			if (a[i] == 0 || a[i] == -1)
			{
				n--;
				break;
			}
		}

		do
		{

		num = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] == 2 * a[i] || a[j] * 2 == a[i])
				{
					num++;
				}
			}
		}
		System.out.printf("%d\n",num);

		n = 0;
		for (i = 0;i <= 15;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			n++;
			if (a[i] == 0 || a[i] == -1)
			{
				n--;
				break;
			}
		}
		} while (a[0] != -1);


		return 0;
	}
}

