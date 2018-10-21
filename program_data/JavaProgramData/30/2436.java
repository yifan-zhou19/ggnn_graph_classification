package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double sum;
		sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				sum = sum;
			} //??7???
			else if ((i - 7) % 10 == 0)
			{
				sum = sum;
			} //?????7??
			else if (i / 10 == 7)
			{
				sum = sum;
			} //?????7??
			else
			{
				sum = sum + i * i; //?????????
			}
		}
		System.out.print(sum);
		System.out.print("\n");
	}
}

