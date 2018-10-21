package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int num;
		int tot;
		int i;
		int j;
		int k1;
		int k2;
		int a;
		int b;
		char c;
		num = tot = 0;
		m = n = 0;
		a = b = 0;
		String s = new String(new char[300]);
		String s1 = new String(new char[300]);
		int[] s2 = new int[300];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = new Scanner(System.in).nextLine();
		k1 = s.length();
		k2 = k1;
		while (s.charAt(k1) != ' ')
		{
			k1--;
		}
		k1--;
		j = 1;
		for (i = k1;i >= 1;i--)
		{
			if (Character.isDigit(s.charAt(i)))
			{
				num = (int)s.charAt(i);
				num = num - 48;
				tot = tot + j * num;
			}
			if (Character.isLowerCase(s.charAt(i)))
			{
				num = (int)s.charAt(i);
				num = num - 97 + 10;
				tot = tot + j * num;
			}
			if (Character.isUpperCase(s.charAt(i)))
			{
				num = (int)s.charAt(i);
				num = num - 65 + 10;
				tot = tot + j * num;
			}
			j = j * a;
		}
	   j = 1;

	   for (i = k2 - 1;i >= k1 + 2;i--)
	   {
		  num = (int)s.charAt(i);
		  num = num - 48;
		  b = b + j * num;
		  j = j * 10;

	   }
	   m = 0;
	   if (tot == 0)
	   {
		   System.out.print(0);
		   System.out.print("\n");
	   }
	   while (tot > 0)
	   {
			m++;
			s2[m] = tot % b;
			tot = tot / b;
	   }
	   if (b <= 10)
	   {
		   for (i = 1;i <= m;i++)
		   {
		   System.out.print(s2[m - i + 1]);
		   }
	   }
	   else
	   {
		   for (i = 1;i <= m;i++)
		   {
			  if (s2[m - i + 1] <= 9)
			  {
				  System.out.print(s2[m - i + 1]);
			  }
			  else
			  {
				  n = s2[m - i + 1] + 65 - 10;
				  System.out.print((char)n);
			  }
		   }

	   }
	   System.out.print("\n");

		return 0;
	}

}

