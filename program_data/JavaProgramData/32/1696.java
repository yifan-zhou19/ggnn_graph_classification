package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int t;
		int j;
		int n;
		int len_a;
		int len_b;
		int len_e;
		int temp;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		String d = new String(new char[101]);
		String e = new String(new char[101]);
		String f = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			len_a = a.length();
			len_b = b.length();
			for (i = 0;i < len_a / 2;i++)
			{
			  temp = a.charAt(i);
			  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(len_a - i - 1));
			  a = tangible.StringFunctions.changeCharacter(a, len_a - i - 1, temp);
			}
			for (i = 0;i < len_b / 2;i++)
			{
			  temp = b.charAt(i);
			  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(len_b - i - 1));
			  b = tangible.StringFunctions.changeCharacter(b, len_b - i - 1, temp);
			}
			for (i = len_b;i < len_a;i++)
			{
			 b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
			for (i = 0;i < len_a;i++)
			{

				  t = a.charAt(i) - b.charAt(i);
				   if (t < 0)
				   {
						t = t + 10;
						a = tangible.StringFunctions.changeCharacter(a, i + 1, a.charAt(i + 1) - 1);
				   }
					a = tangible.StringFunctions.changeCharacter(a, i, t - 1 + '1');
			}
			for (i = len_a - 1;i >= 0;i--)
			{
			 if (a.charAt(i) != '0')
			 {
				 break;
			 }
			 else
			 {
				 len_a--;
			 }
			}
			a = tangible.StringFunctions.changeCharacter(a, len_a, '\0');
			for (i = 0;i < len_a / 2;i++)
			{
			  temp = a.charAt(i);
			  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(len_a - i - 1));
			  a = tangible.StringFunctions.changeCharacter(a, len_a - i - 1, temp);
			}
			System.out.println(a);
			a = new Scanner(System.in).nextLine();
		}
	}

}

