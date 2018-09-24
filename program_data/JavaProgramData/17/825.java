package <missing>;

public class GlobalMembers
{
	public static char investigate(String a)
	{
		int i;
		int j;
		int k;
		int n;
		int p1 = 0;
		int p2 = 0;
		int w;
		int t = 0;
		int t1 = 0;
		n = a.length();
		String b = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
			if (a[i].equals('('))
			{
				p1++;
			}
			if (a[i].equals(')'))
			{
				p2++;
			}
		}

		for (i = 0;i < n;i++)
		{
			if ((i == (n - 1)) && (t > t1))
			{
			  i = -1;
			  t1 = t;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			  goto loop;
			}
			else
			{
			if (!a[i].equals('('))
			{
			b.charAt(i) == ' ';
			continue;
			}
			else
			{
			  for (j = i + 1;j < n;j++)
			  {
				  if (a[j].equals('('))
				  {
					  i = j - 1;
					  break;
				  }
				  else if (a[j].equals(')'))
				  {
					  a[i] = '[';
					  a[j] = ']';
					  t++;
					  break;
				  }
			  }
			}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			loop:
			;

		}

		for (i = 0;i < n;i++)
		{
			if (a[i].equals('('))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '$');
			}
			else if (a[i].equals(')'))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '?');
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			}

		}
		for (i = 0;i < n;i++)
		{
			if (a[i].equals('['))
			{
				a[i] = '(';
			}
			if (a[i].equals(']'))
			{
				a[i] = ')';
			}

		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",a[i]);
		}
			System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}

		return 0;
	}

	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[100]);
		while (gets(a))
		{
			investigate(a);
			System.out.print("\n");


		}



	}

}

