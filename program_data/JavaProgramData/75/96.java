package <missing>;

public class GlobalMembers
{
	//?????
	public static int Main()
	{
		int[] start = new int[1001];
		int[] end = new int[1001];
		int max = 0;
		int[] num = new int[1001];
		int sum = 1;
		int i = 1;
		int j = 1;
		int a;
		char x;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(start,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(end,0,(Integer.SIZE / Byte.SIZE));
		start[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((x = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			if (x != ',')
			{
				break;
			}
			start[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			sum++;
		}
		end[0] = x - '0';
		while ((x = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		  if (x == ',')
		  {
			  break;
		  }
		  end[0] = 10 * end[0] + (x - '0');
		}
		while ((end[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			j++;
			if (j == sum)
			{
				break;
			}
			x = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0; i < sum;i++)
		{
			for (a = start[i];a < end[i];a++)
			{
				num[a]++;
			}
		}
		for (i = 0;i <= 1000;i++)
		{
			if (max < num[i])
			{
				max = num[i];
			}
		}
		System.out.print(sum);
		System.out.print(" ");
		System.out.print(max);

	return 0;
	}
}

