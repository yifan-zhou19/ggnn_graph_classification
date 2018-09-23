package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  char[][] a = new char[100][100];
	  String b = new String(new char[100]);
	  String c = new String(new char[100]);
	  char t;
	  int i;
	  int j;
	  for (i = 0;i <= 100;i++)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = tempVar.charAt(0);
		}
		t = System.in.read();
		if (t != ' ')
		{
		  j = i;
		  break;
		}
	  }
	  b = new Scanner(System.in).nextLine();
	  c = new Scanner(System.in).nextLine();
	  if (strcmp(a[0],b) == 0)
	  {
		  System.out.printf("%s",c);
	  }
		 else
		 {
			 System.out.printf("%s",a[0]);
		 }
	  for (i = 1;i <= j;i++)
	  {
		 if (strcmp(a[i],b) == 0)
		 {
			 System.out.printf(" %s",c);
		 }
		 else
		 {
			 System.out.printf(" %s",a[i]);
		 }
	  }

	  return 0;
	}



}

