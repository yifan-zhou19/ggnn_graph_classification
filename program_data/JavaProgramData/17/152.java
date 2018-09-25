package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]); //?????a[101]????????????
		int[] s = new int[101]; //????s[101]???????len????????k????????;i??????
		int len;
		int k = 0;
		int i;
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			for (len = 0;a.charAt(len) != '\0';len++)
			{
				; //????????
			}
			System.out.print(a);
			System.out.print("\n");
			for (i = 0;i < len;i++) //????????????
			{
				if (a.charAt(i) == '(') //?a[i]?'('??a[i]???
				{
					s[k++] = i;
				}
				if (a.charAt(i) == ')' && k > 0) //?a[i]?')'???????????'('??????
				{
					a = tangible.StringFunctions.changeCharacter(a, s[--k], ' ');
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
				if (a.charAt(i) != '(' && a.charAt(i) != ')') //?a[i]??????????
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
				if (a.charAt(i) == ')' && k == 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '?');
				}
			}
			for (i = k - 1;i >= 0;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, s[i], '$');
			}
			System.out.print(a);
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Character.SIZE / Byte.SIZE)); //??????
			k = 0;
		}
		return 0;
	}
}

