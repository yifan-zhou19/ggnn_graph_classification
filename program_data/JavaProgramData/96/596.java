package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int k;
		int count = 0;
		int[] product = new int[100];
		int remainder;
		int numerator;
		int left = 0;
		char[] num = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		do
		{
			cin.get(num[i]);
			i++;
		} while (num[i - 1] != '\n');
		for (j = i - 2; j >= 0; j -= 6)
		{
			count += (num[j] - 48);
		}
		for (j = i - 3; j >= 0; j -= 6)
		{
			count += (num[j] - 48) * 10;
		}
		for (j = i - 4; j >= 0; j -= 6)
		{
			count += (num[j] - 48) * 100;
		}
		for (j = i - 5; j >= 0; j -= 6)
		{
			count -= (num[j] - 48);
		}
		for (j = i - 6; j >= 0; j -= 6)
		{
			count -= (num[j] - 48) * 10;
		}
		for (j = i - 7; j >= 0; j -= 6)
		{
			count -= (num[j] - 48) * 100;
		}
		remainder = count % 13;
		numerator = (num[0] - 48) * 10 + (num[1] - 48);
		for (k = 0; k < i - 2; k++)
		{
			product[k] = Math.floor(numerator / 13);
			left = numerator - 13 * product[k];
			numerator = left * 10 + (num[k + 2] - 48);
		}
		if ((product[0] == 0) && (product[1] == 0))
		{
			System.out.print("0");
			System.out.print("\n");
		}
		if (product[0] != 0)
		{
			System.out.print(product[0]);
			for (k = 1; k < i - 2; k++)
			{
				System.out.print(product[k]);
			}
			System.out.print("\n");
		}
		if ((product[0] == 0) && (product[1] != 0))
		{
			for (k = 1; k < i - 2; k++)
			{
				System.out.print(product[k]);
			}
			System.out.print("\n");
		}
		System.out.print(remainder);
		System.out.print("\n");
		return 0;
	}
}
