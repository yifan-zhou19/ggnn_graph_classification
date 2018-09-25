package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		char[] word = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String p = word; //???????word
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 //???????
		p = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sum += p.length(); //sum????????
		System.out.print(p);
				 //?????n-1???
		for (int i = 1;i < n;i++)
		{
			p = ConsoleInput.readToWhiteSpace(true).charAt(0);
			sum += p.length() + 1; //???,?????1
			if (sum > 80) //??80???
			{
				System.out.print("\n");
				System.out.print(p);
				sum = p.length(); //?????????
			}
			else
			{
				System.out.print(' ');
				System.out.print(p);
			}
		}
		return 0;
	}



}

