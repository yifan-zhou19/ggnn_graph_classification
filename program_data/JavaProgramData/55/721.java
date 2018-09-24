package <missing>;

public class GlobalMembers
{
	//????????
	//??????
	public static int Main()
	{
	  String string1 = new String(new char[1000]); //?????string1,string2
	  String string2 = new String(new char[1000]);
	  int b; //??????????b,?????c,????i
	  int c = 0;
	  int i;
	  float a; //????????????a,????????????d
	  float d;
	  a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	  string1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  d = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	  b = string1.length(); //?????string1???
	  for (i = 0;i < b;i++) //??a?????10??
	  {
		  if (string1.charAt(i) >= '0' && string1.charAt(i) <= '9')
		  {
			c += (string1.charAt(i) - 48) * Math.pow(a,b - i - 1);
		  }
		  if (string1.charAt(i) >= 'a' && string1.charAt(i) <= 'z')
		  {
			c += (string1.charAt(i) - 87) * Math.pow(a,b - i - 1);
		  }
		  if (string1.charAt(i) >= 'A' && string1.charAt(i) <= 'Z')
		  {
			c += (string1.charAt(i) - 55) * Math.pow(a,b - i - 1);
		  }
	  }
	int index = 0; //????????index,????e
	int e;
	if (c == 0)
	{
	System.out.print('0');
	System.out.print("\n");
	}
	while (c != 0) //???????d??
	{
		e = c % (int)d;
		c = c / d;
		if (e >= 10)
		{
			string2 = tangible.StringFunctions.changeCharacter(string2, index, 'A' + e-10);
		}
		else
		{
			string2 = tangible.StringFunctions.changeCharacter(string2, index, '0' + e);
		}
		index++;
	}
	for (i = index - 1;i >= 0;i--)
	{
		System.out.print(string2.charAt(i));
	}
	System.out.print("\n");
	return 0;
	}


}

