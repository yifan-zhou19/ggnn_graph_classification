package <missing>;

public class GlobalMembers
{
	public static int num(String x)
	{
		int i;
		int len;
		int num = 0;
		len = x.length();
		for (i = len - 1;i >= 0;i--)
		{
			if (!x[i].equals(' '))
			{
				num++;
			}
			else
			{
				break;
			}
		}
		return (num);
	}
	public static void read(String x, String y)
	{
		int i;
		int j;
		int lenx;
		int leny;
		lenx = x.length();
		leny = num(x);
		for (i = lenx - 1,j = 0;i >= lenx - leny;i--,j++)
		{
			y[leny - 1 - j] = x[i];
		}
		y[leny] = ' ';
		y[leny + 1] = '\0';
		x[lenx - leny - 1] = '\0';
	}
	public static int count(String x)
	{
		int len;
		int i;
		int p = 0;
		int m = 0;
		len = x.length();
		for (i = 0;i < len - 1;i++)
		{
			if (x[i].equals(' '))
			{
				p = 0;
			}
			else if (p == 0)
			{
					p = 1;
					m++;
			}
		}
		return (m);
	}
	public static int Main()
	{
		String src = new String(new char[101]);
		String obj = new String(new char[101]);
		String trn = new String(new char[30]);
		int i;
		int num;
		int len;
		src = new Scanner(System.in).nextLine();
		len = src.length();
		num = count(src);
		obj = tangible.StringFunctions.changeCharacter(obj, 0, '\0');
		for (i = 0;i <= num - 1;i++)
		{
			read(src, trn);
			obj += trn;
		}
		obj = tangible.StringFunctions.changeCharacter(obj, len, '\0');
		System.out.println(obj);
	}












	/*????   
	 
	?? 
	???????????(????????)?????????????????????????
	 
	???? 
	?????????????????100?
	 
	???? 
	?????????????
	 
	???? 
	I am a student
	 
	???? 
	student a am I*/


}

