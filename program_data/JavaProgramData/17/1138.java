package <missing>;

public class GlobalMembers
{
	public static void braket_match(tangible.RefObject<String> s)
	{
		System.out.printf("%s\n",s.argValue);
		int j;
		int[] left = {-1, -1};
		int left_num = 0;
		int left0 = 1;
		int[] right = {-1, -1};
		int right_num = 0;
		int right0 = 1;
		int LEN = s.argValue.length();
		for (j = 0;j < LEN;j++)
		{
			if (s.argValue.charAt(j) == '(')
			{
				left[++left_num] = j;
			}
			else if (s.argValue.charAt(j) == ')' && left_num == 0)
			{
				right[++right_num] = j;
			}
			else if (s.argValue.charAt(j) == ')' && left_num > 0)
			{
				left[left_num--] = -1;
			}
		}
		for (j = 0;j < LEN;j++)
		{
			if (j == left[left0])
			{
				System.out.print("$");
				left0++;
			}
			else if (j == right[right0])
			{
				System.out.print("?");
				right0++;
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		int n;
		int i;
		String tmp = new String(new char[MAXLEN]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			tmp = new Scanner(System.in).nextLine();
		tangible.RefObject<String> tempRef_tmp = new tangible.RefObject<String>(tmp);
			braket_match(tempRef_tmp);
			tmp = tempRef_tmp.argValue;
		}
		return 0;
	}
}

