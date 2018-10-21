package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int length;
		String st = new String(new char[100000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n;i++)
		{
			st = new Scanner(System.in).nextLine();
			t = 0;
			length = st.length();
			for (j = 0;j < length;j++)
			{
				t = 0;
				for (k = 0;k < length;k++)
				{
					if ((st.charAt(k) == st.charAt(j)) && (k != j))
					{
						t = 1;
						break;
					}
				}
				if (t == 0)
				{
					System.out.print(st.charAt(j));
					System.out.print("\n");
					break;
				}
			}
			if (t == 1)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}



}

