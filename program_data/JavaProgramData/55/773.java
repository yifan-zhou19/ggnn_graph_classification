package <missing>;

public class GlobalMembers
{
	//*???????
	//*??????????????????????2???36?????????long?????????
	public static int Main() //?????
	{ //?????
		double a; //????
		double b;
		int i;
		int L1;
		int L2;
		String n = new String(new char[32]); //???????
		String m = new String(new char[32]);
		int[] p = new int[32];
		int[] q = new int[32];
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		L1 = n.length(); //??n???
		for (i = 0;i < L1;i++)
		{
			p[i] = n.charAt(i);
			if (p[i] >= 97)
			{
				p[i] = p[i] - 87;
			}
			else if (p[i] >= 65)
			{
				p[i] = p[i] - 55;
			}
			else
			{
				p[i] = p[i] - 48;
			}
		}
		int dec = 0;
		for (i = 0;i < L1;i++) //?n???10???
		{
			dec = dec + p[i] * Math.pow(a,L1 - 1 - i);
		}
		if (dec == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (i = 0;i < 32;i++)
			{
			if (Math.pow(b,i) > dec)
			{
				L2 = i;
				break;
			}
			}
			for (i = 0;i < L2;i++) //?10??????b???
			{
				q[i] = dec / (int)(Math.pow(b,L2 - 1 - i));
				dec = dec - q[i] * Math.pow(b,L2 - 1 - i);
			}
			for (i = 0;i < L2;i++)
			{
				if (q[i] < 10)
				{
					m = tangible.StringFunctions.changeCharacter(m, i, q[i] + 48);
				}
				else
				{
					m = tangible.StringFunctions.changeCharacter(m, i, q[i] + 55);
				}
			}
			m = tangible.StringFunctions.changeCharacter(m, L2, '\0');
			System.out.print(m);
		}
	return 0; //???????????????????
	} //????
}

