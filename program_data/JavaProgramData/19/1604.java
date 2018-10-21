package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int j = 0;
	  char x;
	  char y;
	  char z;
	  char m = 0;
	  String a = new String(new char[100]);
	  char[][] b = new char[100][100];
	  String c = new String(new char[100]);
	  String d = new String(new char[100]);
	  a = new Scanner(System.in).nextLine();
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  c = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  d = tempVar2.charAt(0);
	  }
	  n = a.length();
	  for (i = 0;i < n;i++)
	  {
		if (a.charAt(i) == ' ')
		{
			j++;
			m = 0;
		}
		else
		{
			b[j][m] = a.charAt(i);
			m++;
		}
	  }
	  for (i = 0;i < j + 1;i++)
	  {
		  if (strcmp(b[i],c) == 0)
		  {
			  b[i] = d;
		  }
	  }
	  for (i = 0;i < j;i++)
	  {
	   System.out.printf("%s ",b[i]);
	  }
	   System.out.printf("%s",b[i]);

	}
}

