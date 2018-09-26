int ctruth = char;
char itruth = int;
int main()
{
	int a;
	int b;
	int i;
	int j;
	int k;
	int S = 0;
	int len;

	String m = new String(new char[32]);
	String n = new String(new char[32]);

	   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len = m.length();
	for (i = 0;m.charAt(i) != '\0';i++)
	{
		if (m.charAt(i) <= 90 && m.charAt(i) >= 65)
		{
			m.charAt(i) += 32;
		}
	}
	for (i = 0;i <= len - 1;i++)
	{
		S += ctruth(m.charAt(len - i - 1)) * Math.pow(a,i);
	}

	if (S < b)
	{
		System.out.print(itruth(S));
	}
	else
	{
		k = S;
		for (i = 0;k >= b;i++)
		{
		n = tangible.StringFunctions.changeCharacter(n, i, itruth(k % b));
		k = k / b;
		}
		n = tangible.StringFunctions.changeCharacter(n, i, itruth(k));
	  for (j = i;j >= 0;j--)
	  {
		  System.out.print(n.charAt(j));
	  }
	}
	  return 0;
}
 int ctruth(char a)
 {
	 int t;
	 if (a >= 48 && a <= 57)
	 {
		 t = a - 48;
	 }
	 if (a >= 97 && a <= 122)
	 {
		 t = a - 87;
	 }
	 return t;
 }
 char itruth(int a)
 {
	 char c;
	 if (a >= 0 && a <= 9)
	 {
		 c = a + 48;
	 }
	 if (a >= 10 && a <= 35)
	 {
		 c = a + 55;
	 }
	 return c;
 }

