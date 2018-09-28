package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0; //a,b???????
		int b = 0;
		String m = new String(new char[32]); //m?????b???
		String n = new String(new char[32]); //n????a???
		int i = 1; //i?????
		int sum = 0; //sum?????????
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = tangible.StringFunctions.changeCharacter(n, 0, System.in.read()); //????????
		while ((n[i] = System.in.read()) != ' ')
		{
			if (n.charAt(i) > 47 && n.charAt(i) < 58) //????ASCII??????
			{
			n.charAt(i) -= 48;
			}
			else if (n.charAt(i) > 64 && n.charAt(i) < 91)
			{
			n.charAt(i) -= 55;
			}
			else if (n.charAt(i) > 96 && n.charAt(i) < 123)
			{
			n.charAt(i) -= 87;
			}
			sum = a * sum + n.charAt(i); //?a??????????
			i++;
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		do
		{
			m = tangible.StringFunctions.changeCharacter(m, i, sum % b);
			if (m.charAt(i) >= 0 && m.charAt(i) <= 9)
			{
			m.charAt(i) += 48;
			}
			else if (m.charAt(i) > 9 && m.charAt(i) < 36)
			{
			m.charAt(i) += 55;
			}
			sum = sum / b;
			i++;
		}while (sum != 0);
		for (int j = i - 1;j >= 0;j--)
		{
		System.out.print(m.charAt(j));
		}
		return 0;
	}

}

