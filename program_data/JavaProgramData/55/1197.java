package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = -1; //??????n ???a ????b  ??????????num ??????????s ????i,j
		int a = 0;
		int b = 0;
		int num;
		int s = 0;
		int i = 0;
		int j = 1;
		String numb = new String(new char[32]); //??????
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		numb = tangible.StringFunctions.changeCharacter(numb, 0, System.in.read());
		do
		{
				n++;
		} while ((numb[n] = System.in.read()) != ' '); //??????
		for (i = 0;i < n;i++) //???????????
		{
			  num = 1;
			  if (numb.charAt(i) < 58)
			  {
				 numb = tangible.StringFunctions.changeCharacter(numb, i, numb.charAt(i) - 48);
			  }
			  else if (numb.charAt(i) > 96)
			  {
					  numb = tangible.StringFunctions.changeCharacter(numb, i, numb.charAt(i) - 87);
			  }
				   else
				   {
					   numb = tangible.StringFunctions.changeCharacter(numb, i, numb.charAt(i) - 55);
				   }
			  for (j = 1;j < n - i;j++)
			  {
				  num = num * a;
			  }
			  s += num * numb.charAt(i);
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = 0;
		do
		{
			  num = s % b;
			  if (num < 10)
			  {
				 numb = tangible.StringFunctions.changeCharacter(numb, n, num + 48);
			  }
			  else
			  {
				 numb = tangible.StringFunctions.changeCharacter(numb, n, num + 55);
			  }
			  n++;
			  s = s / b;
		} while (s != 0);
		for (n = n - 1;n >= 0;n--)
		{
			System.out.print(numb.charAt(n));
		}
		return 0;
	}

}

