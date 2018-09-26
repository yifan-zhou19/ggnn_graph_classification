package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p3;
		int p3;
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		char[][] str1 = new char[100][100];
		char[][] str2 = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			scanf("\n");
			str1[i] = new Scanner(System.in).nextLine();
			str2[i] = new Scanner(System.in).nextLine();

		}
		for (i = 0;i < n;i++)
		{
			p1 = x;
			p2 = y;
			for (j = 0;j < String.valueOf(str1[i]).length();j++,p1++)
			{
				p1 = str1[i][j] - '0';
			}
			for (j = 0;j < String.valueOf(str2[i]).length();j++,p2++)
			{
				p2 = str2[i][j] - '0';
			}
			for (p1 = p1 - 1,p2 = p2 - 1,p3 = z;p2 >= y;p1--,p2--,p3++)
			{
				if (p1 >= p2)
				{
					p3 = p1 - p2;
				}
				else
				{
					p3 = (p1 + 10) - p2;
					for (j = 1;;j++)
					{
						if (*(p1 - j) > 0)
						{
							break;
						}
					}
					*(p1 - j) = *(p1 - j) - 1;
					if (j > 1)
					{
						for (j = j - 1;j > 0;j--)
						{
						  *(p1 - j) = 9;
						}
					}
				}
			}
			for (;p1 >= x;p1--,p3++)
			{
				p3 = p1;
			}
			for (p3 = p3 - 1;p3 >= z;p3--)
			{
				System.out.printf("%d", p3);
			}
			System.out.print("\n");
		}
	}



}

