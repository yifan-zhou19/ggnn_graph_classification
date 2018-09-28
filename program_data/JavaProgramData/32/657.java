package <missing>;

public class GlobalMembers
{
	/*
	 *??? 
	 *2010 - 11 - 18 
	 *?????1 - ????? 
	 */
	public static int Main()
	{
		int m;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1; m <= n; m++)
		{
			String str1 = new String(new char[100]);
			String str2 = new String(new char[100]);
			str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int[] num1 = new int[100];
			int[] num2 = new int[100];
			int l1;
			int l2;
			int i;
			int j;
			l1 = str1.length();
			l2 = str2.length();
			for (i = l1 - 1, j = 0; i >= 0; i--) //???????int???????????
			{
				num1[j] = str1.charAt(i) - '0';
				j++;
			}
			for (i = l2 - 1, j = 0; i >= 0; i--)
			{
				num2[j] = str2.charAt(i) - '0';
				j++;
			}
			for (i = 0; i < l2; i++) //????
			{
				num1[i] = num1[i] - num2[i];
			}
			for (i = 0; i < l1; i++) //???????????1
			{
				if (num1[i] < 0)
				{
					 num1[i] += 10;
					 num1[i + 1] -= 1;
				}
			}
			if (num1[l1 - 1] != 0) //???????????????
			{
			   for (i = l1 - 1; i >= 0; i--)
			   {
				   System.out.print(num1[i]);
			   }
			}
			else
			{
				for (i = l1 - 2; i >= 0; i--)
				{
					System.out.print(num1[i]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

