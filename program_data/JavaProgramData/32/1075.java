import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num1 = new String(new char[200]);
		String num2 = new String(new char[200]);
		int[] result = new int[200];
		int n;
		int i;
		int j;
		int k;
		int flag = 0;
		int len1;
		int len2;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= n;i++)
		{
			System.in.read();
			num1 = new Scanner(System.in).nextLine();
			num2 = new Scanner(System.in).nextLine();

			len1 = num1.length();
			len2 = num2.length();


			for (j = len1 - 1,k = len2 - 1;j >= 0;j--,k--)
			{
				if (k >= 0)
				{
					if (flag == 1)
					{
						num1.charAt(j) -= 1;
						flag = 0;
					}
					if (num1.charAt(j) < num2.charAt(k))
					{
						num1.charAt(j) += 10;
						flag = 1;
					}
					result[j] = num1.charAt(j) - num2.charAt(k);
				}

				else
				{
					if (flag == 1)
					{
						num1.charAt(j) -= 1;
						flag = 0;
					}
					result[j] = num1.charAt(j) - '0';
				}
			}

			for (j = 0;j < len1;j++)
			{
				if (result[j] != 0)
				{
					flag = 1;
				}
				if (result[j] == 0 && flag == 0)
				{
					continue;
				}
				else
				{
					System.out.print(result[j]);
				}
			}
			System.out.print("\n");

			flag = 0;
		}


		return 0;
	}
}

