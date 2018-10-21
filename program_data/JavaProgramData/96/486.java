package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String dividend = new String(new char[100]);
		String result = new String(new char[100]);
		int i;
		int remainder;
		int len;
		int temDivid;
		int flag = 0;
		dividend = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = dividend.length();
		for (i = 0, temDivid = dividend.charAt(0) - '0'; i < len - 1; i++)
		{
			result = tangible.StringFunctions.changeCharacter(result, i, temDivid / DIVISOR + '0');
			remainder = temDivid % DIVISOR;
			temDivid = remainder * 10 + (dividend.charAt(i + 1) - '0');
		}
		result = tangible.StringFunctions.changeCharacter(result, i, temDivid / DIVISOR + '0'); // ????i = len????dividend[i + 1]??????len=1??????
		remainder = temDivid % DIVISOR;
		result = tangible.StringFunctions.changeCharacter(result, i + 1, '\0');
		for (i = 0; result.charAt(i) == '0';)
		{
			i++;
		}
		if (result.charAt(i) == '\0')
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(remainder);
			System.out.print("\n");
		}
		else
		{
			System.out.print(result.Substring(i));
			System.out.print("\n");
			System.out.print(remainder);
			System.out.print("\n");
		}
		return 0;
	}
}

