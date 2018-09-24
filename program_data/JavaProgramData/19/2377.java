package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String sour = new String(new char[100]);
		String result = new String(new char[100]);
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		String c = new String(new char[20]);
		String p = null;
		String q = null;
		int i;
		int k = 0;
		int l_1;
		int l_2;
		int l_3;
		int l_4;
		int l_5;
		int x = 0;
		int flag;
		int j;
		int word_length = 0;
		int flag_2 = 0;
		sour = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		l_1 = sour.length();
		l_2 = a.length();
		l_3 = b.length();
		p = sour;
		q = sour;
		for (j = 0;j < l_1 - l_2 + 1;)
		{
			for (i = 0;i < l_2;i++,j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, sour.charAt(j));
			}
			j = x;
			x++;
			if (strcmp(c,a) == 0)
			{
				flag_2++;
			}
		}


		while (p != '\0')
		{
			if (p == ' ' || *(p.Substring(1)) == '\0')
			{
			  flag = 1;
			  if (p == ' ')
			  {
				  word_length = p - q;
			  }
			  else
			  {
				  word_length = p - q.Substring(1);
			  }
			  if (word_length == a.length())
			  {
				 for (i = 0; i < a.length(); i++)
				 {
					if (q.charAt(i) != a.charAt(i))
					{
					   flag = 0;
					   break;
					}
				 }
			  }
			  else
			  {
				  flag = 0;
			  }

			  if (flag == 1)
			  {
				 for (i = 0; i < b.length(); i++)
				 {
					result = tangible.StringFunctions.changeCharacter(result, k++, b.charAt(i));
				 }

			  }
			  else
			  {
				 while (q != p)
				 {
					result = tangible.StringFunctions.changeCharacter(result, k++, q++);
				 }

			  }
			  if (p == ' ')
			  {
				  result = tangible.StringFunctions.changeCharacter(result, k++, ' ');
			  }
			  else
			  {
				  result = tangible.StringFunctions.changeCharacter(result, k++, p);
			  }

			  q = p.Substring(1);
			}
		   p = p.Substring(1);
		}

		result = tangible.StringFunctions.changeCharacter(result, k, '\0');
		l_4 = result.length();
		l_5 = l_1 - l_2 + l_3;
		if ((l_4 != l_5))
		{
			if (flag_2 == 1)
			{
				result = tangible.StringFunctions.changeCharacter(result, k - 1, '\0');
			}
		}
		System.out.println(result);
	}

}

