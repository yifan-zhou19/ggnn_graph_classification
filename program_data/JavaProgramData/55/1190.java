package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int mid = 0;
		String out = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		System.in.read();
		char tempC;
		int temp;
		while ((tempC = System.in.read()) != ' ')
		{

			if (tempC >= '0' && tempC <= '9')
			{
				temp = tempC - '0';
			}
			else if (tempC >= 'a' && tempC <= 'z')
			{
				temp = tempC - 'a' + 10;
			}
			else if (tempC >= 'A' && tempC <= 'Z')
			{
				temp = tempC - 'A' + 10;
			}
			mid *= a;
			mid += temp;
		}

		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		while (mid > 0)
		{
			temp = mid % b;
			if (temp > 9)
			{
				tempC = temp - 10 + 'A';
			}
			else
			{
				tempC = temp + '0';
			}
			out = tangible.StringFunctions.changeCharacter(out, i, tempC);
			++i;
			mid /= b;
		}
		if (i == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			for (j = i - 1;j >= 0;--j)
			{
				System.out.print(out.charAt(j));
			}
			System.out.print("\n");
		}
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

