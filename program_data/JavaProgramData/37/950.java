package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int i;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < t;i++)
		  {
			  int j;
			  int c = 0;
			  int[] lt = new int[26];
			  final String a = "";
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = tempVar2.charAt(0);
			  }
			  for (j = 0;a.charAt(j) != '\0';j++)
			  {
				 lt[a.charAt(j) - 'a']++;
			  }
			  for (j = 0;a.charAt(j) != '\0';j++)
			  {
				  if (lt[a.charAt(j) - 'a'] == 1)
				  {
					  System.out.printf("%c\n",a.charAt(j));
					  c++;
					  break;
				  }
			  }
			  if (c == 0)
			  {
				  System.out.print("no\n");
			  }
		  }
	}


}

