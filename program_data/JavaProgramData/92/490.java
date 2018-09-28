package <missing>;

public class GlobalMembers
{
	public static int[] thorse = new int[1002];
	public static int[] qhorse = new int[1002];
	public static int[] match = new int[1002];
	public static int compare(Object p1, Object p2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=(int *) p1;
		int p = (int) p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q = (int *)p2;
		int q = (int)p2;
		return (q) - p;
	}
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(thorse,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(qhorse,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(match,0,(Integer.SIZE / Byte.SIZE));
			for (int i = 0;i < n;i++)
			{
				thorse[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;i++)
			{
				qhorse[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(thorse,n,(Integer.SIZE / Byte.SIZE),compare);
			qsort(qhorse,n,(Integer.SIZE / Byte.SIZE),compare);
			int fast = 0;
			int slow = n - 1;
			int head = 0;
			int tail = n - 1;
			int win = 0;
			int lose = 0;
			while (fast <= slow)
			{
				if (thorse[tail] > qhorse[slow])
				{
					match[slow] = tail;
					slow--;
					tail--;
				}
				else if (thorse[tail] < qhorse[slow])
				{
					match[fast] = tail;
					fast++;
					tail--;
				}
				else
				{
					if (thorse[head] > qhorse[fast])
					{
						match[fast] = head;
						fast++;
						head++;
					}
					else
					{
						match[fast] = tail;
						tail--;
						fast++;
					}
				}
			}
			for (int i = 0;i < n;i++)
			{
				if (qhorse[i] > thorse[match[i]])
				{
					lose++;
				}
				else if (qhorse[i] < thorse[match[i]])
				{
					win++;
				}
			}
			int money = win * 200 - 200 * lose;
			System.out.print(money);
			System.out.print("\n");
		}
		return 0;
	}
}

