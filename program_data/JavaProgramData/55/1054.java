package <missing>;

public class GlobalMembers
{
	//????
	//2010?11?16?
	//1000012753 ???
	public static int Main()
	{
		String str1 = new String(new char[200]);
		char[] stdard = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int i;
		int j;
		int l1;
		int l2;
		int l3;
		int r;
		int[] str2 = new int[200];
		double a;
		double b;
		double medium = 0.0;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		l1 = str1.length();
		for (i = 0; i < l1; i++)
		{
			if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
			{
				str1.charAt(i) -= 'a' - 'A';
			}
		}
		j = 0;
		for (i = l1 - 1; i >= 0; i--)
		{
			str2[j++] = str1.charAt(i);
		}
		for (i = 0; i < l1; i++)
		{
			for (j = 0; j < 36; j++)
			{
				if (str2[i] == stdard[j])
				{
					medium += j * Math.pow(a, i);
				}
			}
		}
	//	cout << medium;
		j = 0;
		while ((int)medium >= (int)b)
		{
			str2[j++] = (int)medium % (int)b;
			medium = (int)medium / (int)b;
		}
		str2[j] = (int)medium;
		for (; j >= 0; j--)
		{
			System.out.print(stdard[str2[j]]);
		}
		System.out.print("\n");

	//	itoa(medium, buf, (int)b);

	/*	l2 = strlen(buf);
		r = 0;
		for (i = 0; i < l2; i++)
		{
			r = ((r * 10) + buf[i] - '0') % (int)b;
			for (j = 0; j < 36; j++)
			{
				if (j == r)
				{
					str2[i] = stdard[j];
					break;
				}
			}
		}
		str2[i] = '\0';
		l3 = strlen(str2);
		for (i = l3 - 1; i >= 0; i--)
			cout << str2[i];
		cout << endl;*/
		return 0;
	}

}

