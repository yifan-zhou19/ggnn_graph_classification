package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[101]);
		final String fri = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pca;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pcb;
		int n;
		int i;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		if (n >= 2 && n <= 100)
		{
			for (pca = str, pcb = str.Substring(1), i = 0; pca < (str.Substring(n) - 1); pca++, pcb++, i++)
			{
				fri = tangible.StringFunctions.changeCharacter(fri, i, *pca + *pcb);
			}
			fri = tangible.StringFunctions.changeCharacter(fri, n - 1, str.charAt(0) + str.charAt(n - 1));
			System.out.printf("%s\n",fri);
		}
	}
}

