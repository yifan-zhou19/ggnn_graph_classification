package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int num;
		int[] a = new int[16];
		int c;
		while (true)
		{
			i = 0;
			num = 0;
		do
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				c = a[i];
				i++;
		} while (c != 0 && c != -1);


			if (a[0] == -1)
			{
				break;
			}

			for (j = 0;j < i - 1;j++)
			{
				   for (k = 0;k < i - 1;k++)
				   {
				if (a[j] == 2 * a[k])
				{
					num++;
				}
				   }
			}

				System.out.printf("%d\n",num);

		}
		return 0;
	}

}

