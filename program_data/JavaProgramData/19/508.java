package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int v;
		int x;
		int c;
		int flag;
		String str = new String(new char[100]);
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		v = str.length();
		x = a.length();
		c = b.length();
		str = tangible.StringFunctions.changeCharacter(str, v, ' ');
		flag = x;
	  for (i = 0;i < x;i++)
	  {
		  if (str.charAt(i) == a.charAt(i))
		  {
			  flag--;
		  }
	  }
	  if (flag == 0 && str.charAt(x) == ' ')
	  {
		  System.out.printf("%s",b);
	  }
	  else
	  {
		  for (i = 0;i < x;i++)
		  {
		  System.out.printf("%c",str.charAt(i));
		  }
	  }
	  i = x;
	  while (i < v)
	  {
		  flag = x;
		  for (j = i;j < i + x;j++)
		  {
			  if (str.charAt(j) == a.charAt(j - i))
			  {
				  flag--;
			  }
		  }
		  if (flag == 0 && str.charAt(i - 1) == ' ' && str.charAt(i + x) == ' ')
		  {
			  System.out.printf("%s",b);
			  i = i + x;
		  }
		  else
		  {
			  System.out.printf("%c",str.charAt(i));
			  i++;
		  }
	  }
	}




}

