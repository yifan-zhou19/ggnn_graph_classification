package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int all;
		int i;
		String str = new String(new char[300]);
		String t = new String(new char[300]);
		str = new Scanner(System.in).nextLine();
		all = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(t, 0, (Character.SIZE / Byte.SIZE));
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
					   t.charAt(str.charAt(i))++;
					   all++;
			}
		}
		if (all == 0)
		{
		   System.out.print("No\n");
		}
		else
		{
			 for (i = 'a'; i <= 'z'; i++)
			 {
				 if (t.charAt(i) > 0)
				 {
					System.out.printf("%c=%d\n", (char)i, t.charAt(i));
				 }
			 }
		}
	}
}
