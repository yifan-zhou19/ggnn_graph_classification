package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		int i;
		int x;
		int l;
		int n;
		for (i = 0;i < 105;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		for (i = 0;i < 105;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		}

		a = new Scanner(System.in).nextLine();
		if ((l = a.length()) == 1)
		{
			System.out.print("0\n");
			System.out.printf("%d\n",a.charAt(0) - 48);
		}
		else if ((l = (a.length())) == 2)
		{
			x = 10 * (a.charAt(0) - 48) + (a.charAt(1) - 48);
			if (x < C)
			{
				System.out.print("0\n");
				System.out.printf("%d\n",x);
			}
			else
			{
				System.out.printf("%d\n",(x - (x % C)) / C);
				x = x % C;
				System.out.printf("%d\n",x);
			}


		}

		else
		{
		  for (i = 0,n = 0;a.charAt(i + 2) != '\0';i++)
		  {
			 if (i == 0)
			 {
				x = 10 * (a.charAt(i) - 48) + (a.charAt(i + 1) - 48); //printf("%d\n",x);
				while (x < C)
				{
					i++;
					x = 10 * x + (a.charAt(i + 1) - 48); //printf("%d %d\n",i,x);
				}
				b = tangible.StringFunctions.changeCharacter(b, n, (x - (x % C)) / C + '0');
				n++;
				x = x % C;
			 }
			 else
			 {
				x = 10 * x + (a.charAt(i + 1) - 48);
				while (x < C)
				{
					b = tangible.StringFunctions.changeCharacter(b, n, '0');
					n++;
					i++;
					x = 10 * x + (a.charAt(i + 1) - 48);
				}
				b = tangible.StringFunctions.changeCharacter(b, n, (x - (x % C)) / C + '0');
				n++;
				x = x % C;
			 }

		  }
		//printf("%d\n",i);
		if (i == (l = (a.length() - 1)))
		{
			System.out.println(b);
			System.out.printf("%d\n",x);
		}
		else if (i == (l = (a.length() - 2)))
		{
				x = 10 * x + (a.charAt(a.length() - 1) - 48);
				if (x < C)
				{
					b = tangible.StringFunctions.changeCharacter(b, n, '0');
					System.out.println(b);
					System.out.printf("%d\n",x);
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, n, (x - (x % C)) / C + '0');
					System.out.println(b);
					x = x % C;
					System.out.printf("%d\n",x);
				}
		}
		}

		return 0;


	}
}

