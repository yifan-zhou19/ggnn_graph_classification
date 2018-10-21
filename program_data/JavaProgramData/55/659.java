package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int decn=0;
		int decn = 0;
		int a; //????????????????????????????????????????????????????????
		int b;
		int i;
		int k;
		String n = new String(new char[100]); //?????????????????????????????
		String r = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 100;i++)
		{
			if (n.charAt(i) == 0)
			{
				k = i;
				break;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (n.charAt(i) <= 57)
			{
				decn = decn + (n.charAt(i) - 48) * Math.pow((double)a,(int)k - i - 1);
			}
			else if (n.charAt(i) <= 90)
			{
				decn = decn + (n.charAt(i) - 55) * Math.pow((double)a,(int)k - i - 1);
			}
				 else
				 {
					 decn = decn + (n.charAt(i) - 87) * Math.pow((double)a,(int)k - i - 1);
				 }
		} //?????????
		i = 0;
		do
		{
			r = tangible.StringFunctions.changeCharacter(r, i, decn % b); //???????????????????????
			if (r.charAt(i) < 10)
			{
				r = tangible.StringFunctions.changeCharacter(r, i, r.charAt(i) + 48);
			}
			else
			{
				r = tangible.StringFunctions.changeCharacter(r, i, r.charAt(i) + 55);
			} //??????????
			decn = decn / b; //????????
			i++;
		}while (decn != 0);
		i = i - 1;
		for (;i >= 0;i--)
		{
			System.out.print(r.charAt(i));
		}
		return 0;
	}
}

