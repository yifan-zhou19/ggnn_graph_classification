package <missing>;

public class GlobalMembers
{
	public static int iflet(char a)
	{
		int test = 0;
		if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
		{
			test = 1;
		}
		return test;
	}

	public static void Main()
	{
		String ori = new String(new char[100]);
		String out = new String(new char[100]);
		String in = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pori = ori;
		String pout = out;
		String pin = in;
		String temp = new String(new char[20]);
		int k;

		ori = new Scanner(System.in).nextLine();
		out = new Scanner(System.in).nextLine();
		in = new Scanner(System.in).nextLine();

		for (; * pori != '\0';)
		{
			if (*pori == ' ')
			{
				System.out.printf("%c",*pori);
				pori++;
			}

			else if ((iflet(*pori) == 1 && *(pori - 1) == ' ') || (pori = ori))
			{

				for (k = 0; * (pori + k) != ' ' && *(pori + k) != '\0';k++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, k, *(pori + k));
				}
				temp = tangible.StringFunctions.changeCharacter(temp, k, '\0');

				if (strcmp(temp,out) == 0)
				{
					System.out.printf("%s",in);
				}

				else
				{
					System.out.printf("%s",temp);
				}

				pori = pori + k;
			}

		}
	}

}

