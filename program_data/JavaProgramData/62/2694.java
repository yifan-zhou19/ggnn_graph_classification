package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		for (int i = 0;i <= l - 1;i++)
		{
			if ((a.charAt(i) == ' ') && (a.charAt(i + 1) == ' '))
			{
				 i++;
				 while ((a.charAt(i) == ' ') && (a.charAt(i + 1) == ' '))
				 {
					 i++;
				 }
				System.out.printf("%c",a.charAt(i));
			}
			 else
			 {
				System.out.printf("%c",a.charAt(i));
			 }
		}
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		return 0;
	}


}

