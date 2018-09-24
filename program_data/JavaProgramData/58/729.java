package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int p = 0;
		String str = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
						p = 0;
						 str = new Scanner(System.in).nextLine();
						 {
						   for (j = 0;str.charAt(j) != '\0';j++)
						   {
						 if (str.charAt(j) != '_' && (str.charAt(j) < 48 || (str.charAt(j)>57 && str.charAt(j) < 65) || (str.charAt(j)>90 && str.charAt(j) < 97) || str.charAt(j)>122))
						 {
							 p = 1;
						 }
						   }
						 }
						 if (p == 0 && ((str.charAt(0) > 64 && str.charAt(0) < 91) || (str.charAt(0)>96 && str.charAt(0) < 123) || str.charAt(0) == '_'))
						 {
							 System.out.print("1\n");
						 }
						 else
						 {
							 System.out.print("0\n");
						 }
		}

						 return 0;
	}

}

