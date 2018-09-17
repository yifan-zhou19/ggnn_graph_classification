package <missing>;

public class GlobalMembers
{
	//??.c 

	public static int Main()
	{
		int data;
		int[] a = new int[15];
		int i = 0;
		int j;
		int k;
		while (scanf("%d", data) != EOF)
		{
			if (data == -1)
			{
				break;
			}
			else
			{
				if (data != 0)
				{
					a[i] = data;
					i++;
				}
				else
				{
					int tmp;
					for (j = 0;j < i;j++)
					{
						for (k = j + 1;k < i;k++)
						{
							if (a[j] > a[k])
							{
								tmp = a[k];
								a[k] = a[j];
								a[j] = tmp;
							};
						}
					} //??
					int cnt = 0;
					for (j = 0;j < i;j++)
					{
						for (k = j + 1;k < i;k++)
						{
							if (a[j] * 2 == a[k])
							{
								cnt++;
								break;
							}
							if (a[j] * 2 < a[k])
							{
								break;
							}
						}
					}
					System.out.printf("%d\n",cnt);
					cnt = 0;
					i = 0;
				}
			}
		}
		return 0;
	}
}
