public class jisuan
{
	public char zimu;
	public int count;
}

package <missing>;

public class GlobalMembers
{
	public static jisuan[] ji = tangible.Arrays.initializeWithDefaultjisuanInstances(1000);
	public static int zhuanhua(char a)
	{
		if (a >= 'a' && a <= 'z')
		{
			return a - 32;
		}
		else
		{
			return a;
		}
	}
	public static int Main()
	{
		String str = new String(new char[1001]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int l;
		int flag;
		l = str.length();
		str = tangible.StringFunctions.changeCharacter(str, 0, zhuanhua(str.charAt(0)));
		ji[0].zimu = str.charAt(0);
		ji[0].count = 1;
		flag = 0;
		for (i = 1;i < l;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, zhuanhua(str.charAt(i)));
			if (str.charAt(i) == str.charAt(i - 1))
			{
				ji[flag].count++;
			}
			else
			{
				flag++;
				ji[flag].zimu = str.charAt(i);
				ji[flag].count = 1;
			}
		}
		for (i = 0;i <= flag;i++)
		{
			System.out.print("(");
			System.out.print(ji[i].zimu);
			System.out.print(",");
			System.out.print(ji[i].count);
			System.out.print(")");
		}
		return 0;
	}







}

