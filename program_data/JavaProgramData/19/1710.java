package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sen = new char[20][100]; //??????sen ,???????ori,a???????exc
		String ori = new String(new char[100]);
		String exc = new String(new char[100]);
		char c;
		int i = 0; //????
		int j;
		do
		{
			sen[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			i++;
		}while ((c = System.in.read()) != '\n'); //????????
		ori = ConsoleInput.readToWhiteSpace(true).charAt(0);
		exc = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (j = 0;j < i;j++)
		{
			if (strcmp(sen[j],ori) == 0) //?????????????????????a
			{
			 sen[j] = exc; //????????????????????????b??
			}
		}
		for (j = 0;j < i - 1;j++)
		{
			System.out.print(sen[j]);
			System.out.print(' ');
		}
		System.out.print(sen[i - 1]);
		return 0;

	}


}

