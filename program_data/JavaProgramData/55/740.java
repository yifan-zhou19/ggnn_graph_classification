package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a,b,n;
		int a;
		int b;
		int n;
		char[] num = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


		int i;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int s=0;
		int s = 0;
		n = num.length(); //?????
		for (i = 0;i < n;i++)
		{
			if (num[i] >= 'a')
			{
				num[i] = num[i] - 87;
			}
			else if (num[i] >= 'A')
			{
				num[i] = num[i] - 55;
			}
			else
			{
				num[i] = num[i] - 48;
			}
			s = (int)(s + num[i] * Math.pow((double)a,(double)(n - i - 1))); //??
		}
		//cout<<s<<endl;
		String m = new String(new char[100]);
		int j = 0;
		for (j = 0;s > 0;j++)
		{
			  m = tangible.StringFunctions.changeCharacter(m, j, s % b);
			  s = s / b;
			  if (m.charAt(j) > 9)
			  {
				  m = tangible.StringFunctions.changeCharacter(m, j, m.charAt(j) + 55);
			  }
			  else
			  {
				  m = tangible.StringFunctions.changeCharacter(m, j, m.charAt(j) + 48);
			  }
		}
		if (j == 0)
		{
			System.out.print(0);
		}
		else
		{
		for (j = j - 1;j >= 0;j--)
		{
			System.out.print(m.charAt(j));
		}
		}



	}
}

