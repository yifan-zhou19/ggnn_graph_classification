package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n0 = new int[31];
		int t;
		int[] m0 = new int[31];
		int[] s = new int[31];
		//sum????10?????? t???????10????????????sum; s??????????m????

		int sum = 0;
		int a;
		int b;
		int l;
		int i;
		int j;
		final String n = "";
		final String m = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		for (i = 0; n.charAt(i) != '\0'; i++)
		{
			if (n.charAt(i) >= 65 && n.charAt(i) <= 90)
			{
				n0[i] = n.charAt(i) - 55;
			}
			else if (n.charAt(i) >= 97 && n.charAt(i) <= 122) //????else if???
			{
				n0[i] = n.charAt(i) - 87;
			}
			else
			{
				n0[i] = n.charAt(i) - 48;
			}
		}

		l = n.length();
		for (i = 0; i < l; i++)
		{
			t = (int)(n0[i] * Math.pow(a, l - i - 1));
			sum = sum + t;
		}


		i = 0;
		do
		{
			s[i] = sum % b;
			sum = (sum - s[i]) / b;
			i++;
		}while (sum != 0);

		for (j = 0; j < i; j++)
		{
			m0[j] = s[i - 1 - j];
			if (m0[j] >= 10)
			{
				m = tangible.StringFunctions.changeCharacter(m, j, m0[j] + 55);
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, j, m0[j] + 48);
			}
		}
		System.out.println(m);
		return 0;
	}

}

