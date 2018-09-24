package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int j;
		int[] bit = new int[5];
		i = 1;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 if (num == 0)
			 {
				  System.out.print(0);
				  return 0;
			 }
		while (num > 0)
		{
			bit[i] = num % 10;
			num = num / 10;
			i = i + 1;
		}
		for (j = 1;j < i;j++)
		{
			System.out.print(bit[j]);
		}
		return 0;
	}
}

