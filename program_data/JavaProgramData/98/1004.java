import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //?????????
		char[][] text = new char[1000][45];
		for (i = 0; i < n - 1; i++)
		{
			for (k = 0; k < 40; k++)
			{
				*(*(text + i) + k) = System.in.read();
				if (*(*(text + i) + k) == ' ')
				{
					*(*(text + i) + k + 1) = '\0';
					break; //???n-1???
				}
			}
		}
		*(text + n - 1) = new Scanner(System.in).nextLine(); //????????????????
		for (i = 0; i < n; i++)
		{
			sum = sum + String.valueOf(*(text + i)).length(); //?????????80
			if (sum - 1 > 80)
			{
				System.out.print("\n");
				sum = String.valueOf(*(text + i)).length();
			}
			k = 0;
			while (true)
			{
				if (i != n - 1)
				{
				if (*(*(text + i) + k) != ' ')
				{
					System.out.print((*(text + i) + k));
					k = k + 1; //?????
				}
				else
				{
					if (sum + String.valueOf(*(text + i + 1)).length() - 1 <= 80)
					{
						System.out.print(" ");
					}
					break; //???????????????
				}
				}
				if (i == (n - 1))
				{
					if (*(*(text + i) + k) != '\0')
					{
						System.out.print((*(text + i) + k));
						k = k + 1;
					}
					else
					{
						break; //??????????????????
					}
				}
			}
		}
		return 0;
	}

}

