package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String str = new String(new char[100]);
	  String p;
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  char[][] s = new char[100][20];
	  int l;
	  int i;
	  int j;
	  int d = 1;
	  int k;
	  str = new Scanner(System.in).nextLine();
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  l = str.length();
	  p = str;
	  for (i = 0,j = 0;;i++,j++)
	  {
	   if (str.charAt(i) == ' ')
	   {
		   break;
	   }
	   else
	   {
		   s[0][j] = str.charAt(i);
	   }
	  }
	  s[0][j] = '\0';
	  for (i = 0;i < l;i++)
	  {
	   if (*(p.Substring(i) - 1) == ' ' && *(p.Substring(i)) != ' ')
	   {
		for (j = 0,k = i;;j++,k++)
		{
		 if (str.charAt(k) == ' ')
		 {
			 break;
		 }
		 else
		 {
			 s[d][j] = (p.Substring(k));
		 }
		}
		s[d][j] = '\0';
		d = d + 1;
	   }
	  }
	  for (i = 0;i < d;i++)
	  {
	   if (strcmp(s[i],a) == 0)
	   {
	   s[i] = b;
	   }
	  }
	  for (i = 0;i < d - 1;i++)
	  {
	  System.out.printf("%s ",s[i]);
	  }
	  System.out.printf("%s",s[d - 1]);
	}
}

