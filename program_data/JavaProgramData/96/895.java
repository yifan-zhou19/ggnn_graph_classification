package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] b = new int[110];
		int temp = 0;
		if (a.length() <= 5)
		{
						int t = Integer.parseInt(a);
						System.out.print(t / 13);
						System.out.print("\n");
						System.out.print(t % 13);
						System.out.print("\n");
		} //????????
		else
		{
			 for (int i = 0;i < a.length();i++)
			 {
					temp = temp * 10 + (a.charAt(i) - '0');
					b[i] = temp / 13;
					temp = temp % 13;
			 } //????
			if (b[1] != 0)
			{
					   System.out.print(b[1]);
			}
			for (int i = 2;i < a.length();i++)
			{
					System.out.print(b[i]);
			}
			System.out.print("\n");
			System.out.print(temp);
			System.out.print("\n");
		}
		return 0;
	}

}

