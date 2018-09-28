package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] input = new int[n + 1];
		input[n] = 0;
		for (i = 0;i < n;i++)
		{
		   input[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n - count;i++)
		{
			 if (input[i] == k)
			 {
				for (j = i;j < n - count;j++)
				{
				   input[j] = input[j + 1];
				}
				count++;
				i = i - 1;
			 }
		}
		for (i = 0;i < n - count - 1;i++)
		{
		   System.out.print(input[i]);
		   System.out.print(" ");
		}
		System.out.print(input[n - count - 1]);

		return 0;
	}

}

