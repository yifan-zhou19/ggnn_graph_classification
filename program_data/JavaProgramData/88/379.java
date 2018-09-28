import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[40]);
		char[][] temp = new char[40][40];
		int i;
		int j;
		int L;
		int S = 0;
		int Order = 0;
		num = new Scanner(System.in).nextLine();
		L = num.length();
		for (i = 0 ; i < L ; i++)
		{
			if ((num.charAt(i) > '9') || (num.charAt(i) < '0'))
			{
				Order++;
				for (j = S ; j < i ; j++)
				{
					temp[Order][j - S] = num.charAt(j);
				}
				temp[Order][j - S] = '\0';
				for (j = i + 1 ; j <= L ; j++)
				{
					if ((num.charAt(j) <= '9') && (num.charAt(j) >= '0'))
					{
						S = j;
						i = j - 1;
						break;
					}
					else if (num.charAt(j) == '\0')
					{
						i = L - 1;
					}
				}
			}
		}
		if ((num.charAt(L - 1) <= '9') && (num.charAt(L - 1) >= '0'))
		{
			Order++;
			for (i = S ; i < L ; i++)
			{
				temp[Order][i - S] = num.charAt(i);
			}
			temp[Order][i - S] = '\0';
		}
		for (i = 1 ; i <= Order ; i++)
		{
			System.out.print(temp[i]);
			if (i != Order)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
