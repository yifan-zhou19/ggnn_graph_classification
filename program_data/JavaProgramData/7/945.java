package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[257]);
		String son = new String(new char[257]);
		String re = new String(new char[357]);
		String fu = new String(new char[257]);
		int i;
		int len;
		int slen;
		int k;
		int t = 0;
		zfc = new Scanner(System.in).nextLine();
		son = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		len = zfc.length();
		slen = son.length();
		for (i = 0;i <= len - slen;i++)
		{
			for (k = i;k < i + slen;k++)
			{
				 fu = tangible.StringFunctions.changeCharacter(fu, k - i, zfc.charAt(k));
			}
			fu = tangible.StringFunctions.changeCharacter(fu, slen, '\0');
			if (strcmp(fu,son) == 0)
			{
				 for (k = 0;k < i;k++)
				 {
					System.out.printf("%c",zfc.charAt(k));
				 }
				 System.out.printf("%s",re);
				 for (k = i + slen;k < len;k++)
				 {
					 System.out.printf("%c",zfc.charAt(k));
				 }
				 t = 1;
			}
			if (t == 1)
			{
				 break;
			}
		}
		if (t == 0)
		{
				System.out.printf("%s",zfc);
		}
		return 0;
	}







}

