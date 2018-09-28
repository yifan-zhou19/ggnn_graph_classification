package <missing>;

public class GlobalMembers
{
	//???? 
	//???




	public static int Main()
	{
		int n;
		int len;
		char[][] str = new char[1000][1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i < n;i++)
		{
		str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		System.out.print(str);
		String p = new String(new char[1000]); //??????

		len = String.valueOfstr.length();
		for (p = str + 1;p < n + str;p++)
		{
			len += String.valueOfp.length();
			if (len >= 80) //??
			{
				System.out.print("\n");
				System.out.print(p);
				len = String.valueOfp.length(); //?????
			}
			else
			{ //????
				System.out.print(" ");
				System.out.print(p);
				len++;
			}
		}
		return 0;

	} //??
}

