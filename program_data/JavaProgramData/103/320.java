package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		String b = new String(new char[1001]);
		String tmp = new String(new char[1000]);
		int[] cnt = new int[1000];
		int i;
		int j;
		int len;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(tmp,'#',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(cnt,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) - 'a'+'A');
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, len, '\0');
		j = 0;
		for (i = 0;i < len;i++)
		{
			if (i == 0)
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, j, b.charAt(i));
				cnt[j]++;
			}
			else
			{
				if (b.charAt(i) == tmp.charAt(j))
				{
					cnt[j]++;

				}
				else
				{
					j++;
					tmp = tangible.StringFunctions.changeCharacter(tmp, j, b.charAt(i));
					cnt[j]++;
				}
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.print('(');
			System.out.print(tmp.charAt(i));
			System.out.print(',');
			System.out.print(cnt[i]);
			System.out.print(')');
		}
		return 0;
	}
}

