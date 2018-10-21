package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i = 0;
	int j = 0;
	int k = 0;
	int[] s = new int[26];

	String out = new String(new char[1001]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		out = tempVar.charAt(0);
	}
	for (k = 0;k < out.length();)
	{
		if (out.charAt(k) <= 'z' && out.charAt(k) >= 'a')
		{
			out = tangible.StringFunctions.changeCharacter(out, k, out.charAt(k) - 'a'+'A');
		}
		k++;
	}

	for (i = 0;i < out.length();i++)
	{
		   while (out.charAt(i) == out.charAt(i + 1))
		   {
			 j++;
		 i++;
		   }

		System.out.printf("(%c,%d)",out.charAt(i),j + 1);
		j = 0;

	}
	}

}

