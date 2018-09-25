package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[300][41];
		int n;
		int i;
		int[] num = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int total = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = num;
		for (i = 0; i < n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (*(p + i) = 0; * (p + i) < 41; * (p + i) = (p + i) + 1)
			{
				if (word[i][*(p + i)] == '\0')
				{
					break;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			if (total == 0)
			{
				total = (p + i);
				System.out.print(word[i]);
			}
			else
			{
				total = total + *(p + i) + 1;
				if (total <= 80)
				{
					System.out.print(' ');
					System.out.print(word[i]);
				}
				else
				{
					total = (p + i);
					System.out.print("\n");
					System.out.print(word[i]);
				}
			}
		}
		return 0;
	}
}

