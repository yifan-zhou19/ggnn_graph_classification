package <missing>;

public class GlobalMembers
{
	//???2010?11?24?
	//???1000010586_???
	//????????

	public static int Main()
	{
		int[] start = new int[1000];
		int[] end = new int[1000];
		int i;
		int j;
		int k;
		int num = 1;
		int max = 0;
		int min = 1000;
		int flag;
		int M = 0;
		start[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 min = start[0];
		while (System.in.read() == ',')
		{
			start[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (start[num] < min)
			{
				min = start[num];
			}
			num++;
		}
		end[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 max = end[0];
		for (i = 1 ; i <= num - 1 ; i++)
		{
			System.in.read();
			end[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (end[i] > max)
			{
				max = end[i];
			}
		}
		for (j = min ; j <= max - 1 ; j++)
		{
			flag = 0;
			for (k = 0 ; k <= num - 1 ; k++)
			{
				if (j >= start[k] != 0 && j < end[k])
				{
					flag++;
				}
			}
			if (flag > M)
			{
				M = flag;
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(M);
		System.out.print("\n");
		return 0;
	}




}

