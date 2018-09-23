package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char t;
		for (int i = 0; i < a.length();)
		{
			if (a.charAt(i) > 96)
			{
				a.charAt(i) -= 32;
			}
			t = a.charAt(i);
			int j;
			for (j = 0; ;j++)
			{
				if (a.charAt(i + j) != t && a.charAt(i + j) != t + 32)
				{
					break;
				}
			}
			System.out.print('(');
			System.out.print(t);
			System.out.print(',');
			System.out.print(j);
			System.out.print(')');
			i += j;
		}



	}


}

