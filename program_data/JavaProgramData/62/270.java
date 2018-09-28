package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
		String count = new String(new char[10000]);
		String store = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(count, 0, (Character.SIZE / Byte.SIZE));
		int i = 0;
		while ((str[i] = System.in.read()) != '\n')
		{
		   // ?????????????str[0]????
		   if ((str.charAt(i) != 32) || ((str.charAt(i) == 32) && (str.charAt(i - 1) != 32)))
		   {
			   store = tangible.StringFunctions.changeCharacter(store, i, str.charAt(i));
			   count.charAt(i)++;
			   i++;
		   }
		   if ((str.charAt(i) == 32) && (str.charAt(i - 1) == 32))
		   {
			   count = tangible.StringFunctions.changeCharacter(count, i, 2);
			   i++;
		   }
		}
		i = 0;
		while (count.charAt(i) > 0)
		{
			if (count.charAt(i) == 1)
			{
				System.out.print(str.charAt(i));
			}
			i++;
		}
		return 0;
	}


}

