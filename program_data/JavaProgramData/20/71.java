package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int cha = char array[11];
		int i;
		int j;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		for (i = 0;scanf("%s %s",str,substr) != EOF;i++)
		{
		   for (j = 0;j <= cha(str);j++)
		   {
				System.out.printf("%c",str.charAt(j));
		   }
		   System.out.printf("%s",substr);
		   for (j = j;str.charAt(j) != '\0';j++)
		   {
				System.out.printf("%c",str.charAt(j));
		   }
		   System.out.print("\n");
		}
	}

	public static int cha(String array)
	{
		int i;
		int k = 0;
		for (i = 1; !array[i].equals('\0');i++)
		{
			if (array[k].compareTo(array[i]) < 0)
			{
				k = i;
			}
		}
		return (k);
	}
}
