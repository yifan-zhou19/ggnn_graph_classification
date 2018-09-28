package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int sum;
		int k;
		int l;
		char c;
		String alphabet = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //??????
		for (i = 0;i < t;i++) //??t???
		{
			c = System.in.read();
			for (sum = 0;c != '\n';sum++)
			{
				alphabet = tangible.StringFunctions.changeCharacter(alphabet, sum, c);
				c = System.in.read();
			} //???????????????
			for (k = 0;k < (sum - 1);) //???????
			{
				for (l = 0;l < sum;)
				{
					if (k == l)
					{
						l = l + 1;
					}
					if (alphabet.charAt(k) == alphabet.charAt(l))
					{
						l = sum + 1; //????????????
					}
					l += 1;
				}
				if (l == sum)
				{
					System.out.print(alphabet.charAt(k));
					System.out.print("\n");
					k = sum;
				}
				k = k + 1;
			}
			if (k == (sum - 1))
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

