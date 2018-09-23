package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String label = new String(new char[101]);
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{

		int[] pos = new int[101];
		int len = str.length();
		int left = 0;
		int right = 0;
		int pos_i = -1;
		int i;

		for (i = 0;i <= len - 1;i++)
		{
			label = tangible.StringFunctions.changeCharacter(label, i, ' ');
			if (str.charAt(i) == '(')
			{
				left++;
				pos[++pos_i] = i;
			}
			if (str.charAt(i) == ')')
			{
				if (left <= right)
				{
					label = tangible.StringFunctions.changeCharacter(label, i, '?');
				}
				else
				{
					right++;
					pos_i--;
				}
			}
		}
	   if (pos_i >= 0)
	   {
		   for (i = 0;i <= pos_i;i++)
		   {
			   label = tangible.StringFunctions.changeCharacter(label, pos[i], '$');
		   }
	   }
	   label = tangible.StringFunctions.changeCharacter(label, len, '\0');
	   System.out.print(str);
	   System.out.print("\n");
	   System.out.print(label);
	   System.out.print("\n");
		}

	   return 0;
	}
}

