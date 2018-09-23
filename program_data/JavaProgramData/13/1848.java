package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s = 0;
		int[] a = new int[20000];
		int sign;
		int[] b = new int[20000];
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
			sign = 0;
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					sign = sign + 1;
				}
			}
			if (sign == 0)
			{
				b[s] = a[i];
				s++;
			}
		}
		for (i = 0;i < s;i++)
		{
			if (i != s - 1)
			{
				(System.out.printf("%d ",b[i]));
			}
					else
					{
						System.out.printf("%d",b[i]);
					}
		}
		return 0;
	}




}

