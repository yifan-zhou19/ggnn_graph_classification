import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum1 = 0;
		int sum2 = 0;
		int len1 = 0;
		int len2 = 0;
		int i;
		int[] a = new int[60];
		int[] b = new int[60];
		String str1 = new String(new char[60]);
		String str2 = new String(new char[60]);
		str1 = new Scanner(System.in).nextLine();

		str2 = new Scanner(System.in).nextLine();
		len1 = str1.length();
		len2 = str2.length();
		for (i = 0;i < len1;i++)
		{
			a[i] = (int)str1.charAt(i);
			if (a[i] >= 65 && a[i] <= 90)
			{
				a[i] += 32;
			}
			sum1 += a[i];
		}
		for (i = 0;i < len2;i++)
		{
			b[i] = (int)str2.charAt(i);
			if (b[i] >= 65 && b[i] <= 90)
			{
				b[i] += 32;
			}
			sum2 += b[i];
		}

		if (sum1 > sum2)
		{
			System.out.print(">");
		}
		else if (sum1 < sum2)
		{
			System.out.print("<");
		}
		else if (sum1 = sum2)
		{
			System.out.print("=");
		}
		int h;
		h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;


	}

}

