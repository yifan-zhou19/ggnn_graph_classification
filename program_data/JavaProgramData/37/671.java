package <missing>;

public class GlobalMembers
{
	//???????????? ???  12858
	public static int Main()
	{
		String s = new String(new char[101]); //s???????
		int l;
		int flagex;
		int flagmul;
		int i;
		int k;
		int t;
		int j;
		// l?s????
		// flagex : ?????????
		// flagmul: ???????????
		// t:????
		// i,j,k:????
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = s.length();
			flagex = 0;
			for (j = 0;j <= l - 1;j++)
			{
				flagmul = 0;
				for (k = 0;k <= l - 1;k++)
				{
					if ((j != k) && (s.charAt(j) == s.charAt(k))) //?????????
					{
						flagmul = 1;
						break;
					}
				}
				if (flagmul == 0) //???????????????????1
				{
					System.out.print(s.charAt(j));
					System.out.print("\n");
					flagex = 1;
					break;
				}
			}
			if (flagex == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

