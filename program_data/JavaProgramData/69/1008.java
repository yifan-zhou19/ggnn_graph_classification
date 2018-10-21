import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		int i;
		int len1;
		int len2;
		int j;
		int[] sum = new int[1000];
		int max;
		int[] num1 = new int[1000];
		int[] num2 = new int[1000];
		int hash = 0;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		len1 = s1.length();
		len2 = s2.length();
		for (i = 0; i < len1; i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, s1.charAt(len1 - 1 - i));
			num1[i] = (int)(str1.charAt(i) - '0');
		}
		for (i = 0; i < len2; i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, s2.charAt(len2 - 1 - i));
			num2[i] = (int)(str2.charAt(i) - '0');
		}
		if (len1 >= len2)
		{
			max = len1;
		}
		else
		{
			max = len2;
		}
		for (i = 0; i < max; i++)
		{
			sum[i] += num1[i] + num2[i];
			if (sum[i] >= 10)
			{
				sum[i + 1] += 1;
				sum[i] -= 10;
			}
		}
		while (sum[max] != 0)
		{
			max++;
		}
		while ((max > 1) && (sum[max - 1] == 0))
		{
			max--;
		}
		for (i = max - 1; i >= 0; i--)
		{
			System.out.print(sum[i]);
		}
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

