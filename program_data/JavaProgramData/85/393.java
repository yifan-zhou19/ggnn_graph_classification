package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  char[][] ch = new char[MAX][50];
	  char tmp;
	  int n;
	  int i = 0;
	  int j = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ch[i] = tempVar2.charAt(0);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
			tmp = ch[i][0];
		 if ((tmp >= 'A' && tmp <= 'Z') || (tmp >= 'a' && tmp <= 'z') || (tmp == '_'))
		 {
			 ;
		 }
		 else
		 {
	  System.out.print("no\n");
	  continue;
		 }
		 j = 1;
		 while (ch[i][j] != '\0')
		 {
			   tmp = ch[i][j];
	  if ((tmp >= 'A' && tmp <= 'Z') || (tmp >= 'a' && tmp <= 'z') || (tmp == '_') || (tmp >= '0' && tmp <= '9'))
	  {
		  ;
	  }
	  else
	  {
		  System.out.print("no\n");
		  break;
	  }
	  j++;
		 }
		 if (ch[i][j] == '\0')
		 {
			 System.out.print("yes\n");
		 }
	  }
	}
}

