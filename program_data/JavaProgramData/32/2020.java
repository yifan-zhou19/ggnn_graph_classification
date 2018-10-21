package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 20;
		int i;
		int j;
		int x;
		int y;
		int z;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char **p=(char **)malloc(n *sizeof(char *));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		char[] p = (String)malloc(n * sizeof(String));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (p != null)
		{
			for (i = 0;i < 20;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p[i] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
			}
			for (i = 0;i < 2 * n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p[i] = tempVar2.charAt(0);
				}
				if (i % 2 == 1)
				{
					x = String.valueOf(p[i - 1]).length();
					y = String.valueOf(p[i]).length();
					for (j = x - 1;j >= 0;j--)
					{
						if (j - x + y >= 0)
						{
							z = p[i - 1][j] - p[i][j - x + y];
							if (z < 0)
							{
								p[i - 1][j] = '9' + 1 + z;
								p[i - 1][j - 1]--;
							}
							else
							{
								p[i - 1][j] = '0' + z;
							}
						}
						else
						{
							z = p[i - 1][j] - '0';
							if (z < 0)
							{
								p[i - 1][j] = '9' + 1 + z;
								p[i - 1][j - 1]--;
							}
							else
							{
								p[i - 1][j] = '0' + z;
							}
						}
					}
					for (z = 0;;z++)
					{
						if (p[i - 1][z] != '0')
						{
							break;
						}
					}
					for (j = z;j < x;j++)
					{
						System.out.printf("%c",p[i - 1][j]);
					}
					System.out.print("\n");
				}
			}
		}
	}

}

