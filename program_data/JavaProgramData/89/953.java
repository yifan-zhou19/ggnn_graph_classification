package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[1000000];
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int count = 0;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i + j == 0)
			{
				break;
			}
			else
			{
				num[j]++;
			}
		}while (1 != 0);
		p = num;
		while (count < n)
		{
			if (p == n - 1)
			{
				System.out.print(count);
				flag = 1;
				break;
			}
			else
			{
				p++;
				count++;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}

		return 0;
	}
}

