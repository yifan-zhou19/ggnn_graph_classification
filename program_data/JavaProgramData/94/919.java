package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N; //num?????N???b[100]???????count??????
		int num;
		int[] b = new int[500];
		int i;
		int j = 0;
		int count = 0;
		int temp = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num % 2 != 0)
			{
				b[j] = num;
				j++;
				count++;
			}
		} //???????????????
		for (j = 0;j < count - 1;j++)
		{
			for (i = 0;i < count - j - 1;i++)
			{
				if (b[i] > b[i + 1])
				{
					temp = b[i];
					b[i] = b[i + 1];
					b[i + 1] = temp;
				}
			} //????
		}
		for (i = 0;i < count - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(",");
		}
		System.out.print(b[count - 1]);
		return 0;
	}
}

