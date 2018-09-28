package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag;
		int t;
		  String s = new String(new char[10000]);
		  char cc;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar2 != null)
		  {
			  cc = tempVar2.charAt(0);
		  }
		  for (t = 0;t < n;t++)
		  {
			  s = new Scanner(System.in).nextLine();
			  for (i = 0;s.charAt(i) != '\0';i++)
			  {
				   flag = 0;
				 for (j = 0;s.charAt(j) != '\0';j++)
				 {
					if ((s.charAt(i) == s.charAt(j)) && (i != j))
					{
					flag = 1;
					break;
					}
				 }
				 if (flag == 0)
				 {
					 System.out.printf("%c\n",s.charAt(i));
					 break;
				 }
			  }
			   if (s.charAt(i) == '\0')
			   {
				   System.out.print("no\n");
			   }
		  }
	}

}

