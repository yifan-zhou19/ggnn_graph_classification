package <missing>;

public class GlobalMembers
{
	//?????



	public static int Main()
	{
		int[] start = new int[1000];
		int[] end = new int[1000];
		int n;
		int[] number = new int[1000];
		int max = 0;
		for (int i = 0;;i++) //??????????
		{
			char c;
			start[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			if (c != ',')
			{
				n = i + 1;
				break;
			}
		}
		end[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i < n;i++)
		{
			char c;
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			end[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++) //?????????
		{
			for (int j = start[i];j < end[i];j++)
			{
				number[j] += 1;
			}
		}
		for (int i = 0;i < 1000;i++) //??????
		{
			if (number[i] > max)
			{
				max = number[i];
			}
		}
		System.out.print(n);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

