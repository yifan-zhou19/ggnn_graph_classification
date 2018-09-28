package <missing>;

public class GlobalMembers
{
	//2013.12.1
	//zwb

	public static int Main()
	{
		String a = new String(new char[1000]);
		char ch;
		int n;
		int i;
		int j;
		int k;
		int num = 0;
		int flag = 0;
		int mark = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n; i++)
		{
			for (j = 0; j < 1000; j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			}
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0; a.charAt(j) != '\0'; j++)
			{
				num = 0;
				flag = 0;
				mark = 0;
				ch = a.charAt(j);
				for (k = 0; a.charAt(k) != '\0'; k++)
				{
					if (a.charAt(k) == ch)
					{
						num++;
					}
					if (num == 2)
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					mark = 1;
					System.out.print(ch);
					System.out.print("\n");
					break;
				}
			}
			if (mark == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			System.in.read();
		}
		return 0;
	}


}

