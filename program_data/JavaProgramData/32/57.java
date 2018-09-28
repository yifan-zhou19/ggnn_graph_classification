package <missing>;

public class GlobalMembers
{
	public static void gui0(String a, int n)
	{
		for (int i = 0;i < n;i++)
		{
			a[i] = '\0';
		}
	}
	public static int Main()
	{
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		String a = new String(new char[101]);
		String b = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char**pp=(char**)malloc(num *sizeof(char*));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		char[] pp = (String)malloc(num * sizeof(String));
		for (int k = 0;k < num;k++)
		{
			gui0(a, 101);
			gui0(b, 101);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			int m = a.length();
			int n = b.length();
			int j = n - 1;
			for (int i = m - 1;i >= m - n;i--)
			{
				if (b.charAt(j) <= a.charAt(i))
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(j) + '0');
				}
				else
				{
					a.charAt(i - 1)--;
					int t = a.charAt(i) - b.charAt(j) + 10;
					a = tangible.StringFunctions.changeCharacter(a, i, '0' + t);
				}
				j--;
				if (j < 0)
				{
					break;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pp[k] = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
			pp[k] = a;
		}
		for (int r = 0;r < num;r++)
		{
			int i;
			for (i = 0;i < String.valueOf(pp[r]).length();i++)
			{
				if (pp[r][i] == '0')
				{
					continue;
				}
				else
				{
					break;
				}
			}
			for (;i < String.valueOf(pp[r]).length();i++)
			{
				System.out.printf("%c",pp[r][i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

