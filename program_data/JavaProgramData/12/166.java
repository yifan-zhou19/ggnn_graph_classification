package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = 16;
		int i;
		int j;
		int k;
		int n = 15;
		int[] b = new int[16];
		int num = 0;
		int t = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	ahead:
	for (i = 0;i < a;i++)
	{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b[i] = Integer.parseInt(tempVar);
				}
				t++;
				if (b[i] == 0)
				{
					t--;
					break;
				}
				if (b[i] == -1)
				{
					return;
				}
				else
				{
					continue;
				}
	}
			for (i = 0;i < t;i++)
			{
				k = i;
				for (j = i;j < t;j++)
				{
					if ((b[j + 1] - 2 * b[i] == 0) || (b[i] - 2 * b[j + 1] == 0))
					{
						num = num + 1;
					}
					else
					{
						continue;
					}
				}
			}
			System.out.printf("%d\n",num);
			num = 0;
			t = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto ahead;
		return;
	}
}

