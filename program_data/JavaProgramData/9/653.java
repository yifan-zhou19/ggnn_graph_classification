package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int temp;
		int s;
		int max;
			 int is_over_sixty_exist = 1;
		int[] age = new int[100];
		int[] queue = new int[100];
		char[][] id =
		{
			{'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			queue[i] = i;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}
		i = 0;
		while (is_over_sixty_exist != 0)
		{
			max = 0;
			is_over_sixty_exist = 0;
			temp = queue[i];
			for (j = 0;j < n;j++)
			{
				if (age[j] >= 60 && age[j] > max)
				{
					is_over_sixty_exist = 1;
					max = age[j];
					queue[i] = j;
				}
			}
			for (s = i + 1;s < n;s++)
			{
				if (queue[s] == queue[i])
				{
					break;
				}
			}
			age[queue[i]] = 0;
			if (is_over_sixty_exist != 0)
			{
				if (s != n)
				{
					for (k = s;k >= i + 1;k--)
					{
						queue[k] = queue[k - 1];
					}
					queue[i + 1] = temp;
				}
			}
			i++;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",id[queue[i]]);
		}
	}

}

