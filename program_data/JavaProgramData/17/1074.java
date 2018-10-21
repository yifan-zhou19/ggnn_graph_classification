package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[150]);
	public static int l;
	public static int j;
	public static void left(int i)
	{
		int jj;
		/*
		cout << "left" << i << endl;
		for (int j = 0; j < l; j++) {
		    cout << a[j];
		}
		cout << endl;*/
		if (i == l - 1)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '$');
			return;
		}
		for (jj = i + 1;jj < l;jj++)
		{
			//cout << "for jj=" << jj << endl;
			if (a.charAt(jj) == ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, jj, ' ');
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				break;
			}
			else if (a.charAt(jj) == '(')
			{
				left(jj);
			}
		}
		if (jj == l)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '$');
		}
		//cout << "return" << endl;
		return;
	}
	public static void match(int i)
	{ //if(i==0){for(int k=0;k<l;k++)cout<<a[k];return;}
		/*cout << i << endl;
		for (int j = 0; j < l; j++) {
		    cout << a[j];
		}
		cout << endl;*/
		if (i == l)
		{
			for (int ii = 0;ii < l;ii++)
			{
				if (a.charAt(ii) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, ii, '$');
				}
				if (a.charAt(ii) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, ii, '?');
				}
			}
			return;
		}
		else
		{
			if (i == l - 1 && a.charAt(i) == '(')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '$');
			}
			if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
			else if (a.charAt(i) == '(')
			{
				left(i);
			}
			match(i + 1);
		}
	}
	public static int Main()
	{
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			l = a.length();
			for (int k = 0;k < l;k++)
			{
				System.out.print(a.charAt(k));
			}
			System.out.print("\n");
			match(0);
			for (int k = 0;k < l;k++)
			{
				System.out.print(a.charAt(k));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

