package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String A = new String(new char[250]);
		String B = new String(new char[250]);
		char[] C = {'1', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int a = 0;
		int b = 0;
		int m = 0;
		int d = 0;
		int e = 0;
		int g = 0;
		int j;
		A = new Scanner(System.in).nextLine();
		B = new Scanner(System.in).nextLine();
		for (i = 0;A.charAt(i) != '\0';i++)
		{
			a++;
		}
		for (i = 0;B.charAt(i) != '\0';i++)
		{
			b++;
		}
		for (i = 0;A.charAt(i) == '0';i++)
		{
			 d++;
		}
		if (a >= b)
		{

			for (i = a - 1;i >= a - b;i--)
			{
				B = tangible.StringFunctions.changeCharacter(B, i, B.charAt(i - a + b));
			}
			for (i = 0;i < a - b;i++)
			{
				B = tangible.StringFunctions.changeCharacter(B, i, '0');
			}
			B = tangible.StringFunctions.changeCharacter(B, a, '\0');
			m = 0;
			for (i = a - 1;i >= 0;i--)
			{
				if (A.charAt(i) + B.charAt(i) + m > 105)
				{
					A = tangible.StringFunctions.changeCharacter(A, i, A.charAt(i) + B.charAt(i) + m - 58);
					m = 1;
				}
				else if (A.charAt(i) + B.charAt(i) + m <= 105)
				{
					A = tangible.StringFunctions.changeCharacter(A, i, A.charAt(i) + B.charAt(i) + m - '0');
					m = 0;
				}
			}
			if (d != 0)
			{
				for (j = 0;A.charAt(j) == '0';j++)
				{
					g++;
				}
				for (j = 0;j < a - g;j++)
				{
					A = tangible.StringFunctions.changeCharacter(A, j, A.charAt(j + g));
				}
				A = tangible.StringFunctions.changeCharacter(A, a - g, '\0');
				if (A.charAt(0) == '\0')
				{
					A = tangible.StringFunctions.changeCharacter(A, 0, '0');
				}
				System.out.println(A);
			}
		else
		{

				if (m == 0)
				{
				System.out.println(A);
				}
				if (m == 1)
				{
			   C += A;
				System.out.println(C);
				}



		}
		}

		if (a < b)
		{
			for (i = 0;B.charAt(i) == '0';i++)
			{
				e++;
			}
			for (i = b - 1;i >= b - a;i--)
			{
				A = tangible.StringFunctions.changeCharacter(A, i, A.charAt(i - b + a));
			}
			for (i = 0;i < b - a;i++)
			{
				A = tangible.StringFunctions.changeCharacter(A, i, '0');
			}
			A = tangible.StringFunctions.changeCharacter(A, b, '\0');

			m = 0;
			for (i = b - 1;i >= 0;i--)
			{
				if (A.charAt(i) + B.charAt(i) + m > 105)
				{
					A = tangible.StringFunctions.changeCharacter(A, i, A.charAt(i) + B.charAt(i) + m - 58);
					m = 1;
				}
				else if (A.charAt(i) + B.charAt(i) + m <= 105)
				{
					A = tangible.StringFunctions.changeCharacter(A, i, A.charAt(i) + B.charAt(i) + m - '0');
					m = 0;
				}
			}
			if (e != 0)
			{
				for (i = 0;A.charAt(i) == '0';i++)
				{
					g++;
				}
				for (i = 0;i < b - g;i++)
				{
					A = tangible.StringFunctions.changeCharacter(A, i, A.charAt(i + g));
				}
				A = tangible.StringFunctions.changeCharacter(A, b - g, '\0');
				if (A.charAt(0) == '\0')
				{
					A = tangible.StringFunctions.changeCharacter(A, 0, '0');
				}
				System.out.println(A);
			}


		   else
		   {

				if (m == 0)
				{
				System.out.println(A);
				}
				if (m == 1)
				{
			   C += A;
				System.out.println(C);
				}

		   }
		}

	 return 0;
	}
}

