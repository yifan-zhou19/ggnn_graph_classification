package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int[] a = new int[1000];
		int l;
		int count = 0;
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
						if (s.charAt(i) != ' ')
						{
						a[i] = 1;
						}
		}
	   i = 0;
	   while (i < l)
	   {
		if (a[i] == 0)
		{
		count++;
		}
		if (a[i] == 1 && count != 0)
		{
		   for (j = i + 1 - count;j < l + 1 - count;j++)
		   {
										   s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + count - 1));
										   a[j] = a[j + count - 1];
		   }
		   l = l - count + 1;
			 i = i - count + 1;
			 count = 0;
		}

		i++;
	   }
		for (i = 0;i < l;i++)
		{
		System.out.printf("%c",s.charAt(i));
		}
		System.in.read();
		System.in.read();
	}
}

