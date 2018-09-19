package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int[] m = new int[20002];
		int i = 1;
		int a = 2;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}while (i <= n);
		if (n == 1)
		{
			System.out.printf("%d",m[1]);
		}
		else
		{
			System.out.printf("%d",m[1]);
			do
			{
				b = 1;
				do
				{
					num = 0;
					if (m[b] == m[a])
					{
						num++;
						break;
					}
					else
					{
						b++;
					}
				}while (b < a);
				if (num == 0)
				{
					System.out.printf(" %d",m[a]);
				}
				else
				{
				}
				a++;
			}while (a <= n);
		}
		return 0;
	}

}

