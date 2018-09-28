package <missing>;

public class GlobalMembers
{
	//***********************************************
	//*3�D�?o&#206;&#196;�&#214;&#197;&#197;�&#230;                               *
	//*D&#213;&#195;&#251;?oo&#206;&#212;&#198;&#198;e                                 *
	//*&#209;�o&#197;?o1300012888                             *
	//*�&#213;&#198;�?o2013.12.18                             *
	//***********************************************

	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[1000];
		int[] p = num;
		int sum = 0;
		char[][] word = new char[1000][40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i <= n - 1;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			p[i] = String.valueOf(word[i]).length();
		}

		for (i = 0;i <= n - 1;i++)
		{
			if (sum == 0)
			{
				sum += p[i];
				System.out.print(word[i]);
			}
			else
			{
				sum += (p[i] + 1);
				if (sum <= 80)
				{
					System.out.print(" ");
					System.out.print(word[i]);
				}
				else
				{
					sum = 0;
					i--;
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n");

		return 0;
	}
}

