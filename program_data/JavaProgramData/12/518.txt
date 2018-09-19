package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int t = -1;
		int s = 0;
		int[] a = new int[10000];
		for (i = 0;i <= 10000;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] == -1)
			{
				break;
			}
			else if (a[i] == 0)
			{
				t = i;
				System.out.printf("%d\n",s);
				s = 0;
			}
			else
			{
				for (j = t + 1;j < i;j++)
				{
					if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
					{
						s = s + 1;
					}
				}

			}
		}




	}
}

