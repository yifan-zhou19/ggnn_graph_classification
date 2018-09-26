package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String word = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(word,'\0',(Character.SIZE / Byte.SIZE));
			p = word;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			len = word.length();
			p = p + len - 2;
			if (*p == 'e')
			{
				*p = '\0';
				System.out.printf("%s\n",word);
			}
			else if (*p == 'l')
			{
				*p = '\0';
				System.out.printf("%s\n",word);
			}
			else
			{
				*(p - 1) = '\0';
				System.out.printf("%s\n",word);
			}
		}

	}
}

