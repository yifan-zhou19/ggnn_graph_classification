package <missing>;

public class GlobalMembers
{
	public static char fy(char x)
	{
		 char z;
		 switch (x)
		 {
			   case'T':
			   z = 'A';
			   break;
			   case'A':
			   z = 'T';
			   break;
			   case'G':
			   z = 'C';
			   break;
			   case'C':
			   z = 'G';
			   break;
			   default:
				   z = '\0';
		 }
		 return z;
	}
	public static void Main(String[] args)
	{
	  char c;
	  final String a = "";
	  int i;
	  int n;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (j = 1;j <= n;j++)
	  {
	  for (i = 0;i < 255;i++)
	  {
	  a = tangible.StringFunctions.changeCharacter(a, i, '\0');
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = tempVar2.charAt(0);
	  }
	  for (i = 254;i >= 0;i--)
	  {
			 if (a.charAt(i) != '\0')
			 {
				 k = i;
			  break;
			 }
	  }
	  for (i = 0;i < k;i++)
	  {
			 c = fy(a.charAt(i));
		  System.out.printf("%c",c);
	  }
		 c = fy(a.charAt(k));
		 System.out.printf("%c\n",c);
	  }
	}
}

