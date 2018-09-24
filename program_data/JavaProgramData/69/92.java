package <missing>;

public class GlobalMembers
{
	public static void strf(tangible.RefObject<String> str)
	{
		for (int i = 0;i < (int)(str.argValue.length() / 2);i++)
		{
			char temp = str.argValue.charAt(i);
			str.argValue.charAt(i) = str.argValue.charAt(str.argValue.length() - 1 - i);
			str.argValue.charAt(str.argValue.length() - 1 - i) = temp;
		}
	}
	public static int Main()
	{
		String an1 = new String(new char[201]);
		String an2 = new String(new char[201]);
		an1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		an2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	tangible.RefObject<String> tempRef_an1 = new tangible.RefObject<String>(an1);
		strf(tempRef_an1);
		an1 = tempRef_an1.argValue;
	tangible.RefObject<String> tempRef_an2 = new tangible.RefObject<String>(an2);
		strf(tempRef_an2);
		an2 = tempRef_an2.argValue;
		int[] anum1 = new int[201];
		int[] anum2 = new int[201];
		int[] ar = new int[202];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(anum1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(anum2,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ar,0,(Integer.SIZE / Byte.SIZE));
		int l1 = an1.length();
		int l2 = an2.length();
		int i;
		int length = l1 > l2 != 0 ? l1: l2;
		if (length == l1)
		{
			for (i = l2;i < length;i++)
			{
				an2 = tangible.StringFunctions.changeCharacter(an2, i, '0');
			}
			an2 = an2.substring(0, i);
		}
		else
		{
			for (i = l1;i < length;i++)
			{
			an1 = tangible.StringFunctions.changeCharacter(an1, i, '0');
			}
			an1 = an1.substring(0, i);
		}
		for (i = 0;i < length;i++)
		{
			anum1[i] = an1.charAt(i) - '0';
			anum2[i] = an2.charAt(i) - '0';
			ar[i] += anum1[i] + anum2[i];
		}
		for (i = 0;i < length + 1;i++)
		{
			if (ar[i] >= 10)
			{
				ar[i] -= 10;
				ar[i + 1]++;
			}
		}
		for (i = length + 2;ar[i] == 0;i--)
		{
			;
		}
		if (i < 0)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else
		{
			for (;i >= 0;i--)
			{
				System.out.print(ar[i]);
			}
			System.out.print("\n");
		}

	}

}

