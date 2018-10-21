package <missing>;

public class GlobalMembers
{
	public static final String a = "";
	public static final String b = "";
	public static int L = 0;
	public static void check(String a) //???????????
	{
		int la = a.length();
		int i = 0;
		int j = la - 1;
		do
		{
			if (a[i].equals(a[j]))
			{
				i++;
				j--;
			}
			else
			{
				return;
			}
		}while (i <= j);
		System.out.print(a);
		System.out.print("\n");
	}
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		L = a.length();
		int s;
		int i;
		int j;
		for (s = 2;s <= L;s++)
		{
			for (i = 0;i <= L - s;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
				char * p = a.charAt(i);
				for (j = 0;j < s;j++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, *p);
					p++;
				}
				check(b);
			}
		}

		return 0;
	}

}

