package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[100]);
	   String b = new String(new char[100]);
		  int len1;
		  int len2;
		  int i;
		  int j;
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
		  len1 = a.length();
		  len2 = b.length();
		  for (i = 0;i <= len2 - len1;i++)
		  {
			  for (j = i;j < i + len1 - 1;j++)
			  {
				  if (b.charAt(j) == a.charAt(j - i))
				  {
					  continue;
				  }
				  else
				  {
					  break;
				  }
			  }
				if (j == i + len1 - 1)
				{
					System.out.printf("%d",i);
					break;
				}
		  }
		return 0;
	}


}

