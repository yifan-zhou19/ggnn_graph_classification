package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[15];
		int s;
		int i;
		int j;
		int k;
		int flag = 1;
		while (flag != 0)
		{
			s = 0;
			for (i = 0;i < 16;i++)
			{ //????????????0
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			k = i; //??k?????
			if (a[i] == -1)
			{
				flag = 0;
				break;
			}
			if (a[i] == 0)
			{
				break;
			}
			}
			if (flag != 0)
			{
			for (i = 0;i < k;i++)
			{
				for (j = 0;j < k;j++)
				{
					if (a[i] == 2 * a[j])
					{
						s++;
					}
				} //?????????????
			}
				System.out.printf("%d\n",s);
			}
		}
		return 0;
	}
}

