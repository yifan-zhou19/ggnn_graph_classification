package <missing>;

public class GlobalMembers
{
	public static char m;
	public static char f;
	public static char flag;

	public static void paidui(tangible.RefObject<String> p, int n)
	{
		int i;

		for (i = 1; p.argValue.charAt(n + i) != '\0'; i++)
		{
			if (p.argValue.charAt(n + i) == m)
			{
				paidui(p, n + i);
			}
			else
			{
				if (p.argValue.charAt(n + i) == f)
				{
					p.argValue.charAt(n) = flag;
					p.argValue.charAt(n + i) = flag;
					System.out.print(n);
					System.out.print(" ");
					System.out.print((n + i));
					System.out.print("\n");
					return;
				}
			}
		}
	}


	public static int Main()
	{

		 String str = new String(new char[100]);
		 str = ConsoleInput.readToWhiteSpace(true).charAt(0);

		 m = str.charAt(0);

		 int i = 0;
		 while (str.charAt(i) == m)
		 {
			 i++;
		 }
		 f = str.charAt(i);
		 for (i = 'A' ; i <= 'z'; i++)
		 {
			 if (i != m && i != f)
			 {
				 flag = i;
				 break;
			 }
		 }
	 tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
		 paidui(tempRef_str, 0);
		 str = tempRef_str.argValue;
		 return 0;
	}

}

