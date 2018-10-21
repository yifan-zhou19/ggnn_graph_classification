package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len = 0;
		int len1 = 0;
		int len2 = 100;
		int n;
		int i;
	   String max = new String(new char[30]);
	   String min = new String(new char[30]);
	   String temp = new String(new char[30]);
	   char c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   System.in.read();
	   for (i = 0;i < n;)
	   {
			  c = System.in.read();
	   if (c != ' ' && c != '\n')
	   {
		   temp = tangible.StringFunctions.changeCharacter(temp, len, c,len++);
	   }
	   else
	   {
		   temp = tangible.StringFunctions.changeCharacter(temp, len, '\0');
		   if (len > len1)
		   {
			   max = temp;
			   len1 = len;
		   }
	   if (len < len2)
	   {
		   min = temp;
		   len2 = len;
	   }
	   len = 0;
	   i++;
	   }
	   }
	   System.out.println(max);
	   System.out.println(min);
	   return 0;
	}
}

