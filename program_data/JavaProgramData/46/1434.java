package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int col;
		int row;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *org;
		int org;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int m;
		int n;
		int count = 0;
		int total;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		org = (int)malloc(row * col * (Integer.SIZE / Byte.SIZE));
		p = org;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + i * col + j = Integer.parseInt(tempVar3);
				}
			}
		}
			total = row * col;
			i = 0;
			j = 0;

		do
		{
			m = i;
			n = j;
			for (;n < col - j;n++)
			{
				System.out.printf("%d\n",*(p + m * col + n));
				count++;
			}
			n--;
			if (count == total)
			{
				break;
			}
			for (m = i + 1;m < row - i;m++)
			{
				System.out.printf("%d\n",*(p + m * col + n));
				count++;
			}
			m--;
			if (count == total)
			{
				break;
			}
			for (n = n - 1;n >= j;n--)
			{
				System.out.printf("%d\n",*(p + m * col + n));
				count++;
			}
			n++;
			if (count == total)
			{
				break;
			}
			for (m = m - 1;m >= i + 1;m--)
			{
				System.out.printf("%d\n",*(p + m * col + n));
				count++;
			}
			m++;
			if (count == total)
			{
				break;
			}
			j++;
			i++;
		}while (1 != 0);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(org);
	}

}

