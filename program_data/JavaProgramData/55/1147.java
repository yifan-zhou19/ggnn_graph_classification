package <missing>;

public class GlobalMembers
{
	public static int pow(int di,int mi)
	{
		int k;
		int p = 1;
		if (mi >= 1)
		{
			for (k = 1;k <= mi;k++)
			{
				p *= di;
			}
		}
		return p;
	}
	public static int Main()
	{
		int a;
		int b;
		int num = 0;
		int i;
		int j;
		String n = new String(new char[100]);
		int[] m = new int[100];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 100;i++)
		{
			if (n.charAt(i) == '\0')
			{
				break;
			}
			m[i] = (int)(n.charAt(i));
			if (n.charAt(i) <= 57 && n.charAt(i) >= 48)
			{
				m[i] = m[i] - 48;
			}
			if (n.charAt(i) <= 90 && n.charAt(i) >= 65)
			{
				m[i] = m[i] - 55;
			}
			if (n.charAt(i) <= 122 && n.charAt(i) >= 97)
			{
				m[i] = m[i] - 87;
			}
		}
		for (j = 0;i >= 1;j++)
		{
			num = num + m[j] * pow(a, i - 1);
			i--;
		}
		if (num == 0)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else
		{
			int q;
			int w;
			String r = new String(new char[100]);
			int[] t = new int[100];
			for (q = 0;q < 100;q++)
			{
				if (num == 0)
				{
					break;
				}
				t[q] = num % b;
				num = num / b;
			}
			for (w = 0;q >= 1;w++)
			{
				r = tangible.StringFunctions.changeCharacter(r, w, (char)(t[q - 1]));
				if (0 <= t[q - 1] != 0 && t[q - 1] <= 9)
				{
					r.charAt(w) += 48;
				}
				if (10 <= t[q - 1] != 0 && t[q - 1] <= 35)
				{
					r.charAt(w) += 55;
				}
				q--;
			}
			r = tangible.StringFunctions.changeCharacter(r, w, '\0');
			System.out.print(r);
			System.out.print("\n");
		}
		return 0;
	}


}

