package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		do
		{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
			int p;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (int) malloc((Integer.SIZE / Byte.SIZE) * n);

			int i = 0;
			for (i = 0 ; i < n ; i++)
			{
				*(p + i) = 1;
			}
			int count = 0;
			int count2 = n;
			i = 0;
			do
			{
				if (*(p + i) != 0)
				{
					count++;
					if (count == m)
					{
						//printf("%d\n",i);
						count2--;
						count = 0;
						*(p + i) = 0;
					}
				}
				if (i < n - 1)
				{
					i++;
				}
				else
				{
					i = 0;
				}
				//printf("%d\n",i);
			}while (count2 > 1);
			i = 0;
			do
			{
				if (*(p + i) == 1)
				{
					System.out.printf("%d\n",i + 1);
					break;
				}
				i++;
			}while (i < n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p);
		}while (n > 0);
		return 0;
	}
}

