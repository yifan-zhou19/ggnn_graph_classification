import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[81]);
		int n = 0;
		int i = 0;
		int j = 0;
		int J = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int sum4 = 0;
			int p = 0;
			for (j = 0;str.charAt(j) != '\0';j++)
			{
				J = j;
			}
			for (j = 0;j <= J;j++)
			{
				sum1 = (str.charAt(j) == 95);
				sum2 = (str.charAt(j) >= 65 && str.charAt(j) <= 90);
				sum3 = (str.charAt(j) >= 97 && str.charAt(j) <= 122);
				sum4 = (str.charAt(j) >= 48 && str.charAt(j) <= 57);
				if (sum1 + sum2 + sum3 + sum4 == 0)
				{
					p++;
				}
			}

				sum1 = (str.charAt(0) == 95);
				sum2 = (str.charAt(0) >= 65 && str.charAt(j) <= 90);
				sum3 = (str.charAt(0) >= 97 && str.charAt(j) <= 122);
				if (sum1 + sum2 + sum3 == 0 || p != 0)
				{
					System.out.print(0);
					System.out.print("\n");
				}
				if (sum1 + sum2 + sum3 != 0 && p == 0)
				{
					System.out.print(1);
					System.out.print("\n");
				}

		}
		return 0;
	}


}

