package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i = 0;
	   int j = 0;
	   int[] b = new int[26];
	   String a = new String(new char[1000]);
	   String c = new String(new char[26]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   for (int k = 0;a.charAt(k) != '\0';k++)
	   {
		   if ((a.charAt(k) >= 'a') && (a.charAt(k) <= 'z'))
		   {
		a.charAt(k) += ('A'-'a');
		   }
	   }
	   for (;a.charAt(i) != '\0';i++)
	   {
		if (a.charAt(i + 1) == a.charAt(i))
		{
		b[j]++;
		}
		else
		{
			c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
		j++;
		}
	   }

		for (int k = 0;k < j;k++)
		{
			System.out.printf("(%c,%d)",c.charAt(k),b[k] + 1);
		}

	}
}

