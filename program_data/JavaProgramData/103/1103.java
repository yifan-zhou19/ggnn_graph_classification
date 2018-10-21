package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static int[] b = new int[1000];
	public static int i;
	public static int j;
	public static int Main()
	{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = tempVar.charAt(0);
		 }
		 for (i = 0;a.charAt(i) != '\0';i++)
		 {
								if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
								{
								a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
								}
		 }
								for (i = 0;a.charAt(i) != '\0';)
								{
									for (j = i;;j++)
									{
									if (a.charAt(j) == a.charAt(i))
									{
								b[i]++;
									}
								if (a.charAt(j) != a.charAt(i))
								{
								break;
								}
									}
								System.out.printf("(%c,%d)",a.charAt(i),b[i]);
								i += b[i];
								}

	return 0;
	}

}

