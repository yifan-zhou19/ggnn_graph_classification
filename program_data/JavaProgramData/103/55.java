package <missing>;

public class GlobalMembers
{
	public static void ch(String a)
	{
		  int i;
		  for (i = 0;i < 1000;i++)
		  {
							 if (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0)
							 {
							 a[i] = 'A'-'a' + a[i];
							 }
							 else if (a[i].equals(0))
							 {
							 break;
							 }
		  }
	}
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  int i;
		  int j;
		  int k = 1;
		  int l;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();
		  ch(a);
		  for (i = 0;i < l;i++)
		  {
						  if (a.charAt(i) == a.charAt(i + 1))
						  {
						  k++;
						  }
						  else
						  {
							   System.out.printf("(%c,%d)",a.charAt(i),k);
							   k = 1;
						  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

