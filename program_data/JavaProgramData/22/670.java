package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 final String t = "";
	 int i;
	 int j = 1;
	 int c = 0;
	 int a = -100000;
	 int b = -100000;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t = tempVar.charAt(0);
	 }
	 for (i = 0;;i++)
	 {
			if (t.charAt(i) == ',' || t.charAt(i) == '\0')
			{
				if (c > a)
				{
					b = a;
					a = c;
				}
			 if (c < a && c> b)
			 {
				 b = c;
			 }
			}
		 if (t.charAt(i) == ',')
		 {
			 c = 0;
			 continue;
		 }
		 if (t.charAt(i) == '\0')
		 {
			 break;
		 }
		 c = c * 10 + (int)(t.charAt(i) - '0');
	 }
	 if (b == -100000)
	 {
		 System.out.print("No");
	 }
	 else
	 {
		 System.out.printf("%d",b);
	 }
	 return 0;
	}

}

