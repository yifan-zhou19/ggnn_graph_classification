package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		char[][] s = new char[10000][40]; //???????????
		int sum = 0; //??????????????????0
		for (i = 0; i < n; i++)
		{
			*(s + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0; i < n; i++)
		{
			if (sum == 0) //???????0????
			{
				System.out.print((s + i));
				sum = String.valueOf(*(s + i)).length(); //??????????????
			}
			else if (sum + String.valueOf(*(s + i)).length() + 1 <= 80) //????????????????
			{
				System.out.print(" ");
				System.out.print((s + i));
				sum = sum + String.valueOf(*(s + i)).length() + 1; //sum????
			}
			else
			{
				System.out.print("\n");
				System.out.print((s + i));
				sum = String.valueOf(*(s + i)).length(); //?????????
			}
		}
		return 0;
	}

}

