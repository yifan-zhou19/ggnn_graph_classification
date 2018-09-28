package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		a = new Scanner(System.in).nextLine();
		int b;
		b = a.length();
		String max = new String(new char[40]);
		String min = new String(new char[40]);
		String temp = new String(new char[40]);
		int i;
		int len = 0;
		int minn = 30;
		int maxx = 0;
		for (i = 0;i < b;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, len, a.charAt(i));
				len++;
			}
			if ((a.charAt(i) == ' ' || a.charAt(i) == ',' || i == b - 1) && len != 0)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, len, '\0');
				if (len > maxx)
				{
					max = temp;
					maxx = len;
				}
				if (len < minn)
				{
					min = temp;
					minn = len;
				}
				len = 0;
			}
		}
		System.out.printf("%s\n%s\n",max,min);
		return 0;
	}


}

