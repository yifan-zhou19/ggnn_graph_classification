package <missing>;

public class GlobalMembers
{
	public static String my_strrev(tangible.RefObject<String> str)

	{

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * right = str.argValue;

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * left = str.argValue;

	   char ch;

	   while (*right != null)
	   {
		   right++;
	   }

	   right--;

	   while (left < right)

	   {

		   ch = left;

			*left++= *right;

			*right--= ch;

	   }

	   return (str.argValue);

	}
	public static int Main()
	{
		int t;
		int i;
		String str = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		t = 2;
		String subStr = new String(new char[101]);
		String revSubStr = new String(new char[101]);
		while (t <= str.length())
		{
			for (i = 0;i <= str.length() - t;i++)
			{
				subStr = str.substring(i, i + t);
				revSubStr = str.substring(i, i + t);
				subStr = tangible.StringFunctions.changeCharacter(subStr, t, revSubStr[t] = '\0');
			tangible.RefObject<String> tempRef_revSubStr = new tangible.RefObject<String>(revSubStr);
				my_strrev(tempRef_revSubStr);
				revSubStr = tempRef_revSubStr.argValue;
				if (strcmp(subStr,revSubStr) == 0)
				{
					System.out.print(subStr);
					System.out.print("\n");
				}
			}
			t++;
		}

		return 0;
	}
}

