package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		/* initialization */
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char **r_matrix = (char **)malloc(sizeof(char *) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		char[] r_matrix = (String)malloc(sizeof(String) * n);
		for (i = 0; i < n; ++i)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			r_matrix[i] = (String)malloc((Character.SIZE / Byte.SIZE) * n);
			for (j = 0; j < n; ++j)
			{
				if (i == j)
				{
					r_matrix[i][j] = 1;
				}
				else
				{
					r_matrix[i][j] = 0;
				}
			}
		}

		/* input */
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			if (!(i != 0 || j != 0))
			{
				break;
			}
			r_matrix[i][j] = 1;
		}

		int vip = 0;
		int not_found = 0;
		for (i = 0; i < n; ++i)
		{
			if (r_matrix[vip][i] != null)
			{
				vip = i;
			}
		}

		for (i = 0; i < vip; ++i)
		{
			if (i == vip)
			{
				continue;
			}
			if (!(r_matrix[i][vip] && !r_matrix[vip][i]))
			{
				not_found = 1;
				break;
			}
		}
		if (not_found != 0)
		{
			System.out.print("NOT FOUND\n");
		}
		else
		{
			System.out.printf("%d\n", vip);
		}

		for (i = 0; i < n; ++i)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(r_matrix[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(r_matrix);
		return 0;
	}

}

