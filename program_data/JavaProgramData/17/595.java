import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //??????i`j
		int j;
		String A = new String(new char[200]); //??????A?????
		while (A = new Scanner(System.in).nextLine())
		{
		System.out.print(A);
		System.out.print("\n");
		for (i = 0;i < A.length();i++) //??????'('????$,')'?????,????????
		{
			if (A.charAt(i) == '(')
			{
				A = tangible.StringFunctions.changeCharacter(A, i, '$');
			}
			else
			{
				if (A.charAt(i) == ')')
				{
					A = tangible.StringFunctions.changeCharacter(A, i, '?');
				}
				else
				{
					A = tangible.StringFunctions.changeCharacter(A, i, ' ');
				}
			}
		}
		for (i = 0;i < A.length();i++) //??????'$'?'?'
		{
			if (A.charAt(i) == '?')
			{
				for (j = i;j >= 0;j--)
				{
					if (A.charAt(j) == '$')
					{
						A = tangible.StringFunctions.changeCharacter(A, i, ' ');
						A = tangible.StringFunctions.changeCharacter(A, j, ' ');
						break;
					}
				}
			}
		}
		System.out.print(A);
		System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(A,'\0',(Character.SIZE / Byte.SIZE));
		}
		return 0;
	}

}

