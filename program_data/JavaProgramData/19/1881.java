import java.util.*;

//????



//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *Strlwr(char*);
char Strlwr = char * ;

int main()
{
	String input = new String(new char[110]); //??????????????????????
	String replaced = new String(new char[110]);
	String replace = new String(new char[110]);
	String inputL = new String(new char[110]); //???????????????????
	String replacedL = new String(new char[110]);
	String p; //????input??inputL????
	String pL;
	String start;
	int len; //?????????
	char temp;

	input = new Scanner(System.in).nextLine();
	replaced = new Scanner(System.in).nextLine();
	replace = new Scanner(System.in).nextLine();

	inputL = input;
	replacedL = replaced;

	len = replaced.length();
	pL = tangible.StringFunctions.strStr(inputL, replacedL); //?????????
	start = input; //???????
	while (pL != null) //??????
	{
		if ((pL == inputL || Character.isLetter(*(pL - 1)) == 0) && Character.isLetter(*(pL.Substring(len))) == 0)
		{
		//??????????
			p = input + (pL - inputL); //p?????????
			p = '\0'; //??\0?

			System.out.print(start);
			System.out.print(replace);

			start = p.Substring(len); //start????????????
			pL = tangible.StringFunctions.strStr((start - input) + inputL, replacedL); //pL??inputL?????start?????
		}
		else
		{
			p = input + (pL - inputL) + len; //p?????????
			temp = p; //???
			p = '\0';

			System.out.print(start);

			start = p; //????????
			start = temp; //????
			pL = tangible.StringFunctions.strStr((start - input) + inputL, replacedL);
		}
	}


	System.out.print(start);
	System.out.print("\n");

	return 0;
}

char * Strlwr(char * p)
{
	for (; * p != '\0'; p++)
	{
		if (*p >= 'A' && *p <= 'Z')
		{
			*p += 32;
		}
	}

	return p;
}

