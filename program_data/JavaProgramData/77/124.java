package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int num;
		int[] n = new int[100];
		String kids = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			kids = tempVar.charAt(0);
		}
		num = kids.length();
		for (i = 0;i < num;i++)
		{
			n[i] = i;
		}
		do
		{
			for (i = 0;i < num;i++)
			{
							if ((kids.charAt(i) == '<' && kids.charAt(i + 1) == '>') || (kids.charAt(i) == '(' && kids.charAt(i + 1) == ')') || (kids.charAt(i) == '{' && kids.charAt(i + 1) == '}') || (kids.charAt(i) == '[' && kids.charAt(i + 1) == ']'))
							{
										 System.out.printf("%d %d\n",n[i],n[i + 1]);
										 for (j = i;j < num - 2;j++)
										 {
												 kids = tangible.StringFunctions.changeCharacter(kids, j, kids.charAt(j + 2));
												 n[j] = n[j + 2];
										 }
										 num = num - 2;
										 i = i - 2;
							}
			}
		}while (num != 0);
		return 0;
	}

}

