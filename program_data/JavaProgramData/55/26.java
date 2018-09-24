package <missing>;

public class GlobalMembers
{
	//????

	public static int Main()

	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		String a = new String(new char[33]);
		int[] b = new int[33];
		int mid;
		int ar;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < 33;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 48);
			b[i] = -1;
		}

		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		i = 0;

		while (a.charAt(i) != '\0')
		{
			i++;
		}
		a = tangible.StringFunctions.changeCharacter(a, i, 48);
		k = 33 - i;
		for (l = 0;l < i;l++)
		{
			a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(l));
			a = tangible.StringFunctions.changeCharacter(a, l, 48);
			k++;
		}

		//????????
		//??????????????

		for (k = 0;k < 33;k++)
		{
			if ((a.charAt(k) >= '0') && (a.charAt(k) <= '9'))
			{
				a.charAt(k) -= '0';
			}
			else if ((a.charAt(k) >= 'a') && (a.charAt(k) <= 'z'))
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - 87);
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - 55);
			}
		}

		//???????ing

		mid = 0;
		ar = 1;
		for (j = 32;j >= 33 - i;j--)
		{
			mid += a.charAt(j) * ar;
			ar *= n;
		}

		//?????????

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = 0;
		while (mid != 0)
		{
			b[k] = mid % m;
			mid = mid / m;
			k++;
		}
		for (i = 32;i >= 0;i--)
		{
			if (b[i] != -1)
			{
				if (b[i] >= 10)
				{
					char m = b[i] + 55;
					System.out.print(m);
				}
				else
				{
					System.out.print(b[i]);
				}
			}
		}
			System.out.print('\n');
			return 0;
	}

}

