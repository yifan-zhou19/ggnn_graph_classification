package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void align(char a[]);
		void substract(char a[],char b[],char c[]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		int i;
		int j;
		int t;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						System.in.read();
						a = new Scanner(System.in).nextLine();
						b = new Scanner(System.in).nextLine();
						align(a);
						align(b);
						substract(a, b, c);
						for (j = 0;j < 100;j++)
						{
							if (c.charAt(j) != '0')
							{
							t = j;
							break;
							}
						}
						for (j = 0;j < 100 - t;j++)
						{
							c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + t));
						}
						c = tangible.StringFunctions.changeCharacter(c, 100 - t, '\0');
						System.out.println(c);
		}

	}
	public static void align(String a)
	{
		 int jump;
		 int m;
	a[100] = '\0';
	jump = 100 - a.length();
	for (m = 100 - jump;m > 0;m--)
	{
	a[m + jump - 1] = a[m - 1];
	}
	for (m = 0;m < jump;m++)
	{
	a[m] = '0';
	}
	}
	public static void substract(String a, String b, String c)
	{
				   int i;
				   int carry = 0;
				   for (i = 99;i >= 0;i--)
				   {
									 if (carry + b[i] > a[i])
									 {
										 c[i] = a[i].Substring(10) - (b[i].Substring(carry)) + '0';
										 carry = 1;
									 }
									 else
									 {
										 c[i] = a[i] - (b[i].Substring(carry)) + '0';
										 carry = 0;
									 }
				   }
	}

}

