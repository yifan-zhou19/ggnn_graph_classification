package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[50]);
		int a = 0; //?????str[50],?????????????????????a,b, ??????????????
		int b = 0;
		int i = 0; //??????i?
		int n = 1; //n??a??????1????????s???????????
		int s = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 50;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, System.in.read()); //????????????????????str[i]?
			if ((str.charAt(i) == ' ') && (i > 0))
			{
				break;
			}
		}
		i = i - 1;
		for (i;i > 0;i--) //?a???????????
		{
			if ((str.charAt(i) < 58) && (str.charAt(i)>47))
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 48);
			}
			else if ((str.charAt(i) > 64) && (str.charAt(i) < 91))
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 55);
			}
			else if (str.charAt(i) > 96)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 87);
			}
			s = s + str.charAt(i) * n;
			n = n * a;
		}

		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char c = 'A'; //????c?d??????????????????A?
		char d = 'A';
		int j = 0; //??????j,k,q????????0?10,10?
		int k = 10;
		int q = 10;
		int[] r = new int[50]; //?????r[50]???????????
		while (s >= b) //?s???b????????
		{
			r[j] = s % b;
			s = s / b;
			j++;
		}
		j = j - 1;
		if (s <= 9)
		{
			System.out.print(s);
		}
		else
		{
			for (q = 10;q < 36;q++)
			{
					if (s == q)
					{
						System.out.print(d);
						break;
					}
					d = d + 1;
			}
				d = 'A';
		}
		for (j;j >= 0;j--)
		{
			if (r[j] <= 9)
			{
				System.out.print(r[j]);
			}
			else
			{
				for (k = 10;k < 36;k++)
				{
					if (r[j] == k)
					{
						System.out.print(c);
						break;
					}
					c = c + 1;
				}
				c = 'A';
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

