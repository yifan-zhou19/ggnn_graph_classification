import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int[] num = new int[100];
		int i;
		int sum;
		int rem = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			num[i] = str.charAt(i) - '0';
		}
		rem = num[0];
		for (i = 1; str.charAt(i) != '\0'; i++)
		{
			sum = rem * 10 + num[i];
			if (i != 1 || sum > 12)
			{
				System.out.print(sum / 13);
			}
			rem = sum % 13;
		}
		if (i == 1 || (i == 2 && sum <= 12))
		{
			System.out.print('0');
		}
		System.out.print("\n");
		System.out.print(rem);
		System.out.print("\n");
		return 0;
	}
}
