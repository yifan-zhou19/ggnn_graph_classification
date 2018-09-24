package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2011??               **
	//*??????                 **
	//*???2013.1.12              **
	//*******************************/


	public static void read(char last, int time)
	{
		char a = System.in.read();
		if (a >= 'a' && a <= 'z')
		{
			a -= 32;
		}
		if (a == '\n')
		{
			System.out.print("(");
			System.out.print(last);
			System.out.print(",");
			System.out.print(time);
			System.out.print(")");
		}
		else if (last == a)
		{
			read(last, time + 1);
		}
		else
		{
			System.out.print("(");
			System.out.print(last);
			System.out.print(",");
			System.out.print(time);
			System.out.print(")");
			read(a, 1);
		}
	}

	public static int Main()
	{
		char a = System.in.read();
		if (a >= 'a' && a <= 'z')
		{
			a -= 32;
		}
		read(a, 1);
		return 0;
	}

}
