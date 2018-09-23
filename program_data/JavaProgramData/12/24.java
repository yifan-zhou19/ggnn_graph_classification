package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[101];
		int[] ori = new int[15];
		int n;
		int i;
		int count;
		int tot;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != -1)
		{

			for (i = 0;i < 101;i++)
			{
				num[i] = 0;
			}
			count = 0;
			while (n != 0)
			{

				ori[count] = n;
				count++;
				num[n] = 1;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					n = Integer.parseInt(tempVar2);
				}

			}
			tot = 0;
			for (i = 0;i < count;i++)
			{
				if (ori[i] <= 50 && num[ori[i] * 2] != 0)
				{
					tot++;
				}
			}
				System.out.printf("%d\n",tot);
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n = Integer.parseInt(tempVar3);
				}


		}
		return 0;
	}

}

