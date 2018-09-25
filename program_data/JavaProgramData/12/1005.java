package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sc = new int[300];
		int[] ao = new int[16];
		int i;
		int j;
		int k;
		int l;
		int n;
		int b;
		int x;
		int m;
		i = 0;
		j = 0;
		k = 0;
		l = 0,x = 0;
		do
		{
			n = 1;
			for (i = 0;i < 16;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				ao[i] = Integer.parseInt(tempVar);
			}
			if (ao[i] == 0 || ao[i] == -1)
			{
				n = i;
				break;
			}
			}
		i = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (ao[i] * 2 == ao[j])
				{
					 k++;
				}
			}
		}
		sc[l] = k;
		k = 0;
		l++;
		} while (n != 0);
		for (x = 0;x < l - 1;x++)
		{
			System.out.printf("%d\n",sc[x]);
		}
		return 0;
	}
}

