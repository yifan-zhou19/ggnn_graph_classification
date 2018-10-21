package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int t;
	  int k = 0;
	  int m = 0;
	  int p;
	  int q;
	  int i;
	  int j;
	  int x = 0;
	  int w = 0;
	  final String a = "";
	  final String b = "";
	  final String d = "";
	  final String c = "";

	  a = new Scanner(System.in).nextLine();
	  t = a.length();
	  for (i = 0;i < t;i++)
	  {
			if (a.charAt(i) != ',')
			{
				d.charAt(w)[m] = a.charAt(i);
				m = m + 1;
			}
			else
			{
				w = w + 1;
				m = 0;
			}
	  }

	  for (i = 0;i < w + 1;i++)
	  {
		  if (d.charAt(i)[0] <= '9' && d.charAt(i)[0] >= '0')
		  {
			  b = tangible.StringFunctions.changeCharacter(b, k, d.charAt(i));
			  k = k + 1;
		  }
	  }
	  if (k == 1)
	  {
		  System.out.print("No\n");
	  }
	  else
	  {
		for (i = 0;i < k - 1;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				p = String.valueOf(b.charAt(i)).length();
				q = String.valueOf(b.charAt(j)).length();
				if (p < q)
				{
					c = b.charAt(i);
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
					b = tangible.StringFunctions.changeCharacter(b, j, c);
				}
				else if (p == q)
				{
					if (strcmp(b.charAt(i),b.charAt(j)) < 0)
					{
						c = b.charAt(i);
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
					b = tangible.StringFunctions.changeCharacter(b, j, c);
					}
				}
			}
		}

		for (i = 0;i < k - 1;i++)
		{
			if (strcmp(b.charAt(i),b.charAt(i + 1)) != 0)
			{
				x = 1;
				break;
			}
		}
		if (x == 1)
		{
			System.out.printf("%s\n",b.charAt(i + 1));
		}
		else
		{
			System.out.print("No\n");
		}
	  }


	}



}

