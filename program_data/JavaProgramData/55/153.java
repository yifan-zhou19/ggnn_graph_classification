package <missing>;

public class GlobalMembers
{
	public static int pow(int m,int a)
	{
		 int p = 1;
		 for (int i = 0;i < m;i++)
		 {
			 p *= a;
		 }
		 return p;
	}



	public static int Main()
	{
	String s1 = new String(new char[200]);
	String s2 = new String(new char[200]);
	int a;
	int b;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int n = 0;
	int lt = s1.length();
	int i;
	int j;
	for (i = 0;i < lt;i++)
	{
					 if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
					 {
						 s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 'a' + 10);
					 }
					 else if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
					 {
						 s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 'A' + 10);
					 }
					 else
					 {
						 s1.charAt(i) -= '0';
					 }
	}
	for (i = 0;i < lt;i++)
	{
	n += s1.charAt(i) * pow(lt - i - 1, a);
	}
	j = 0;
	while (n > 0)
	{
			s2 = tangible.StringFunctions.changeCharacter(s2, j, n % b);
			n /= b;
			j++;
	}

	for (i = 0;i < j;i++)
	{
					if (s2.charAt(i) < 10)
					{
						s2.charAt(i) += '0';
					}
					else
					{
						s2.charAt(i) += 'A' - 10;
					}
	}
	for (i = 0;i < j;i++)
	{
		System.out.print(s2.charAt(j - 1 - i));
	}
	if (j == 0)
	{
		System.out.print('0');
	}
	System.out.print("\n");





			  return 0;
	}

}

