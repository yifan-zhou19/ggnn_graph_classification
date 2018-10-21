import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num1 = new String(new char[300]);
		String num2 = new String(new char[300]);
		int l1;
		int l2;
		int i;
		int j;
		int k;
		int[] sum = new int[300];
		while (true)
		{
			num1 = new Scanner(System.in).nextLine();
			num2 = new Scanner(System.in).nextLine();
			l1 = num1.length();
			l2 = num2.length();

			if (num1.charAt(0) == '\0')
			{
				break;
			}
			if (l1 < l2)
			{
				String huan = new String(new char[300]);
				huan = num1;
				num1 = num2;
				num2 = huan;
				int k;
				k = l1, l1 = l2, l2 = k;
			}

			//??
			for (i = l1 - 1; i >= 0; i--)
			{
				num1 = tangible.StringFunctions.changeCharacter(num1, i + 1, num1.charAt(i));
			}
			for (i = l2 - 1; i >= 0; i--)
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, i + l1 - l2 + 1, num2.charAt(i));
			}


			num1 = tangible.StringFunctions.changeCharacter(num1, 0, '0');
			for (i = 0; i <= l1 - l2; i++)
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, i, '0');
			} //?????0

			//??? (?????????????)
			for (i = l1; i >= 0; i--)
			{
				int n1;
				int n2;
				n1 = (int)(num1.charAt(i) - '0');
				n2 = (int)(num2.charAt(i) - '0');
				sum[i] = n1 + n2;
			} //?sum
			for (i = l1; i >= 0; i--)
			{
				if (sum[i] > 9)
				{
					sum[i - 1]++;
					sum[i] = sum[i] - 10;
				}
			} //??


			//??
			for (i = 0; i <= l1; i++)
			{
				if (sum[i] == 0)
				{
					continue;
				}
				else
				{
					break;
				}
			} //????0??? (?????????????????)

			if (i == l1 + 1)
			{
				System.out.print("0");
				System.out.print("\n");
			}
			else
			{
				for (j = i; j <= l1; j++)
				{
					System.out.print(sum[j]);
				}
				System.out.print("\n");
			}

		}
	return 0;
	}

}

