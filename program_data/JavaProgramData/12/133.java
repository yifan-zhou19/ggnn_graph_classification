package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[10000];
		int i;
		int b;
		int j;
		int sum = 0;
		do
		{
			sum = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b = Integer.parseInt(tempVar);
			}
			if (b == -1)
			{
				break;
			}
			else
			{
				a[0] = b;
			}
			for (i = 1;;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				 if (a[i] == 0)
				 {
					 break;
				 }
			}
			for (i = 0;a[i] != 0;i++)
			{
				for (j = 0;a[j] != 0;j++)
				{
					if (a[j] == a[i] * 2)
					{
						sum++;
					}
				}
			}
			System.out.printf("%d\n",sum);
		} while (b != -1);
	}
}

