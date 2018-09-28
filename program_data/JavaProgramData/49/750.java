package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		int i;
		int j;
		int m;
		int n;
		int k;
		int length;
		int flag;
		  //???????????????????????????
		 str = ConsoleInput.readToWhiteSpace(true).charAt(0);

		 length = str.length(); //?????

		 for (i = 2; i <= length; i++) //???????????
		 {
			for (j = 0; j <= length - i; j++) //???????????
			{
				flag = 1;
				for (m = j, n = j + i - 1; m < n; m++, n--)
				{
					if (str.charAt(m) != str.charAt(n))
					{
						flag = 0;
						break;
					}
				}

				if (flag != 0)
				{
					for (k = j; k <= j + i - 1; k++)
					{
						System.out.print(str.charAt(k));
					}
					System.out.print("\n");
				}
			}
		 }

			return 0;
	}

}

