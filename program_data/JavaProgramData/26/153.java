import java.util.*;

package <missing>;

public class GlobalMembers
{
	//???????



	public static int Main()
	{
		String input = new String(new char[101]); //?????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p; //?????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int end; //?????

		input = new Scanner(System.in).nextLine();

		end = input.length(); //???
		p = input;
		q = input;

		while (p < input.Substring(end)) //?????
		{
			while (*p != ' ' && *p != '\0') //???????????????
			{
				*(q++) = *(p++); //????????????
			}

			if (p == input.Substring(end))
			{
				break; //???
			}

			//??????????
			*(q++) = *(p++);

			while (*p == ' ')
			{
				p++; //???????
			}
		}

		*q = '\0'; //?????

		System.out.print(input);
		System.out.print("\n");

		return 0;
	}

}
