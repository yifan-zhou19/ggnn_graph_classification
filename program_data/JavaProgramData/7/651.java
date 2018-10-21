package <missing>;

public class GlobalMembers
{
	public static void adds(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		int len_a = a.argValue.length();
		int len_b = b.argValue.length();
		int i;
		for (i = len_a; i <= len_a + len_b - 1; i++)
		{
			*(a.argValue.Substring(i)) = *(b.argValue.Substring(i) - len_a);
		}
		*(a.argValue.Substring(len_a) + len_b) = '\0';
	}
	public static void addc(tangible.RefObject<String> a, char c)
	{
		int len_a = a.argValue.length();
		*(a.argValue.Substring(len_a)) = c;
		*(a.argValue.Substring(len_a) + 1) = '\0';
	}
	public static int Main()
	{
		String s = new String(new char[256]);
		String subs = new String(new char[256]);
		String replace = new String(new char[256]);
		final String result = "";
		s = new Scanner(System.in).nextLine();
		subs = new Scanner(System.in).nextLine();
		replace = new Scanner(System.in).nextLine();

		int len_s = s.length();
		int len_subs = subs.length();
		int len_replace = replace.length();
		int i;
		int j = 0;
			  int finish = 0;
		for (i = 0; i < len_s; i++)
		{
		   if (s.charAt(i) == subs.charAt(j) && finish == 0)
		   {
			   if (j == len_subs - 1)
			   {
			   tangible.RefObject<String> tempRef_result = new tangible.RefObject<String>(result);
			   tangible.RefObject<String> tempRef_replace = new tangible.RefObject<String>(replace);
				   adds(tempRef_result, tempRef_replace);
				   replace = tempRef_replace.argValue;
				   result = tempRef_result.argValue;
				   j = 0;
									  finish = 1;

			   }
			   else
			   {
				   j++;
			   }
		   }
		   else
		   {
			   i -= j;
			   j = 0;
		   tangible.RefObject<String> tempRef_result2 = new tangible.RefObject<String>(result);
			   addc(tempRef_result2, s.charAt(i));
			   result = tempRef_result2.argValue;
		   }
		}
		System.out.printf("%s\n",result);

		return 0;
	}

}

