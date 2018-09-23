package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[200]);
		int leftpos;
		int mark;
		while (scanf("%s",String) == 1)
		{
			System.out.printf("%s\n",String);
			leftpos = -1;
			mark = 0;
			while (mark != String.length())
			{
				if (String[mark] == '(')
				{
					leftpos = mark;
				}
				else if (String[mark] == ')' && leftpos != -1)
				{
					String[mark] = ' ';
					String[leftpos] = ' ';
					mark = -1;
					leftpos = -1;
				}
				mark++;
			}
			for (mark = 0;mark < String.length();mark++)
			{
				if (String[mark] == '(')
				{
					String[mark] = '$';
				}
				else if (String[mark] == ')')
				{
					String[mark] = '?';
				}
				else
				{
					String[mark] = ' ';
				}
			}
			System.out.printf("%s\n",String);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(String,0,200);
		}
		return 0;
	}

}
