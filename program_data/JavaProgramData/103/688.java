package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		String a = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct comp
	//	{
	//		char letter;
	//		int num;
	//	}
	//	com[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
			com[i].num = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == com[j].letter)
			{
				com[j].num++;
			}
			else
			{
				j++;
				com[j].letter = a.charAt(i);
				com[j].num++;
			}
		}
		for (i = 1;i <= j;i++)
		{
			System.out.printf("(%c,%d)",com[i].letter,com[i].num);
		}
		return 0;
	}
}

