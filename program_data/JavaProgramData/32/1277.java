import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int u;
		int i;
		int Len1 = 0;
		int Len2 = 0;
		int max = 0;
		final int MAX_LEN = 100;
		int[] num1 = new int[MAX_LEN + 1];
		int[] num2 = new int[MAX_LEN + 1];
		String str1 = new String(new char[MAX_LEN + 1]);
		String str2 = new String(new char[MAX_LEN + 1]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (u = 0;u < n;u++)
		{
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
			Len1 = str1.length();
			Len2 = str2.length();
			for (i = Len1 - 1; i >= 0; i--)
			{
			num1[Len1 - 1 - i] = str1.charAt(i) - '0';
			}

			for (i = Len2 - 1; i >= 0; i--)
			{
			num2[Len2 - 1 - i] = str2.charAt(i) - '0';
			}
			if (Len1 > Len2)
			{
				max = Len1;
			}
			else
			{
			max = Len2;
			}


			for (i = 0; i < max; i++)
			{
				 num1[i] = num1[i] - num2[i];
				 if (num1[i] < 0)
				 {
					 num1[i] = num1[i] + 10;
					 num1[i + 1] = num1[i + 1] - 1;
				 }
			}
			i = MAX_LEN;
			while (num1[i] == 0)
			{
			i--;
			}

			for (; i >= 0; i--)
			{
			System.out.print(num1[i]);
			}

			System.out.print("\n");
			for (i = 0;i < MAX_LEN;i++)
			{
				num1[i] = 0;
				num2[i] = 0;
			}
			Len1 = 0;
			Len2 = 0;
			max = 0;
			if (i != n - 1)
			{
			System.in.read();
			}

		}
		return 0;
	}

}

