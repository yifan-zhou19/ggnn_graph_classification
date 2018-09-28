package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int[] c = new int[100];
		int i;
		int j = 0;
		int sum = 0;
		int q;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			sum = sum + 100;
			j++;
			if (sum > a)
			{
				j--;
				sum = sum - 100;
				break;
			}
		}
		System.out.print(j);
		System.out.print("\n");
		j = 0;
	while (true)
	{
			sum = sum + 50;
			j++;
			if (sum > a)
			{
				j--;
				sum = sum - 50;
				break;
			}
	}
	System.out.print(j);
	System.out.print("\n");
		j = 0;
		while (true)
		{
			sum = sum + 20;
			j++;
			if (sum > a)
			{
				j--;
				sum = sum - 20;
				break;
			}
		}
	System.out.print(j);
	System.out.print("\n");
		j = 0;
		while (true)
		{
			sum = sum + 10;
			j++;
			if (sum > a)
			{
				j--;
				sum = sum - 10;
				break;
			}
		}
	System.out.print(j);
	System.out.print("\n");
		j = 0;
		while (true)
		{
			sum = sum + 5;
			j++;
			if (sum > a)
			{
				j--;
				sum = sum - 5;
				break;
			}
		}
	System.out.print(j);
	System.out.print("\n");
		j = 0;
		while (true)
		{
			sum = sum + 1;
			j++;
			if (sum > a)
			{
				j--;
				sum = sum - 1;
				break;
			}
		}
	System.out.print(j);
	System.out.print("\n");
		return 0;
	}


}

