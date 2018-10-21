package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		 String s = new String(new char[50]);
		 String w = new String(new char[50]);
		 int i;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 s = tempVar.charAt(0);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 w = tempVar2.charAt(0);
		 }

		 for (i = 0;w.charAt(i) != '\0';i++)
		 {
			 if (w.charAt(i) == s.charAt(0))
			 {

				 int n = 0;

				 for (j = 0;s.charAt(j) != '\0';j++)
				 {
					 if (s.charAt(j) != w.charAt(i + j))
					 {
						 n++;
						 break;
					 }
				 }
					 if (n == 0)
					 {
						 System.out.printf("%d",i);
						 break;
					 }
			 }
		 }

	}


}

