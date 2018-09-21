package <missing>;

public class GlobalMembers
{
	/*
	 *????HW6_12.cpp
	 *??????1100019007?
	 *???2012-11-08
	 *???????
	 */ 
	public static char[][] words = new char[110][110]; //???
	public static int Main()
	{
		int i;
		int n;
		char c;
		i = 0;
		while ((words[i] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			i++;
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		} //????(??????)
		n = i; //????
		for (i = n - 1;i >= 0;i--)
		{
		   System.out.print(words[i]);
		   if (i != 0)
		   {
			   System.out.print(' ');
		   }
		}
		System.out.print("\n");
		return 0; //????
	}

}

