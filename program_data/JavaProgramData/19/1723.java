import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************
	//????3.cpp *
	//?  ?????*
	//***************
	public static int Main()
	{
		String s = new String(new char[101]); //?????s,a,b
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String m = new String(new char[101]);
		String n = new String(new char[101]);
		int ls = 0; //??ls,la,lb???????s,a,b???
		int la = 0;
		int lb = 0;
		int i;
		int j;
		int k;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine(); //????s,a,b
		ls = s.length();
		la = a.length();
		lb = b.length(); //????s,a,b???
		for (i = 0;i < ls;i++)
		{
			if (s.charAt(i) != a.charAt(0))
			{
				continue;
			}
			for (j = i + 1;j < i + la;j++)
			{
				if (i != 0 && s.charAt(i - 1) != ' ')
				{
					break;
				}
				if (s.charAt(j) != a.charAt(j - i))
				{
					break;
				}
			} //??s?????a???????
			if (j == i + la) //??j?i+la-1?????????"break"???
			{
				for (k = 0;k < i;k++)
				{
					m = tangible.StringFunctions.changeCharacter(m, k, s.charAt(k));
				}
				m = tangible.StringFunctions.changeCharacter(m, i, '\0');
				n = strcat(m,b);
				s = strcat(n,s + (i + la)); //?????????s??????b?s?????????
				i = i + lb;
			}
		}
		System.out.print(s);
		return 0;
	}
}

