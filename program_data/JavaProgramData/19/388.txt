package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[20][100];
		String sub = new String(new char[100]);
		String subed = new String(new char[100]);
	 String string = new String(new char[500]);
	 int i;
	 int d1 = 0;
	 int d2 = 0;
	 int len;
	 int n = 1;
	 String p = new String(new char[100]);
	 String = new Scanner(System.in).nextLine();
	 len = String.length();
	 for (i = 0, d2 = 0;i < len && d2 < 100;i++, d2++)
	 {
			if (String[i] == ' ')
			{
				words[d1][d2] = '\0';
				d1++;
				n++;
				d2 = 0;
			}
		if (String[i] == ' ')
		{
			continue;
		}
		if (String[i - 1] == ' ')
		{
			d2--;
		}
		words[d1][d2] = string.charAt(i);
	 }
	 words[d1][d2] = '\0';
	 p = words;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 subed = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 sub = tempVar2.charAt(0);
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (strcmp(*(p.Substring(i)),subed) == 0)
		 {
			 *(p.Substring(i)) = sub;
		 }
	 }
	 for (i = 0;i < n - 1;i++)
	 {
		 System.out.printf("%s ",p.Substring(i));
	 }
	 System.out.printf("%s",p.Substring(n) - 1);
	}
}

