package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[260]);
		  String b = new String(new char[260]);
		  String c = new String(new char[260]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  c = tempVar3.charAt(0);
		  }
		  int len1 = a.length();
		  int len2 = b.length();
		  int len3 = c.length();
		  int i;
		  int j;
		  int length;
		  for (i = 0;i < len1;i++)
		  {
			  length = 0;
			  for (j = 0;j < len2;j++)
			  {
				  if (a.charAt(i + j) == b.charAt(j))
				  {
					  length = length + 1;
				  }
			  }
			  if (length == len2)
			  {
				  for (j = 0;j < i;j++)
				  {
					  System.out.printf("%c",a.charAt(j));
				  }
				  for (j = 0;j < len3;j++)
				  {
					  System.out.printf("%c",c.charAt(j));
				  }
				  for (j = i + len3;j < len1;j++)
				  {
					  System.out.printf("%c",a.charAt(j));
				  }
				  System.out.print("\n");
				  break;
			  }
		  }
		  if (length != len2)
		  {
			  System.out.printf("%s\n",a);
		  }
	}
}

