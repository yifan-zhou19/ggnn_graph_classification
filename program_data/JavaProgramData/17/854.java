package <missing>;

public class GlobalMembers
{
	public static void match(tangible.RefObject<String> s)
	{
		int[] a = new int[100];
		int i;
		int j = 0;
		for (i = 0;s.argValue.charAt(i) != '\0';i++)
		{
			if (s.argValue.charAt(i) == '(')
			{
				s.argValue.charAt(i) = '$';
				a[j] = i; //??????a???
				j++;
			}
			else if (s.argValue.charAt(i) == ')')
			{
				if (j > 0) //j>0??????
				{
					s.argValue.charAt(i) = ' ';
					s.argValue.charAt(a[j - 1]) = ' '; //???????????
					j--; //???????
				}
				else
				{
					s.argValue.charAt(i) = '?';
				}
			}
			else
			{
				s.argValue.charAt(i) = ' ';
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		String s = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			System.out.println(s);
		tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
			match(tempRef_s);
			s = tempRef_s.argValue;
			System.out.println(s);
		}
		return 0;
	}
}

