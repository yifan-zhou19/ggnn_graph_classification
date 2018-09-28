package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int letters = 0;
		int space = 0;
		String word = new String(new char[41]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		word = (String)malloc((n + 1) * 41 * (Character.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word.Substring(i) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			letters += (word.Substring(i).length());
			if (letters > 80)
			{
				letters = word.Substring(i).length();
				System.out.printf("\n%s",word.Substring(i));
			}
			else if (letters == 80)
			{
				letters = 0;
				System.out.printf(" %s\n",word.Substring(i));
				space = 0;
				letters--;
			}
			else if (space == 0)
			{
				System.out.printf("%s",word.Substring(i));
				space++;
			}
			else
			{
				System.out.printf(" %s",word.Substring(i));
			}
			letters++;
		}
		return 0;
	}
}

