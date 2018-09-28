package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String[] map;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		map = (String)malloc(n * sizeof(String));
		for (i = 0; i < n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			map[i] = (String)malloc(n * (Character.SIZE / Byte.SIZE));
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (i == j)
				{
					map[i][j] = 1;
				}
				else
				{
					map[i][j] = 0;
				}
			}
		}
		while (scanf("%d %d", i, j) && i + j != 0)
		{
			map[i][j] = 1;
		}

		k = 0;
		for (j = 1; j < n; j++)
		{
			if (map[k][j] == 1)
			{
				k = j;
			}
		}
		for (i = 0; i < k; i++)
		{
			if (map[i][k] == 0 || map[k][i] == 1)
			{
				System.out.print("NOT FOUND");
				for (i = 0; i < n; i++)
				{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(map[i]);
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(map);
				return 0;
			}
		}
		System.out.printf("%d", k);
		for (i = 0; i < n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(map[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(map);
		return 0;
	}
}

